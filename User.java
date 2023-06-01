
public class User extends Thread{
	private Bank bank;
	private int amount;
	
	public User(Bank bank,int amount) {
		// TODO Auto-generated constructor stub
		this.bank=bank;
		this.amount=amount;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		String msg=getName()+":  "+ bank.getMoney(amount);
		System.out.println(msg);
		
	}

}
