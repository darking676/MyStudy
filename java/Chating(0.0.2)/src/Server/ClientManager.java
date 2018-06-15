package Server;

import java.awt.PageAttributes;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientManager extends Thread{//�����ڵ��� �޾Ƽ� �����ϴ� �Ŵ���Ŭ����
	public Socket sock=null;// ���� ����
	public String id;//id ����
	BufferedReader br=null;//���� ����
	public int cnt;
	public ClientManager(Socket sock,int cnt){//����Ŭ�������� �Ŵ����� �����Ͽ� �Ѱ��ִ� ������ �����ڷ� �޴¹�
		this.sock=sock;
		this.cnt=cnt;
	}
	@Override
	public void run() {//�����尡 ���۵Ǹ� ����Ǵ� �޼���
		try {
			br=new BufferedReader(new InputStreamReader(sock.getInputStream()));//������ ���� �������� input���� �޴� ����
			String msg;//�޴� �޼������� ������ msg
			
			while(true){
				msg=br.readLine();//������ ���� ���� �����͸� ���ۿ� �����ߴٰ� �ٽ� msg�� ����
				if(msg==null){//msg�� null�̸� �ش� ���Ͽ��� ���� �����ڰ� ���α׷� ����
					System.out.println(id+"���� �����̽��ϴ�");//���Ṯ�� ���
					for (int i = 0; i < Server.list.size(); i++) {//������ �ִ� �����ڸ���Ʈ�� �ش� �����ڰ� �����ߴٰ� �˸��� for��
						Server.list.get(i).println(id+"���� �����̽��ϴ�");
						Server.list.get(i).flush();
					}
					break;
				}
				System.out.println(msg);
				String[] ids=msg.split("ID");//�����ڸ���Ʈ�� ������ ����ϴ� id���� ��
				if(ids.length==2&&ids[0].equals("id")){//�����ڸ���Ʈ�� ������ ����Ǵ� if ��
					id=ids[1];//�����ڸ���Ʈ�� [0]=id [1]�ش� ���̵�� ����Ǿ�����
//					������ [1]�� ���̵� ����id�� �����Ͽ� ���
					for (int i = 0; i < Server.list.size(); i++) {//������ �����ڸ���Ʈ�� ������ �˸�
						Server.list.get(i).println(id+"���� �����ϼ̽��ϴ�"+"����1");
						Server.list.get(i).flush();	
					}
//					Server.idList.add(cnt, id);
					continue;//������ ���� ������ ���� �޼��� ��¹��� �н��ϱ����� ���
				}
				
				
//				for (int i = 0; i < Server.list.size(); i++) {//���� ���ӹ� ����� ���� ������ ����Ǵ� �⺻�޼��� ��¹�
//					Server.list.get(i).println("!@"+id+">"+msg);//������ �����ڸ���Ʈ�� id�� �޼����� ����
//					Server.list.get(i).flush();
//				}
				for (int i = 0; i < Server.list.size(); i++) {
					Server.list.get(i).println(msg);
					Server.list.get(i).flush();
				}
				
				Server.list.remove(new PrintWriter(sock.getOutputStream()));//������ �����ϸ� ���� �����ڸ���Ʈ���� ������
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
