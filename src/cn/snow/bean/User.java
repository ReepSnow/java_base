package cn.snow.bean;

import java.util.Date;

public class User {

	private String name;
	private int age;
	private String birth;
	private float sales;
	
	/**
	 * @return the sales
	 */
	public float getSales() {
		return sales;
	}
	/**
	 * @param sales the sales to set
	 */
	public void setSales(float sales) {
		this.sales = sales;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
	/**
	 * @return the birth
	 */
	public String getBirth() {
		return birth;
	}
	/**
	 * @param birth the birth to set
	 */
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String name, int age, String birth, float sales) {
		super();
		this.name = name;
		this.age = age;
		this.birth = birth;
		this.sales = sales;
	}

}
