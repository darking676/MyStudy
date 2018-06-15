package test;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;


class ChatServerSendHandler extends Thread{
    private Socket socket;
    private BufferedWriter writer;
    private BufferedReader in;           
    private String s="";

    public ChatServerSendHandler() {
        System.out.println("���α׷��� �ʱ�ȭ ���� �ʾҽ��ϴ�.");
    }
    
    public ChatServerSendHandler(Socket socket) {
        this.socket = socket;
        try{
            //��Ʈ������ ���� ��� ��ü
            writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            // Ű����κ��� �Է� ��ü
            in = new BufferedReader(new InputStreamReader(System.in));
        } catch (Exception e) {
            System.err.println("������ �Ǿ� ���� �ʽ��ϴ�.");
        }   
    }

    public void run() {
        try {
            while(true) {
                System.out.print("�� ");
                s = in.readLine(); //Ű����κ��� �Է� ���
                if(s.equals("999")){
                    break; //�����ڵ�
                }
                writer.write("�� " + s);
                writer.newLine();  //�ٹٲ� ��ȣ�� �־�� BufferedReader�� readLine()�� �ν���
                writer.flush();    //client�� ����

                //System.out.println("���� ��:" + s);//�Է¹��� ���� ���
            }
        } catch(Exception ignored) {

        } finally {
            try {
                socket.close();
            } catch(IOException ignored) {}
        }
    }

}