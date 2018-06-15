package com.bit.pm;
// 직접만든 에러클래스
class MyErr extends Exception{
	public MyErr(){
		super("2~9사이 값이 아님");
	}
}

public class Ex05 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws MyErr {
		
		int su=0;
		try{
		gugudan(su);
		}catch(MyErr ex){
//			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}
		

	}

	public static void gugudan(int su) throws MyErr{
		if(su>1 && su<10){
			for(int i=1;i<10;i++){
				System.out.println(su+"x"+i+"="+(su*i));
			}			
		}else{
			MyErr err=new MyErr();
			throw err;
		}
	}
	
}
