package testThread3;

public class ThreadMinus2 extends Ticket implements Runnable {
	
	
	@Override
	public void run() {
		while(true) {
			synchronized (this) {
		
			if(ticket<=0) {
				break;
			}else {
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				ticket-=2;
				System.out.println("窗口："+Thread.currentThread().getName()+":"+ticket);
			}
		}
		}
	}

}
