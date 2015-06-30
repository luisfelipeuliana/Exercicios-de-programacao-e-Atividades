package EstudoThread;

public class ClasseThread {
	
	public static void main(String args[]) throws InterruptedException{
	Runnable run1 = new Runnable(
			) {
		@Override
		public void run() {
			for (int i = 0; i < 10; i++) {
				try {
					System.out.println("BRANCO ");
					Thread.sleep(1000);
				} catch (InterruptedException e) {
			
					System.out.println("parou");
				}
			}			
		}
	};
	
	Runnable run2 = new Runnable() {
		
		@Override
		public void run() {
			for (int i = 0; i < 10; i++) {
				System.out.println("PRETO !!!");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
	};
	
		Thread thr1 = new Thread(run1);
		Thread thr2 = new Thread(run2);
		System.out.println("agora vai .....");
thr1.start();
thr2.start();
		
		
		
		
		
		
		
	}

}
