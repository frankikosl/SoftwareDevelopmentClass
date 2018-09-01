package accounts;

public class SavingsAccount extends Account {
	
	public SavingsAccount(double amount) throws AccountException{
		super(amount);
		if (amount < 0) {
			nextId--;
			throw new AccountException(amount, 1, "c");
		}
	}
	
	public void withdraw(double betrag) throws AccountException{
		if (this.kontoStand - betrag <= 0) {
			throw new AccountException(kontoStand - betrag);
		}
		else {
			this.kontoStand -= betrag;
		}
	}
	public void withdraw(int betrag) throws AccountException {
		if (this.kontoStand - betrag <= 0) {
			throw new AccountException(kontoStand - betrag);
		}
		else {
			this.kontoStand -= betrag;
		}
	}
}
