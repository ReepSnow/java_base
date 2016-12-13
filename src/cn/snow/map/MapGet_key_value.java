package cn.snow.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

public class MapGet_key_value {

	@Test
	public void test1(){
		
		List<String> list = new ArrayList<String>();
		list.add("aa");
		list.add("bb");
		list.add("cc");
		
		//传统方式获取
		Iterator<String> it = list.iterator();
		while(it.hasNext()){
			String value = it.next();
			System.out.println(value);
			
		}
		//增强for
		for (String s : list) {
			System.out.println(s);
		}
		
	}
	
	@Test
	public void test2(){
		
		Map<Integer, String> map = new HashMap();
		map.put(1, "aa");
		map.put(2, "bb");
		map.put(3, "cc");
		
		//传统set方式
		Set<Integer> setMap = map.keySet();
		Iterator<Integer> itMap = setMap.iterator();
		while(itMap.hasNext()){
			Integer  key = itMap.next();
			String valueMap = map.get(key);
			System.out.println(key+"-"+valueMap);
		}
		
		//传统entry方式
		Set<Map.Entry<Integer, String>> set = map.entrySet();
		Iterator<Map.Entry<Integer, String>> it =set.iterator();
		while (it.hasNext()) {
			Map.Entry<Integer, String> entry = it.next();
			int key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key+"-"+value);
		}
		//增强for循环
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			int key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key+"-"+value);
		}
	}
}
