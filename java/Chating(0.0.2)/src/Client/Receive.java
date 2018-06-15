package Client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class Receive extends Thread{
	public Socket sock;//receive ���� �� sock����
	BufferedReader br;//���ۼ���
	
	
	public Receive(Socket sock){//�����ڿ� �޾ƿ� sock����
		this.sock=sock;
	}
	
	public void run() {
		try {
			br=new BufferedReader(new InputStreamReader(sock.getInputStream()));//br > is > sock.is
			String msg;//���޹��� �ؽ�Ʈ�� ������ smg
			String[] ids;//���޹��� �ؽ�Ʈ�� �����Ͽ� ������ ids�迭
			
			while(true){
				msg=br.readLine();//���޹޾� smg�� ����
				if(msg.contains("���� �����ϼ̽��ϴ�")){//ó���� ����Ǵ� if������ ~���� �����ϼ̽��ϴ� ��� ������ �����ϱ� ����
				}
			
				
//				if(msg.contains("!@")){//clientmanager���� ���޵Ǵ� ������ Ȯ���ϱ� ���� if
//					ids=msg.split("!@"+Client.id+">!@");//ids�迭�� ���޹��� msg�� ��ȣ���� �������� ����
//					//!@ID>!@�����ϰ� ������    msg���� ���޵Ǵ� ������ ����ó�� �Ǿ��ֱ⶧���� ������ ����
//					msg=ids[1];//�׷��� ���ҵǸ� ids[0]=!@ID>!@ ids[1]=�����ϰ�������� ���ҵ�
//					Client.main.texA.append(msg+"\n");//msg�� ����� ids[1]�� �ؽ�Ʈaera�� �߰�
//				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				br.close();
				sock.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	};
}
