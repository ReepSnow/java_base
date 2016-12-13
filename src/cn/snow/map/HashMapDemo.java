package cn.snow.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

public class HashMapDemo {
	// 创建集合对象
	Map<String, String> map = new HashMap<String, String>();

	@Before
	public void haspMapTest(){
		// 创建元素并添加元素
		map.put("邓超", "孙俪");
		map.put("黄晓明", "杨颖");
		map.put("周杰伦", "蔡依林");
		map.put("刘恺威", "杨幂");
	}

	/*
	 * 获取功能：
	 * V get(Object key):根据键获取值
	 * Set<K> keySet():获取集合中所有键的集合
	 * Collection<V> values():获取集合中所有值的集合
	 */
	@Test
	public void haspMapTest1(){
		
		// V get(Object key):根据键获取值
		System.out.println("get:" + map.get("周杰伦"));
		System.out.println("get:" + map.get("周杰")); // 返回null
		System.out.println("----------------------");

		// Set<K> keySet():获取集合中所有键的集合
		Set<String> set = map.keySet();
		for (String key : set) {
			System.out.println(key);
		}
		System.out.println("----------------------");

		// Collection<V> values():获取集合中所有值的集合
		Collection<String> con = map.values();
		for (String value : con) {
			System.out.println(value);
		}
	}
	
	/*
	 * Map集合的遍历。
	 * Map -- 夫妻对
	 * 思路：
	 * 		A:把所有的丈夫给集中起来。
	 * 		B:遍历丈夫的集合，获取得到每一个丈夫。
	 * 		C:让丈夫去找自己的妻子。
	 * 
	 * 转换：
	 * 		A:获取所有的键
	 * 		B:遍历键的集合，获取得到每一个键
	 * 		C:根据键去找值
	 */
	@Test
	public void haspMapTest2(){
		// 遍历
		// 获取所有的键
		Set<String> set = map.keySet();
		// 遍历键的集合，获取得到每一个键
		for (String key : set) {
			// 根据键去找值
			String value = map.get(key);
			System.out.println(key + "---" + value);
		}
	}
	

/*
 * Map集合的遍历。
 * Map -- 夫妻对
 * 
 * 思路：
 * 		A:获取所有结婚证的集合
 * 		B:遍历结婚证的集合，得到每一个结婚证
 * 		C:根据结婚证获取丈夫和妻子
 * 
 * 转换：
 * 		A:获取所有键值对对象的集合
 * 		B:遍历键值对对象的集合，得到每一个键值对对象
 * 		C:根据键值对对象获取键和值
 * 
 * 这里面最麻烦的就是键值对对象如何表示呢?
 * 看看我们开始的一个方法：
 * 		Set<Map.Entry<K,V>> entrySet()：返回的是键值对对象的集合
 */
	@Test
	public void haspMapTest3(){
		// 获取所有键值对对象的集合
		Set<Map.Entry<String, String>> set = map.entrySet();
		// 遍历键值对对象的集合，得到每一个键值对对象
		for (Map.Entry<String, String> me : set) {
			// 根据键值对对象获取键和值
			String key = me.getKey();
			String value = me.getValue();
			System.out.println(key + "---" + value);
		}
	}
}
