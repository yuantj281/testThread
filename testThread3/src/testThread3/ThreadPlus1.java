package testThread3;

public class ThreadPlus1 extends Ticket implements Runnable {
	
	
	@Override
	public void run() {
		while(true) {
			if (ticket >= 10) {
				break;
			} else {
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			ticket+=1;
			System.out.println("窗口："+Thread.currentThread().getName()+":"+ticket);
		}
		}
	}

}
