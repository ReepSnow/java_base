package cn.snow.map_test;

public class Dog extends Pet implements Eatable,FlayingDiscCatchable {

	private String strain;

	public Dog(String name, String strain) {
		super(name);
		this.strain = strain;
	}

	public String getStrain() {
		return strain;
	}

	@Override
	public void print() {
		System.out.println("宠物的自白：\n我的名字叫" + this.getName() + ",我的健康值"
				+ this.getHealth() + ",我和主人的亲密程度是" + this.getLove() + "。我是一只"
				+ this.strain + "品种的狗");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}

	@Override
	public void eat() {
		if (this.getHealth() < 100){
			System.out.println("我是一条大笨狗，我在吃狗粮");
			this.setHealth(this.getHealth()+3);
		}
		else
			System.out.println("我是一条大笨狗，我已经吃饱了");
	}
	public void catchingFlyDisc() {
		System.out.println("我是条大笨狗，我正在和主人玩接飞盘的游戏。");
		this.setHealth(this.getHealth()-10);
		this.setLove(getLove()+5);
	}

	@Override
	public String toString() {
		return "Dog [strain=" + strain + "]";
	}
}

