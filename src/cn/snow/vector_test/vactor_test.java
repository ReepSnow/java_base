package cn.snow.vector_test;

import java.util.Enumeration;
import java.util.Vector;

/*
 * vector的特有功能：
 * 1：添加功能
 * 			public void addElement(Object obj)
 * 2: 获取功能
 * 			public Object elementAt(int index)
 * 			public Enumeration elements()
 * 							boolean hasMoreElement()
 * 							Object nextElement()
 * JDK升级地原因
 * 			A：安全
 * 			B: 效率
 * 			C: 简化书写
 */

public class vactor_test {
	public static void main(String[] args) {
		//创建集合对象
		Vector ve = new Vector();
		//添加对象
		ve.addElement("hello");
		ve.addElement("world");
		ve.add("java");
		
		for(int i=0;i<ve.size();i++){
			String s = (String )ve.get(i);
			System.out.println(s);
		}
		System.out.println("~~~~~~~~~~~");
		Enumeration en = ve.elements();
		while(en.hasMoreElements()){
			String s = (String)en.nextElement();
			System.out.println(s);
		}
	}

}
