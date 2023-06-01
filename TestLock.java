import java.util.concurrent.locks.ReentrantLock;

public class TestLock {
	public static void main(String[] args) {
		Bank bank= new Bank(1000);
		ReentrantLock myLock= new ReentrantLock();
		
		UserWithLock u1 = new UserWithLock(bank,700, myLock);
		u1.setName("Ali");
		
		UserWithLock u2= new UserWithLock(bank, 500,myLock);
		u2.setName("Erdem");
		
		UserWithLock u3= new UserWithLock(bank, 300,myLock);
		u3.setName("Fatma");
		
		
		u1.start();
		u2.start();
		u3.start();
		
		
		
	}

}
