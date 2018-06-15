package com.bit.test;

import java.sql.SQLException;
import java.util.List;

import com.bit.model.GuestDao;
import com.bit.model.entity.GuestVo;

public class DaoTest {
	public static void main(String[] args){
		GuestVo testBean=new GuestVo(9999,"test",null,1000);
		GuestVo editBean=new GuestVo(9999,"test2",null,2000);
		GuestVo resultBean=null;
		try {
			GuestDao dao=new GuestDao();
			dao.insertOne(testBean);
			System.out.println("�ԷƼ���");
			dao=new GuestDao();
			System.out.println("��"+(testBean.equals(dao.selectOne(testBean.getSabun()))));
			dao=new GuestDao();
			System.out.println("����"+(dao.updateOne(editBean)>0));
			dao=new GuestDao();
			System.out.println("���� :"+dao.delOne(testBean.getSabun()));
			/*List<GuestVo> list=dao.selectAll();
			if(list!=null&&list.size()>0){
				System.out.println("����");
			}else{
				System.out.println("����");
			}
			*/
			/*for(GuestVo bean : list){
				System.out.println(bean);
			}*/
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
