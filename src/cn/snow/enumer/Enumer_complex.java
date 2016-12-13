package cn.snow.enumer;

import org.junit.Test;

public class Enumer_complex {
	
	@Test
	public void test(){
		print(Grade_com.B);
	}
	
	private void print(Grade_com g){
		String value = g.localValue();
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
enum Grade_com{  //class A 100-90 优  B 89-80 良  C 79-70 一般  D 69-60 差 E 59-0 不及格
	A("100-90"){
		public String localValue(){
			return "优";
		}
	}
	,B("89-80"){
		public String localValue(){
			return "良";
		}
	}
	,C("79-70"){
		public String localValue(){
			return "中";
		}
	}
	,D("69-60"){
		public String localValue(){
			return "差";
		}
	}
	,E("59-0"){
		public String localValue(){
			return "不及格";
		}
	}
	;//Object
	
	private String value;
	private Grade_com(String value){
		this.value = value;
	}
	
	public String getValue(){
		return this.value;
	}
	
	public abstract String localValue();

}