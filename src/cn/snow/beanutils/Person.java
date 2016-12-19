package cn.snow.beanutils;

import java.util.Date;

public class Person { //javabean
	private String name;//姓名
	private String password;//密码
	private int age;//年龄
	private Date birthday;//生日
	
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAb(){
		return null;
	}
}
