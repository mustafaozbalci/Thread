
public class BankWithSyn {
	private int balance;
	public BankWithSyn(int balance) {
		// TODO Auto-generated constructor stub
		this.balance=balance;
	}
	
	public synchronized String getMoney(int money) {
		String msg="";
		
		if(balance>=money) {
			try {
				Thread.currentThread().sleep(100);
				balance=balance-money;
				msg="You can get "+ money+" TL";
			}
			catch (InterruptedException e) {
				// TODO: handle exception
				msg= "This machine doesn't work";
			}
		}
		else {
			msg=" Maximum money you can get is: "+balance+" TL";
		}
		
		return msg;
		
		
	}// end of the method
	

}// end of the class
