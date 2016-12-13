package cn.snow.reflect;

import java.io.FileInputStream;
import java.io.InputStream;
import java.lang.reflect.Method;

import org.junit.Test;

import cn.snow.bean.Person_reflect;



//反射类的方法
public class Demo3 {
	
	//反射类的方法：public void aa1()
	@Test
	public void test1() throws Exception{
		Person_reflect p = new Person_reflect();
		Class clazz = Class.forName("cn.snow.bean.Person_reflect");
		Method method = clazz.getMethod("aa1",null);//获得类的方法名，并传递参数类型
		method.invoke(p, null);//传递要操作的对象名称，以及参数值
	}
	
	//反射类的方法：public Class[] aal(String name,int[] password)
	@Test
	public void test2() throws Exception{
		Person_reflect p = new Person_reflect();
		Class clazz = Class.forName("cn.snow.bean.Person_reflect");
		Method method = clazz.getMethod("aa1", String.class,int.class);
		method.invoke(p, "zxx",38);
	}
	
	//反射类的方法：public Class[] aa1(String name,int[] password)
	@Test
	public void test3() throws Exception{
		Person_reflect p = new Person_reflect();
		Class clazz = Class.forName("cn.snow.bean.Person_reflect");
		Method method = clazz.getMethod("aa1", String.class,int[].class);
		Class cs[] = (Class[]) method.invoke(p, "aaa",new int[]{1,23});
		System.out.println(cs[0]);
		
	}
	
	//反射类的方法：private void aa1(InputStream in)
	@Test
	public void test4() throws Exception{
		Person_reflect p=new Person_reflect();
		Class clazz =Class.forName("cn.snow.bean.Person_reflect");
		Method method = clazz.getDeclaredMethod("aa1", InputStream.class); //private
		method.setAccessible(true);
		Class cs[]= (Class[]) method.invoke(p, new FileInputStream("D:\\1.txt"));
		System.out.println(cs[0]);
	}
	//反射类的方法：public static void aa1(int num)
	@Test
	public void test5() throws Exception{
		//第一种方法
		/*Person p = new Person();
		Class clazz = Class.forName("cn.snow.bean.Person_reflect");
		Method method = clazz.getMethod("aa1", int.class);
		method.invoke(p, 23);*/
		//第二种方法，因为是静态所以不需要进行
		Class clazz = Class.forName("cn.snow.bean.Person_reflect");
		Method method = clazz.getMethod("aa1", int.class);
		method.invoke(null, 23);
	}
	//反射类的方法：public static void main(String[] args)
	@Test
	public void test6() throws Exception{
		Class clazz = Class.forName("cn.snow.bean.Person_reflect");
		Method method = clazz.getMethod("main", String[].class);
		//方法一
		method.invoke(null, new Object[]{new String[]{"aa","bb"}});
		//方法二
		method.invoke(null, (Object)new String[] {"aa","bb"});
	}
	@Test
	public void test() throws Exception{
		Person_reflect p = new Person_reflect();
		Class clazz = Class.forName("cn.snow.bean.Person_reflect");
		Method method[] = clazz.getMethods();
		for (Method m : method) {
			String name= m.getName();
			System.out.println(name);
		}
	}
}
