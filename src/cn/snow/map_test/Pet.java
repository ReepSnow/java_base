package cn.snow.map_test;
/**
 * 宠物类是，狗与企鹅的父类
 * @author ReepSnow
 *
 */
public abstract class Pet {

	private String name="无名氏";
	private int health=100;
	private int love = 0;
	/**
	 * 无参的构造方法
	 */
	public Pet(){
		this.health=95;
		System.out.println("调用了宠物的无参的构造方法。");
	}
	/**
	 * 有参的构造方法
	 * @param name 昵称
	 *
	 */
	public Pet(String name){
		this.name = name;
	}
	/**
	 * 获取昵称的值
	 * @return 昵称
	 */
	public String getName() {
		return name;
	}
	public int getHealth() {
		return health;
	}
	public int getLove() {
		return love;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public void setLove(int love) {
		this.love = love;
	}
	public abstract void print();
	@Override
	public String toString() {
		return "Pet [name=" + name + "]";
	}	
	
}
