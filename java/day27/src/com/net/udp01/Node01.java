package com.net.udp01;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class Node01 {

	public static void main(String[] args) {
		DatagramSocket ds=null;
		DatagramPacket dp=null;
		
		byte[] buf="Hello".getBytes();
		try {
			ds=new DatagramSocket();
			InetAddress addr=InetAddress.getByName("203.236.209.219");
			dp=new DatagramPacket(buf, buf.length,addr,3000);
			ds.send(dp);
			buf="2��°".getBytes();
			dp=new DatagramPacket(buf, buf.length,addr,3000);
			ds.send(dp);
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnknownHostException e) {
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
