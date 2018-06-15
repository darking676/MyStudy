package com;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MultichatServer {
 
	// ��ȭ��, Ŭ���̾�Ʈ OutputStream ����� ��ȭ��(HashMap) ����
	Map<String, DataOutputStream> clients; 
	
	// ������ 
	MultichatServer() { 
		clients = Collections.synchronizedMap(new HashMap<String, DataOutputStream>());
	} 
	
    public void start() {
        ServerSocket serverSocket = null; 
        Socket socket = null; 

        try { 
            // 8998 ��Ʈ�� ���ε��� ���� ���� ���� 
            serverSocket = new ServerSocket(3000);
             System.out.println("���� ���� ... ");
 
            while (true) { 
                // Ŭ���̾�Ʈ ���� ��� accept() 
                socket = serverSocket.accept(); 
                System.out.println("[" + socket.getInetAddress() 
                         + ":" + socket.getPort() + "]" + "���� ����");
 
                // �������� Ŭ���̾�Ʈ�� �޽����� ������ Thread ����
                 ServerReceiver thread = new ServerReceiver(socket);
                 thread.start(); 

            }// while 

        } catch (Exception e) { 
        } 
        
    } // start() 

    // ���� ����
    public static void main(String[] args) {
         new MultichatServer().start();
    } // main()
    
    // �������� Ŭ���̾�Ʈ�� �޽����� ������ Thread 
    class ServerReceiver extends Thread {
           
    	Socket socket; 
        DataInputStream in; 
        DataOutputStream out; 
            

        ServerReceiver(Socket socket) { 
        	this.socket = socket; 
            try { 
                    // Ŭ���̾�Ʈ ���Ͽ��� �����͸� ���Źޱ� ���� InputStream ����
            	in = new DataInputStream(socket.getInputStream());
                      
                    // Ŭ���̾�Ʈ ���Ͽ��� �����͸� �����ϱ� ���� OutputStream ����
                out = new DataOutputStream(socket.getOutputStream());
            } catch (IOException e) {
            	e.printStackTrace();
           	} 
        } 
            

        // ��ȭ�濡 �ִ� ��ü �������� �޽��� ���� 
        void sendToAll(String msg) {
        	
            // ��ȭ�濡 ������ ������ ��ȭ�� ����Ʈ ���� 
        	Iterator<String> it = clients.keySet().iterator(); 

        	while (it.hasNext()) { 
        		try { 
        			String name = it.next(); 
        			DataOutputStream out = clients.get(name); 
        			out.writeUTF(msg); 
        		} catch (IOException e) { 
        		}
        		
        	} // while 
        	
        } // sendToAll 
            
        public void run() {
             String name = ""; 
            try { 
                // ���������� ���ʿ� Ŭ���̾�Ʈ�� ���� ��ȭ���� �޾ƾ� �Ѵ�. 
                 name = in.readUTF(); 
                 
                // ��ȭ���� �޾�, ���� Ŭ���̾�Ʈ���� ��ȭ�� ���� �޽����� ������. 
                 sendToAll("#" + name + "���� �����̽��ϴ�.");
 
                // ��ȭ��, Ŭ���̾�� �޽����� ���� �� �ִ� OutputStream ��ü�� ��ȭ�� Map�� ����
                clients.put(name, out); 
                System.out.println("���� ���������� ���� " + clients.size() + "�Դϴ�.");
                  
                // Ŭ���̾�Ʈ�� ������ �޽����� �޾�, ���� Ŭ���̾�Ʈ���� �޽����� ������. 
                 while (in != null) { 
                    sendToAll(in.readUTF()); 
                    
                }//while  
                 
            } catch (IOException e) { 
            } finally { 
                // finally ����ȴٴ� ���� Ŭ���̾�Ʈ�� �������� ���� �ǹ� 
                 sendToAll("#" + name + "���� �����̽��ϴ�.");
                  
                // ��ȭ�濡�� ��ü ���� 
                clients.remove(name); 
                System.out.println("[" + socket.getInetAddress() //
                         + ":" + socket.getPort() + "]" + "���� ������ �����Ͽ����ϴ�.");
                 System.out.println("���� ���������� ���� " + clients.size() + "�Դϴ�.");
             } // try 
            
        } // run
            
    } // ReceiverThread
    
} // class 

