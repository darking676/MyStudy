package Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Server {//������ �޾� �����ڵ��� �Ѱ��ִ� ����Ŭ����

	public static ArrayList<PrintWriter> list;//�����ڸ�� ����Ʈ����
	public static ArrayList idList;
	
	public static void main(String[] args){
		Socket sock;
		ServerSocket serv = null;
		
		list=new ArrayList<PrintWriter>();//����Ʈ �ʱ�ȭ
		idList=new ArrayList();
		int cnt=0;
		try {
			serv=new ServerSocket(3000);//���� ��Ʈ��ȣ ����
			
			while(true){
				System.out.println("���Ӵ����");
				sock=serv.accept();//���ӹ޴¹�
				System.out.println(sock.getInetAddress());
				ClientManager manage=new ClientManager(sock,cnt);//Ŭ���̾�Ʈ�� �����ϴ� �Ŵ��� ����� �ʱ�ȭ
				list.add(new PrintWriter(sock.getOutputStream()));//������ ������ ������ ��Ͽ� �߰�
				manage.start();//�����ڸ� �����ϴ� �Ŵ��� ������ ����
				System.out.println("���ӿϷ�");
				cnt++;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				serv.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}


