import java.util.concurrent.locks.ReentrantLock;

public class UserWithLock extends Thread{
	private Bank bank;
	private int amount;
	private ReentrantLock myLock;
	
	public UserWithLock(Bank bank,int amount, ReentrantLock myLock) {
		// TODO Auto-generated constructor stub
		this.bank=bank;
		this.amount=amount;
		this.myLock=myLock;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		String msg="";
		
		myLock.lock(); // lock the critical section
		msg=getName()+":  "+ bank.getMoney(amount);
		myLock.unlock(); // unlock the critical section
		
				
		System.out.println(msg);
		
	}

}
