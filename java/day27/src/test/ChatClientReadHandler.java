package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

class ChatClientReadHandler extends Thread{
    private Socket socket;
    private String line;   //�����κ��� �о�� ���ڿ� ����   

    public ChatClientReadHandler() {
        System.out.println("���α׷��� �ʱ�ȭ ���� �ʾҽ��ϴ�.");
    }
    
    public ChatClientReadHandler(Socket socket) {
        this.socket = socket;  
    }

    public void run() {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            while(true){
                // ��Ʈ������ ���� ����
                line = reader.readLine();
                
                if (line == null){ 
                    break;
                }
                
                // ȭ�� ���
                System.out.println("\n" + line);
                System.out.print("�� ");
            }
        } catch(IOException ignored) {
            System.err.println("������ �Ǿ� ���� �ʽ��ϴ�.");
        } finally {
            try {
                socket.close();
            } catch(IOException ignored) {}
        }
    }

}