
package cn.snow.linkedlistDemo;

import java.util.LinkedList;

/*
 * LinkedList的特有功能
 * 		A：添加功能
 * 			public void addFirst(Object e)
 * 			public void addLast(Object e)
 * 		B: 获取功能
 * 			public void getFist(Object e)
 * 			public void getLast(Object e)
 * 		C：删除功能
 * 			public Object removeFirst()
 * 			public Object removeLast()
 */
public class LinkedList_test {

	public static void main(String[] args) {
		//创建集合对象
		LinkedList<Student> link = new LinkedList<Student>();
		//创建学生对象
		Student s1 = new Student("晴雯",18);
		Student s2 = new Student("林黛玉",16);
		Student s3 = new Student("袭人",19);
		Student s4 = new Student("贾宝玉",18);
		//添加元素
		link.addFirst(s1);
		link.addFirst(s2);
		link.addFirst(s3);
		link.addFirst(s4);
		
		System.out.println(link.get(0));
		System.out.println(link.get(3));
	}
}
