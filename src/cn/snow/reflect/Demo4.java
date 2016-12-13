package cn.snow.reflect;

import java.lang.reflect.Field;

import org.junit.Test;

import cn.snow.bean.Person_reflect;

//反射字段
public class Demo4 {
	
	//反射字段：public String name = "aaa"
	@Test
	public void test1() throws Exception{
		Person_reflect p = new Person_reflect();
		Class clazz = Class.forName("cn.snow.bean.Person_reflect");
		Field f = clazz.getField("name");
		
		/*简单写法
		String name = (String) f.get(p);
		System.out.println(name);*/
		
		
		//严谨写法
		//获取字段的值
		Object value = f.get(p);
		//获取字段类型
		Class type = f.getType();
		
		if(type.equals(String.class)){
			String svalue = (String) value;
			System.out.println(svalue);
		}
		
		//设置字段的值
		f.set(p, "xxxxx");
		System.out.println(p.name);
	}
	//反射字段：private int password
	@Test
	public void test2() throws Exception{
		Person_reflect p = new Person_reflect();
		Class clazz = Class.forName("cn.snow.bean.Person_reflect");
		
		Field f = clazz.getDeclaredField("password");
		f.setAccessible(true);
		System.out.println(f.get(p));
	}
	//反射字段：private static int age = 23
	@Test
	public void test3() throws Exception{
		Person_reflect p = new Person_reflect();
		Class clazz = Class.forName("cn.snow.bean.Person_reflect");
		
		Field f = clazz.getDeclaredField("age");
		f.setAccessible(true);
		System.out.println(f.get(p));
	}
}
