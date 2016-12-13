package cn.snow.json;

import org.junit.Test;

import com.alibaba.fastjson.JSON;

import cn.snow.bean.User_Json;

/** 
 * @author  323098-wangpngtao: 
 * @date 创建时间：2016年4月13日 上午10:46:56 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public class Alibaba_json {

	@Test
	public void test1() {
		User_Json user = new User_Json();
		user.setAge(8);
		user.setName("zhangsan");
		String str = JSON.toJSONString(user);
		System.out.println(str);
	}
	@Test
	public void test2(){
		String str1="{\"age\":8,\"name\":null,\"address\":\"shanghai\"}";
		String str2="{\"age\":8,\"name\":\"zhangsan\"}";
		User_Json user = (User_Json) JSON.parseObject(str1, User_Json.class);
		System.out.println(user.getName());
	}
}
