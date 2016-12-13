package cn.snow.interf;

public class InterfaceImpl implements Interface3 {

	public int interValue1=40;
	@Override
	public void interMethod1() {
		System.out.println(interValue1);
	}

	@Override
	public void interMethod2() {
		System.out.println(interValue2);
	}
	public static void main(String[] args) {
		InterfaceImpl impl = new InterfaceImpl();
		impl.interMethod1();
		impl.interMethod2();
	}

}
