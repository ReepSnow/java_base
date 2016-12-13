package cn.snow.volatile_;

public class VolatileTest implements Runnable {

	private volatile boolean active;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		if (Thread.currentThread().getName().equals("线程1")) {
			System.out.println(Thread.currentThread().getName());
			go();
		} else {
			System.out.println(Thread.currentThread().getName());
			over();
		}
	}

	public void over() {
		active = false;
	}

	public void go() {
		active = true;
		while (active) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("无限循环测试");
		}
	}

	public static void main(String[] args) {
		VolatileTest test = new VolatileTest();
		Thread thread1 = new Thread(test, "线程1");
		Thread thread2 = new Thread(test, "线程2");
		thread1.start();
		thread2.start();
		System.out.println("ddddddddddddddd");
	}

}
