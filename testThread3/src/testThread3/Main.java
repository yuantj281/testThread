package testThread3;

public class Main {
	public static void main(String[] args) {
		Runnable target1=new ThreadPlus1();
		Runnable target2=new ThreadPlus2();
		Runnable target3=new ThreadMinus1();
		Runnable target4=new ThreadMinus2();
		new Thread(target1).start();
		new Thread(target2).start();
		new Thread(target3).start();
		new Thread(target4).start();
	}
		
}
