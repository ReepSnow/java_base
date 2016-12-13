package cn.snow.bean;

import java.util.Date;

public class Student {
	private String name;
	private Integer age;
	private Date birth;
	private Float sales;
	
	public static void main(String[] args) {
		Student student = new Student();
		student.setAge(22);
		changName(student);
		System.out.println(student.toString());
	}
	
	public static void changName(Student student){
		student.setName("小红");
	};
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String name, Integer age, Date birth) {
		super();
		this.name = name;
		this.age = age;
		this.birth = birth;
	}
	/**
	 * @return the age
	 */
	public Integer getAge() {
		return age;
	}
	/**
	 * @return the birth
	 */
	public Date getBirth() {
		return birth;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @return the sales
	 */
	public Float getSales() {
		return sales;
	}
	
	/**
	 * @param age the age to set
	 */
	public void setAge(Integer age) {
		this.age = age;
	}
	/**
	 * @param birth the birth to set
	 */
	public void setBirth(Date birth) {
		this.birth = birth;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	public Student(String name, Integer age, Date birth, Float sales) {
		super();
		this.name = name;
		this.age = age;
		this.birth = birth;
		this.sales = sales;
	}
	/**
	 * @param sales the sales to set
	 */
	public void setSales(Float sales) {
		this.sales = sales;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", birth=" + birth
				+ ", sales=" + sales + "]";
	}
	
}
