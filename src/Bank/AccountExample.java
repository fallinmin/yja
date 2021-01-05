package Bank;

public class AccountExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account = new Account();
		
		account.setBalance(1000);
		System.out.println("ÇöÀçÀÜ°í: "+account.getBalance());
		
		account.setBalance(-1000);
		System.out.println("ÇöÀç ÀÜ°í: "+account.getBalance());
		
		account.setBalance(2000000);
		
		System.out.println("ÇöÀç ÀÜ°í: "+account.getBalance());
		account.setBalance(3000000);
		
		System.out.println("ÇöÀç ÀÜ°í: "+account.getBalance());
	}

}
