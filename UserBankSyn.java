
public class UserBankSyn extends Thread{
	private BankWithSyn bank;
	private int amount;
	
	public UserBankSyn(BankWithSyn bank,int amount) {
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
