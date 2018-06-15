package Client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class Receive extends Thread{
	public Socket sock;
	BufferedReader br;
	Ui02 ui02;
	
	public Receive(Socket sock,Ui02 ui02){//Client���� �����Ҷ� ������
		this.sock=sock;//����
		this.ui02=ui02;//ä�� ui02�� �ּ�
	}
	
	public void run() {
		try {
			br=new BufferedReader(new InputStreamReader(sock.getInputStream()));
			String msg;//���۹޴� ������
			
			while(true){
				msg=br.readLine();//�������� ���۵Ǵ� ����
				ui02.texA.append(msg+"\n");//ä��â�� ���
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
