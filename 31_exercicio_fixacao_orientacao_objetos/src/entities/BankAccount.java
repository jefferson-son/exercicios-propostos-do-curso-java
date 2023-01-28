package entities;

public class BankAccount {
	
		private int account;
		private String holder;
		private double balance;
		
		public BankAccount() {
		}
		
		public BankAccount(int account, String holder) {
			this.account = account;
			this.holder = holder;
		}
		
		public BankAccount(int account, String holder, double inicialDeposit) {
			this.account = account;
			this.holder = holder;
			deposit(inicialDeposit);
		}
		
		public int getAccount() {
			return account;
		}
		
		public String getHolder() {
			return holder;
		}
		
		public void setHolder(String holder) {
			this.holder = holder;
		}
		
		public double getBalance() {
			return balance;
		}
		
		public void deposit(double deposit) {
			this.balance += deposit;
		}
		
		public void withdraw(double withdraw) {
			this.balance -= withdraw + 5.0;
		}
		
		public String toString() {
			return "Account "
					+ account
					+ ", Holder: "
					+ holder
					+ ", Balance: $ "
					+ String.format("%.2f", balance);
		}
				
}
