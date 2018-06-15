package com.net.udp01;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Node02 {

	
	public static void main(String[] args) {
		DatagramSocket ds=null;
		DatagramPacket dp=null;
		byte[] buf=new byte[10];
		try {
			ds=new DatagramSocket(3000);
			dp=new DatagramPacket(buf, buf.length);
			ds.receive(dp);
			System.out.println("전달받은 메세지: "+new String(dp.getData()));
			ds.receive(dp);
			System.out.println("전달받은 메세지: "+new String(dp.getData()));
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			ds.close();
		}
		
		
		
	}

}
