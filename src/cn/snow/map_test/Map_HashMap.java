package cn.snow.map_test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Map_HashMap {

	public static void main(String[] args) {
		Dog dog1 = new Dog("阿狗1", "品种1");
		Dog dog2 = new Dog("阿狗2", "品种2");
		Dog dog3 = new Dog("阿狗3", "品种3");
		Dog dog4 = new Dog("阿狗4", "品种4");
		
		Map<String, Dog> dogMap = new HashMap<String, Dog>();
		dogMap.put("狗001", dog1);
		dogMap.put("狗002", dog2);
		dogMap.put("狗003", dog3);
		dogMap.put("狗004", dog4);
		
		System.out.println("方法一~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~`");
		Set<String> key = dogMap.keySet();
		for (String string : key) {
			System.out.println(string);
			System.out.println(dogMap.get(string));
		}
		System.out.println("方法二~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		Iterator<String> ite = key.iterator();
		while(ite.hasNext()){
			String iteKye=ite.next();
			System.out.println(iteKye);
			System.out.println(dogMap.get(iteKye));
		}
		System.out.println("方法三~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		Set<Map.Entry<String, Dog>> ent = dogMap.entrySet();
		for (Entry<String, Dog> entry : ent) {
			String keyEntry=entry.getKey();
			Dog valueEntry=entry.getValue();
			System.out.println(keyEntry);
			System.out.println(valueEntry);
		}
		//Set<Map<String, Dog>>
	}
}
