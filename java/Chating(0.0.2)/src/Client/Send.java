package Client;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Reader;
import java.net.Socket;

import javax.print.attribute.standard.OutputDeviceAssigned;


public class Send extends Thread{

	public Socket sock;//socket ����
	BufferedReader br;//�۹� ����
	PrintWriter pw;// ����Ʈ ����
	public static String msg;//������ ���� msg
	public Send(Socket sock){//send �����ڷ� sock�� �޾� send Ŭ������ ����
		this.sock=sock;
	}
	
	public void run() {
		
		try {
			br=new BufferedReader(new InputStreamReader(System.in));//br > is > sock.is
			pw=new PrintWriter(sock.getOutputStream());//sock.os�� ���� ������ ��
			
			pw.println("idID"+Client.id);//���� clientmanager���� ���� "idID"+Ŭ���̾�Ʈ���� �Է¹��� id�� ����
			pw.flush();
			
			while(true){//�������� ó���� id�� ������ ���� �����¹��� �ݺ�
				if(msg!=null){
//					br.read();
					System.out.println(msg);
				msg=br.readLine();//ui02���� ������ �ؽ�Ʈ���� �޾� msg�� ����
//				if(msg.equals("exit")){break;} ���� ���� ���Ṯ�� ����
					pw.println(msg);// ���� clientmanager�� ����.
					pw.flush();
				}
				
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				pw.close();//�ݴ¹�
				br.close();
				sock.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}