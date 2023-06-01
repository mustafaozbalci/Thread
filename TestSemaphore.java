import java.util.concurrent.Semaphore;


public class TestSemaphore {
	public static void main(String[] args) {
		Bank bank= new Bank(1000);
		Semaphore semaphore= new Semaphore(1);
		
		UserWithSemaphore u1 = new UserWithSemaphore(bank,700, semaphore);
		u1.setName("Ali");
		
		UserWithSemaphore u2= new UserWithSemaphore(bank, 500,semaphore);
		u2.setName("Erdem");
		
		UserWithSemaphore u3= new UserWithSemaphore(bank, 300,semaphore);
		u3.setName("Fatma");
		
		
		u1.start();
		u2.start();
		u3.start();
		
		
	}

}
