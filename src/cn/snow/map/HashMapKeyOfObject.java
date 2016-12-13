package cn.snow.map;

import java.util.HashMap;
import java.util.Set;

import cn.snow.bean.Student_map;

public class HashMapKeyOfObject {

	public static void main(String[] args) {
		// 创建集合对象
		HashMap<Student_map, String> hm = new HashMap<Student_map, String>();

		// 创建学生对象
		Student_map s1 = new Student_map("貂蝉", 27);
		Student_map s2 = new Student_map("王昭君", 30);
		Student_map s3 = new Student_map("西施", 33);
		Student_map s4 = new Student_map("杨玉环", 35);
		Student_map s5 = new Student_map("貂蝉", 27);

		// 添加元素
		hm.put(s1, "8888");
		hm.put(s2, "6666");
		hm.put(s3, "5555");
		hm.put(s4, "7777");
		hm.put(s5, "9999");

		// 遍历
		Set<Student_map> set = hm.keySet();
		for (Student_map key : set) {
			String value = hm.get(key);
			System.out.println(key.getName() + "---" + key.getAge() + "---"
					+ value);
		}
	}
}
