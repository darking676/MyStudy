
public class day30 {

	/*�ǹؿ� db��ɾ� ����
	 * db�� �ڹٿ� ����
	 * ������Ʈ �����ÿ� next ���̺귯���� external jar�� 
	 * C:\oraclexe\app\oracle\product\10.2.0\server\jdbc\lib �ش��ּҿ� �ִ�
	 * ojdbc14.jar �� �����Ѵ�.
	 * 
	 * 
	 * //oracle: jdbc:oracle:thin:@ip�ּ�:��������Ʈ:sid
		//mysql:  jdbc:mysql://ip�ּ�:3306/
		//java db: jdbc:derby:testdb;create=true
		String url="jdbc:oracle:thin:@localhost:1521:xe";
	 * 
		package com.test.ora;
		
		import java.awt.BorderLayout;
		import java.awt.Button;
		import java.awt.Choice;
		import java.awt.Frame;
		import java.awt.GridLayout;
		import java.awt.Label;
		import java.awt.Panel;
		import java.awt.TextField;
		import java.awt.event.ActionEvent;
		import java.awt.event.ActionListener;
		import java.awt.event.WindowAdapter;
		import java.awt.event.WindowEvent;
		import java.lang.Thread.State;
		import java.sql.Connection;
		import java.sql.DriverManager;
		import java.sql.ResultSet;
		import java.sql.SQLException;
		import java.sql.Statement;
		import java.util.Arrays;
		import java.util.Properties;
		
		import oracle.jdbc.driver.OracleDriver;
		
		public class Ex01 extends Frame implements ActionListener{
			Choice cho=new Choice();
			Button btn1;
			Button btn2;
			Button btn3;
			Button btn4;
			Properties info=new Properties();
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			Label[] vls;
			TextField[] tfs;
			
			public Ex01(){
				super("�л������������α׷�(ver.0.5.0)");
				addWindowListener(new WindowAdapter() {
					public void windowClosing(WindowEvent e) {
						dispose();
					}
				});
				
				OracleDriver ora=new OracleDriver();
				info.put("user","scott");
				info.put("password","tiger");
				
				String sql="SELECT NUM FROM STUDENT ORDER BY NUM";
				Connection conn=null;
				Statement stmt=null;
				ResultSet rs=null;
				try {
					conn=DriverManager.getConnection(url,info);
					stmt=conn.createStatement();
					rs=stmt.executeQuery(sql);
					
					while(rs.next()){
						int su=rs.getInt(1);
						cho.addItem(su+"");
					}
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}finally{
					try {
						if(rs!=null){rs.close();}
						if(stmt!=null){stmt.close();}
						if(conn!=null){conn.close();}
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				setLayout(new BorderLayout());
				Panel top=new Panel();
				btn1=new Button("����");
				btn2=new Button("����");
				btn3=new Button("�Է�");
				
				btn1.addActionListener(this);
				btn2.addActionListener(this);
				btn3.addActionListener(this);
				
				top.add(cho);
				top.add(btn1);
				top.add(btn3);
				top.add(btn2);
		
				Panel center=new Panel(new GridLayout(6,2));
				Label[] lbs=new Label[6];
				vls=new Label[6];
				tfs=new TextField[5];
				
				String[] msg={"�й�","�̸�","����","����","����","�հ�"};
				for (int i = 0; i < lbs.length; i++) {
					lbs[i]=new Label(msg[i]);
					lbs[i].setAlignment(Label.CENTER);
					vls[i]=new Label();
					if(i==5){break;}
					tfs[i]=new TextField(15);
				}
				Panel[] ps=new Panel[6];
				for (int i = 0; i < 6; i++) {
					ps[i]=new Panel();
				}
				for (int i = 0; i < 6; i++) {
					ps[i].add(vls[i]);
					if(i==5){
						btn4=new Button("�Է�");
						btn4.addActionListener(this);
						ps[i].add(btn4);
						btn4.setVisible(false);
					}else{
					ps[i].add(tfs[i]);
					tfs[i].setVisible(false);
					}
				}
				for (int i = 0; i < 6; i++) {
					center.add(lbs[i]);
					center.add(ps[i]);
				}
				
				add(center,BorderLayout.CENTER);
				add(top,BorderLayout.NORTH);		
				setBounds(900,100,400,500);
				setVisible(true);
			}
			public static void main(String[] args) {
				new Ex01();
			}
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btn2){
					dispose();
				}else if(e.getSource()==btn1){
					for (int i = 0; i < 5; i++) {
						tfs[i].setVisible(false);
						vls[i].setVisible(true);
					}
					vls[5].setVisible(true);
					btn4.setVisible(false);
					System.out.println(cho.getSelectedItem()+"����");
					OracleDriver ora=new OracleDriver();
					Connection conn=null;
					Statement stmt=null;
					ResultSet rs=null;
					try {
						conn=DriverManager.getConnection(url,info);
						stmt=conn.createStatement();
						rs=stmt.executeQuery("select * from student where num="+cho.getSelectedItem());
						
						if(rs.next()){
							int num=rs.getInt(1);
							String name=rs.getString(2);
							int kor=rs.getInt(3);
							int eng=rs.getInt(4);
							int math=rs.getInt(5);
							int tot=kor+eng+math;
							vls[0].setText(num+"");
							vls[1].setText(name);
							vls[2].setText(kor+"");
							vls[3].setText(eng+"");
							vls[4].setText(math+"");
							vls[5].setText(tot+"");
							vls[0].revalidate();
							vls[1].revalidate();
							vls[2].revalidate();
							vls[3].revalidate();
							vls[4].revalidate();
							vls[5].revalidate();
						}
						
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}finally{
						try {
							if(rs!=null){rs.close();}
							if(stmt!=null){stmt.close();}
							if(conn!=null){conn.close();}
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}
					
				}else if(e.getSource()==btn3){
					for (int i = 0; i < tfs.length; i++) {
						vls[i].setVisible(false);
						tfs[i].setVisible(true);
						tfs[i].revalidate();
					}
					vls[5].setVisible(false);
					btn4.setVisible(true);
					btn4.revalidate();
				}else if(e.getSource()==btn4){
					//insert into student values(18004,'test',69,68,67);
					String sql="insert into student values("+tfs[0].getText()+",'"+
					tfs[1].getText()+"',"+tfs[2].getText()+","+tfs[3].getText()+","+tfs[4].getText()+");";
					System.out.println(sql);
					OracleDriver ora=new OracleDriver();
					Connection conn=null;
					Statement stmt=null;
					try {
						conn=DriverManager.getConnection(url,info);
						stmt=conn.createStatement();
						int result=stmt.executeUpdate(sql);
						System.out.println(result+"���� ���� ������Ʈ");
						if(result>0){
							cho.addItem(tfs[0].getText());
						}
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}finally{
						try {
							stmt.close();
							conn.close();
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}
				}
			}
		
		}

	 * 
	 * 
	 * cmd db�� ����
	 * edit ex02.sql �� �ؽ�Ʈ���Ϸ� ����
	 * ed ex02.sql �� ����
	 * start ex02.sql �� ����
	 * @ ex02.sql �� ����
	 * save ex02.sql �� ������ ���� ���尡��
	 * get ex04.sql; ������ ���� ���� ��ȸ
	 * spool �����̸�
	 * spool off �� ���̿� �ۼ��� ���� ����
	 * 
	 * run �� �ٷ����� �ߴ� ���� �����
	 *   /    �ٷ����� �ߴ� ���� �����
	 * list   �������� ������ ���� ���
	 * li     �������� ������ ���� ���
	 * 
	 * create table ex02(
		num number,
		name varchar2(30)
		);
	 * 
	 * 
	 * 
	 * drop table ex03;
		create table ex03(
		num number,
		name varchar2(30)
		);
		insert into ex03 values(1,'test1');
		insert into ex03 values(2,'test2');
		insert into ex03 values(3,'test3');
		insert into ex03 values(4,'test4');
		insert into ex03 values(5,'test5');
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 	 * cmd db�� ����
	 * edit ex02.sql �� �ؽ�Ʈ���Ϸ� ����
	 * ed ex02.sql �� ����
	 * start ex02.sql �� ����
	 * @ ex02.sql �� ����
	 * save ex02.sql �� ������ ���� ���尡��
	 * get ex04.sql; ������ ���� ���� ��ȸ
	 * spool �����̸�
	 * spool off �� ���̿� �ۼ��� ���� ����
	 * column �÷Ÿ� format A10; ���̴� �÷������ ����
	 * column num foramt 9,999,999,999;
	 * set heading off ���� ��������
	 * 
	 * select sum(sal) from emp;
	 * select avg(sal) from emp;
	 * select max(sal) from emp;
	 * select min(sal) from emp;
	 * 
	 * select sum(sal) as �� from emp where ename like '%A%';
	 * select sum(sal) from emp group by deptno;
	 * select deptno,sum(sal) from emp where ename like '%A%' group by deptno;
	 * select deptno,sum(sal),count(sal) from emp group by deptno;
	 * select deptno,sum(sal),count(sal) from emp where sal<1800 group by deptno;
	 * select deptno,sum(sal),count(sal) from emp group by deptno having avg(sal)<1800;
	 * 
	 * select ename,sal,comm,sal+comm as ���� from emp;
	 * ����
	 * select �ƹ��ų� from dual;
	 * select '���ó�¥�� '||sysdate||'�Դϴ�'from dual;    || ���꿬����
	 * select round(3.14) from dual;
	 * select floor(3.14) from dual;
	 * select 5/2,floor(5/2),mod(5,2) from dual;
	 * select round(3.14,1) from dual; �ι�° ���ڴ� �Ҽ����ڸ���
	 * select trunc(5678.5678,2) from dual;
	 * select trunc(5678.5678,-2) from dual;
	 * select lower('ABCDE') from dual;
	 * select upper('ABCDE') from dual;
	 * select concat('java','oracle') from dual;
	 * select lengh('�ѱ�') from dual;
	 * select lenghB('�ѱ�') from dual;
	 * select substr('JavaDbWebFramework',4,2) from dual; /Db
	 * select substrb('JavaDbWebFramework',4,2) from dual; /Db
	 * select substr('�ڹٵ����',3,2) from dual; /���
	 * select substrb('�ڹٵ����',7,6) from dual; /��� �ѱ� byte�� 3��
	 * select instr('abcdef','bc')from dual; ��ġ ã��
	 * select instrB('abcdef','bc')from dual; ��ġ ã��
	 * select instr('�ڹٵ����','���')from dual; ��ġ ã��
	 * select instrb('�ڹٵ����','���')from dual; ��ġ ã��
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
