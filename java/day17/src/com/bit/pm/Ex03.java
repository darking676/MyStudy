package com.bit.pm;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class Lec03{}
public class Ex03 {

	
	public static void main(String[] args) {
		Map<String, Integer> map=new HashMap<String, Integer>();
		map.put("��", 1);
		map.put("��", 2);
		map.put("��", 3);
		map.put("��", 4);
		map.put("��", 5);
		
		Set<String> keys=map.keySet();
		Iterator<String> ite=keys.iterator();
		while(ite.hasNext()){
			String key=ite.next();
			System.out.println(key+" "+map.get(key));
			
		}
		
		
	}

}
