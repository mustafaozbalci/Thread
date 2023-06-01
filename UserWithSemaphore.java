import java.util.concurrent.Semaphore;


public class UserWithSemaphore extends Thread{
	private Bank bank;
	private int amount;
	private Semaphore semaphore;
	
	public UserWithSemaphore(Bank bank,int amount,Semaphore semaphore) {
		// TODO Auto-generated constructor stub
		this.bank=bank;
		this.amount=amount;
		this.semaphore=semaphore;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		String msg="";
		
		try {
			semaphore.acquire(); // access the critical section
			msg=getName()+", "+bank.getMoney(amount);
			semaphore.release(); // leave the critical section
		}
		catch (InterruptedException e) {
			// TODO: handle exception
			msg= e.getMessage();
		}
		
				
		System.out.println(msg);
		
	}

}
