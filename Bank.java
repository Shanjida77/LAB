
public class Bank {

	private Account[] accounts;

	private int numOfAccount;

	public Bank(int size) {
		accounts = new Account[size];
	}

	public int getAccountNumber() {
		return numOfAccount;
	}

	public Account[] getAccounts() {
		return accounts;
	}

	public void addAccount(Account account) {
		accounts[numOfAccount++] = account;
	}

	public void printAccountInfo(int accountNumber) {
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getAccountNumber(i) == accountNumber) {
				System.out.println(accounts[i]);
			}
		}
	}

}
