package test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;

public class Client {
    private Socket socket = null;
    
    public void clientStart(String ip, String port){
        System.out.println("Ŭ���̾�Ʈ ���α׷� �۵�.....");
        try {
            socket = new Socket(ip, Integer.parseInt(port));
            
            InetAddress ia = socket.getInetAddress();
            int local_port = socket.getLocalPort();// ���ӿ� ���� PORT
            int server_port = socket.getPort();// ���ӿ� ���� ������ PORT
            String server_ip = ia.getHostAddress(); // ���ӵ� ���� Client IP
            
            System.out.print("Ŭ���̾�Ʈ ����-Local Port: "+ local_port);
            System.out.print(" Server IP: " + server_ip);
            System.out.println(" Server PORT: " + server_port);            
            
            //�����͸� �о���� ������
            ChatClientReadHandler read = new ChatClientReadHandler(socket);
            read.start();
            //�����͸� ������ ������
            ChatClientSendHandler send = new ChatClientSendHandler(socket);
            send.start();
            
        } catch(IOException ioe) {
            System.err.println("������ �Ǿ� ���� �ʽ��ϴ�.");
        } finally {
            try {
                if(socket == null){
                    socket.close();                    
                }
            } catch(IOException ignored) {}
        }
       
    }

    public static void main(String[] args) {
        Client cc = new Client();
        cc.clientStart("203.236.209.219", "3000"); // ip, port
    }
}