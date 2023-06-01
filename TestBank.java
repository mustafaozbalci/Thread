
public class TestBank {
	public static void main(String[] args) {
		Bank bank= new Bank(1000);
		
		User u1 = new User(bank,700);
		u1.setName("Ali");
		
		User u2= new User(bank, 500);
		u2.setName("Erdem");
		
		User u3= new User(bank, 300);
		u3.setName("Fatma");
		
		
		u1.start();
		u2.start();
		u3.start();
		
		
		
	}

}
