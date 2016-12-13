package cn.snow.enumer;

import org.junit.Test;

public class Enumer_easy {
	
	@Test
	public void test(){
		print(Grade.B);
	}
	
	private void print(Grade g){
		String value = g.getValue();
		System.out.println(value);
	}
}

/*class Grade{
	private Grade(){}
	public static final Grade A = new Grade();
	public static final Grade B = new Grade();
	public static final Grade C = new Grade();
	public static final Grade D = new Grade();
	public static final Grade E = new Grade();	
}*/


//如何定义枚举的构造函数，方法和字段，去封装更多的的信息
enum Grade{  //class A 100-90   B 89-80  C 79-70  D 69-60  E59-0
	A("100-90"),B("89-80"),C("79-70"),D("69-60"),E("59-0");//Object
	
	private String value;
	private Grade(String value){
		this.value = value;
	}
	
	public String getValue(){
		return this.value;
	}
}