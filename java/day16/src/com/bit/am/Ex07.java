package com.bit.am;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Ex07 {


	public static void main(String[] args) {
		//map Ÿ��(key, value)
		//key- �ߺ�X, value- �ߺ���
		//key- setŸ��
		//
		java.util.HashMap map=null;
		map=new HashMap();
		
		//�߰�
		map.put(1111, 1000);
		map.put(2222, 2000);
		map.put(3333, 3000);
		map.put(4444, 4000);
		map.put("a", 5000);
		map.put(null, 5123);
		map.put('A', 123);
 
		
		//����
		map.put('A', 321);
		map.put(1111, 5000);//Ű�� �ߺ� -> ����
		
		//����
		map.remove("a");
		map.remove('A');
		
		System.out.println("map size:"+map.size());
		System.out.println("����°�"+map.isEmpty());
		System.out.println("value:2000 �� �����ϴ�"+map.containsValue(2000));
		System.out.println("key:2222 �� �����ϴ�"+map.containsKey(2222));
		System.out.println("------------------------");
		Set entry=map.entrySet();
		Iterator ite2= entry.iterator();
		while(ite2.hasNext()){
			Map.Entry ent=(Map.Entry)ite2.next();
			System.out.println("key:"+ent.getKey()+",value:"+ent.getValue());			
		}
		System.out.println("--------------------");
		//����
//		System.out.println(map.get(1111));//key �� ����
//		System.out.println(map.get(2222));
//		System.out.println(map.get(333));
//		System.out.println(map.get(4444));
//		System.out.println(map.get("a"));
//		System.out.println(map.get(null));
		
		java.util.Set keys=map.keySet();
		Iterator ite=keys.iterator();
		while(ite.hasNext()){
			Object key=ite.next();
			System.out.println("key:"+key+",value:"+map.get(key));
		}
		
		
		
		
		
		
		
		
	}

}
