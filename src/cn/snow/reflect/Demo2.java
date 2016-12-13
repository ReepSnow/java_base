package cn.snow.reflect;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import cn.snow.bean.Person_reflect;
/**
 * 
 * 本类主要用来测试getConstructor()，来得到各种构造函数（有参数，无参数）
 * getConstructor()反射类的构造函数，用来构建类的对象
 * newInstance()用来实例化对象
 *	
 */
public class Demo2 {
	
	//反射构造函数：public Person()
	@Test
	public void test1() throws Exception{
		Class clazz = Class.forName("cn.snow.bean.Person_reflect");
		Constructor c =clazz.getConstructor(null);
		Person_reflect p = (Person_reflect) c.newInstance(null);
		System.out.println(p.name);
	}
	
	
	//反射构造函数：public Person(String name)
	@Test
	public void test2() throws Exception{
		Class clazz = Class.forName("cn.snow.bean.Person_reflect");
		
		//构造函数的参数类型必须指定，因为可以存在参数名称相同，类型不同的参数（重载）
		Constructor c = clazz.getConstructor(String.class);
		
		Person_reflect p =(Person_reflect) c.newInstance("xxxxx"); 
		System.out.println(p.name);
	}

	//反射构造函数：public Person(String name,int password)
	@Test
	public void test3() throws Exception{
		Class clazz = Class.forName("cn.snow.bean.Person_reflect");
		Constructor c = clazz.getConstructor(String.class,int.class);
		Person_reflect p = (Person_reflect) c.newInstance("xxxx",12);
		System.out.println(p.name);
	}
	
	//反射构造函数：private Person(List list)
	@Test
	public void test4() throws Exception{
		Class clazz = Class.forName("cn.snow.bean.Person_reflect");
		Constructor c = clazz.getDeclaredConstructor(List.class); //public 
		c.setAccessible(true); //解决私有权限问题,暴力反射
		Person_reflect p = (Person_reflect) c.newInstance(new ArrayList());
		System.out.println(p.name);
	}
	
	//创建对象的另外的一种途径 ,只能用于构造函数为无参的
	@Test
	public void test5() throws Exception{
	Class clazz = Class.forName("cn.snow.bean.Person_reflect");
	Person_reflect p = (Person_reflect) clazz.newInstance();
	System.out.println(p);
	}
}
