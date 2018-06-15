package test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    
    private Socket socket=null;
    private ServerSocket server = null;
    int connectCount=0;

    public void serverStart(){
        System.out.println("�����ڸ� ��ٸ��� ���Դϴ�.");
        try {
            server = new ServerSocket(2010);
            socket = server.accept();
            
            InetAddress ia = socket.getInetAddress();
            int port = socket.getLocalPort();// ���ӿ� ���� ������ PORT 
            String ip = ia.getHostAddress(); // ���ӵ� ���� Client IP 
            
            ++connectCount;  //�����ڼ� ī��Ʈ
            System.out.print(connectCount);
            System.out.print(" ����-Local Port: "+ port);
            System.out.println(" Client IP: " + ip);
            
            //�����͸� �о���� ������
            ChatServerReadHandler read = new ChatServerReadHandler(socket);
            read.start();
            //�����͸� ������ ������
            ChatServerSendHandler send = new ChatServerSendHandler(socket);
            send.start();
        } catch(IOException ioe) {
            System.err.println("������ �Ǿ� ���� �ʽ��ϴ�.");
        } finally {
            try {
                server.close();
            } catch(IOException ignored) {}
        }
        
    }

    public static void main(String[] args) {
        Server cs = new Server();
        cs.serverStart();
    }
}