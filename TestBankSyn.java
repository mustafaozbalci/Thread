
public class TestBankSyn {
	public static void main(String[] args) {
		BankWithSyn bank= new BankWithSyn(1000);
		
		UserBankSyn u1 = new UserBankSyn(bank,700);
		u1.setName("Ali");
		
		UserBankSyn u2= new UserBankSyn(bank, 500);
		u2.setName("Erdem");
		
		UserBankSyn u3= new UserBankSyn(bank, 300);
		u3.setName("Fatma");
		
		
		u1.start();
		u2.start();
		u3.start();
		
		
		
	}

}
