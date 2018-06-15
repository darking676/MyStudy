package server;



import java.io.*;

import java.net.*;

import java.util.*;



class Guest extends Thread {

	String id;//args0 ���� �̸�

	Server server;

	Socket socket;

	BufferedReader br;

	BufferedWriter bw;



	Guest(Server server, Socket socket) throws Exception {

		this.server = server;

		this.socket = socket;

		InputStream is = socket.getInputStream();

		InputStreamReader isr = new InputStreamReader(is);

		br = new BufferedReader(isr);



		OutputStream os = socket.getOutputStream();

		OutputStreamWriter osw = new OutputStreamWriter(os);

		bw = new BufferedWriter(osw);

	}



	public void run() {

		try {

			while (true) {

				String line = br.readLine();

				System.out.println(line+"����");

				String array[] = line.split("/");

				switch (array[0]) {

				case "enter":

					id = array[1];

					server.makeGuestlist();

					server.broadcast(line);

					server.makeRoomlist();

					break;

					

				case "msg":

					server.broadcastRoom(array[2], "msg/"+id+"/"+array[3]);

					break;

					

				case "exit":

					//for(int i=0; i<server.list.size(); i++){

					//if(server.list.get(i).id.equals(array[1]))

					//	server.removeGuest(server.list.get(i));

					//}

						server.removeGuest(this);

					String str2 ="exit/"+array[1];

					server.broadcast(str2);

					break;

				case "�ӼӸ�":

					String[] talk=array[1].split("&");

					server.talkMsg(talk[0],talk[1],talk[2]);

					break;

					//talk[0] ������

					//talk[1] �޴³�

					//talk[2] �Ҹ�

					

				case "mkroom" :

					 //������(����);

					server.addRoom(array[1],this);

					server.removeGuest(this);

					server.makeGuestlist();

					server.makeGuestlistRoom(array[1]);

					server.makeRoomlist();

					break;

					

				case "roomjoin" :

					server.removeGuest(this); //���ǿ� �ڱ� ����

					server.makeGuestlist(); // �ٽ� ���� ��� �Ѹ�

					server.addGuestRoom(array[2], this); // �� �濡 �ڱ⸦ ����

					server.makeGuestlistRoom(array[2]); // �濡 ������ �����ڸ���Ʈ ����

					server.makeRoomlist();

					break;

					

				case "roomout" :

					server.removeGuestRoom(array[2], this);

					server.removeRoom(array[2]);

					server.makeGuestlist();

					server.makeRoomlist();

					break;

				}

			}

		} catch (Exception e) {

			// e.printStackTrace();

			

			//server.removeGuest(this);

			try {

				

			} catch (Exception e1) {

				// TODO Auto-generated catch block

				e1.printStackTrace();

			}

		}

	}

	

	public void sendMsg(String msg) throws Exception {

		bw.write(msg + "\n");

		bw.flush();

	}

}