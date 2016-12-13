package cn.snow.beanutils;

import org.junit.Test;
import java.lang.reflect.InvocationTargetException;
import java.util.Date;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.locale.converters.DateLocaleConverter;
import org.junit.Test;

import cn.snow.bean.Student;
import cn.snow.bean.User;

public class TestBeanUtil {
	@Test
	public void test5(){
		User user = new User("zhangsan",23,"1991-01-02",23.3f);
		Student student = BeanUtilMy.copy(Student.class, user);
		System.out.println(student.toString());
	}

	@Test
	public void test1() throws Exception, InvocationTargetException{
		
		Person p = new Person();
		BeanUtils.setProperty(p, "name", "xcc");
		
		System.out.println(p.getName());
	}

	
	@Test
	public void test2() throws Exception, InvocationTargetException{
		
		String name = "aaaa";
		String password = "123";
		String age = "34"; //Person其实是int类型，beanutils其实做了很多工作
		String birthday = "1991-07-05";
		
		Person p = new Person();
		BeanUtils.setProperty(p, "name", name);
		BeanUtils.setProperty(p, "password", password);
		BeanUtils.setProperty(p, "age", age);
//		BeanUtils.setProperty(p, "birthday", birthday);//会报错，只支持八种数据类型
		
		System.out.println(p.getName());
		System.out.println(p.getPassword());
		System.out.println(p.getAge());
//		System.out.println(p.getBirthday());//会报错，只支持八种基本数据类型
		
	}
	
	
	
	/*@Test
	public void test3() throws Exception, InvocationTargetException{
		
		String name = "aaaa";
		String password = "123";
		String age = "34"; //Person其实是int类型，beanutils其实做了很多工作
		String birthday = "1991/07/05";
		
		//为了让日期属性也能正常使用，我们为beanutil提供一个转换器
		ConvertUtils.register(new Converter(){
			public Object concvert(Class type,Object value){
				if(value==null)
					return null;
				if(!(value instanceof String))
					System.out.println("不转");
			}
		}, Date.class);
		
		Person p = new Person();
		BeanUtils.setProperty(p, "name", name);
		BeanUtils.setProperty(p, "password", password);
		BeanUtils.setProperty(p, "age", age);
//		BeanUtils.setProperty(p, "birthday", birthday);//会报错，只支持八种数据类型
		
		System.out.println(p.getName());
		System.out.println(p.getPassword());
		System.out.println(p.getAge());
//		System.out.println(p.getBirthday());//会报错，只支持八种基本数据类型
		
	}*/
	
	
	@Test
	public void test4() throws Exception, InvocationTargetException{
		
		String name = "aaaa";
		String password = "123";
		String age = "34"; //Person其实是int类型，beanutils其实做了很多工作
		String birthday = "1991-05-01";
		
		ConvertUtils.register(new DateLocaleConverter(), Date.class);
		
		Person p = new Person();
		BeanUtils.setProperty(p, "name", name);
		BeanUtils.setProperty(p, "password", password);
		BeanUtils.setProperty(p, "age", age);
		BeanUtils.setProperty(p, "birthday", birthday);
		System.out.println(p.getName());
		System.out.println(p.getPassword());
		System.out.println(p.getAge());
		System.out.println(p.getBirthday());
		
	}
}
