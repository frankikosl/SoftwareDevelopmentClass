package accounts;

public class CreditAccount extends Account {
	
	
	public CreditAccount(double amount) throws AccountException{
		super(amount);
		if (amount >= 0) {
			nextId--;
			throw new AccountException(amount, 1, 1);
		}
	}
	public void withdraw(double betrag) throws AccountException{
			throw new AccountException(1, "c");
	}
	public void withdraw(int betrag) throws AccountException {
			throw new AccountException(1, "c");

	}
	public void deposit(double betrag) throws AccountException{
		if (this.kontoStand + betrag >  0) {
			throw new AccountException(this.kontoStand + betrag, "c", "c");
		}
		else {
			this.kontoStand += betrag;
		}
	}
	public void deposit(int betrag) throws AccountException {
		if (this.kontoStand + betrag > 0) {
			throw new AccountException(this.kontoStand + betrag, "c", "c");
		}
		else {
			this.kontoStand += betrag;
		}
	}
}
