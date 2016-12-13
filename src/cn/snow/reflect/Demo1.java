package cn.snow.reflect;

import cn.snow.bean.Person_reflect;


public class Demo1 {
	/*
	 * 反射：加载类，获得类的字节码
	 */
	public static void main(String[] args) throws ClassCastException, ClassNotFoundException{
	//通过类完整名称加载类，得到类的class，
	Class clazz = Class.forName("cn.snow.bean.Person_reflect");
	//new Person()已经加载了类文件，我们可以通过类的对象调用getClass()方法来得到类的class
	Class clazz1 = new Person_reflect().getClass();
	//通过类对象，调用class返回类的class
	Class clazz2 = Person_reflect.class;
	}

}

