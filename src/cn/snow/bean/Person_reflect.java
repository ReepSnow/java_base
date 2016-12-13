package cn.snow.bean;

import java.io.InputStream;
import java.util.List;

public class Person_reflect {
	
	public String name="aaaa";
	private int password = 123;
	private static int age = 23;
	public Person_reflect(){
		System.out.println("person");
	}
	
	public Person_reflect(String name){
		System.out.println(name);
	}
	
	public Person_reflect(String name,int password){
		System.out.println(name+":"+password);
	}
	
	public Person_reflect(List list){
		System.out.println("list");
	}
	
	public void aa1(){
		System.out.println("aa1");
	}
	
	public void aa1(String name,int password){
		System.out.println(name+":"+password);
	}
	
	public Class[] aa1(String name,int[] password){
		return new Class[]{String.class};
	}

	public void aa1(InputStream in){
		System.out.println(in);
	}
	
	public static void aa1(int num){
		System.out.println(num);
	}
	
	public static void main(String[] args) {
		System.out.println("main!!!");
	}

	
	
}
