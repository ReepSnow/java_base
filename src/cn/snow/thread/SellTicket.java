package cn.snow.thread;

public class SellTicket implements Runnable {

	// 定义100张票
	private static int tickets = 100;

	private int x = 0;

	@Override
	public void run() {
		while (true) {
			if (x % 2 == 0) {
				synchronized (SellTicket.class) {
					if (tickets > 0) {
						try {
							Thread.sleep(100);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						System.out.println(Thread.currentThread().getName()
								+ "正在出售第" + (tickets--) + "张票 ");
					}
				}
			} else {
				sellTicket();
			}
			x++;
		}
	}

	private static synchronized void sellTicket() {
		if (tickets > 0) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + "正在出售第"
					+ (tickets--) + "张票 ");
		}
	}
}

class Demo {
}
