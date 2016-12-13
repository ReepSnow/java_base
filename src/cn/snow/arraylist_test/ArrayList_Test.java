package cn.snow.arraylist_test;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_Test {

	public static void main(String[] args) {
		System.out.println("测试student对象");
		//创建集合对象
		ArrayList<Student> al = new ArrayList<Student>();
		//创建学生对象
		Student s1 = new Student("晴雯",18);
		Student s2 = new Student("林黛玉",16);
		Student s3 = new Student("袭人",19);
		Student s4 = new Student("贾宝玉",18);
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		System.out.println("方法一~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		for(int i=0;i<al.size();++i){
			Student s = (Student)al.get(i);
			System.out.println(s.getName()+"~~~~~~~"+s.getAge());
		}
		System.out.println("方法二~~~~~~~·~~~~~~~~~~~~~~~~~~~~~~~~~~");
		Iterator<Student> itr = al.iterator();
		while(itr.hasNext()){
			Student st = (Student)itr.next();
			System.out.println(st.getName()+"~~~~"+st.getAge());
		}
		
		
		
	}
}
