package accounts;

public class GiroAccount extends Account {
	private double ueberziehungsRahmen;
	public GiroAccount(double kontoStand, double ueberziehungsRahmen){
		super(kontoStand);
		this.ueberziehungsRahmen = ueberziehungsRahmen;
	}
	public void withdraw(double betrag) throws AccountException{
		if (betrag > ueberziehungsRahmen) {
			throw new AccountException(betrag - ueberziehungsRahmen, ueberziehungsRahmen);
		}
		else {
			this.kontoStand -= betrag;
		}
	}
	public void withdraw(int betrag) throws AccountException {
		if (betrag > ueberziehungsRahmen) {
			throw new AccountException(betrag - ueberziehungsRahmen, ueberziehungsRahmen);
		}
		else {
			this.kontoStand -= betrag;
		}
	}
	public double getUeberziehungsRahmen() {
		return ueberziehungsRahmen;
	}
	public void setUeberziehungsRahmen(double ueberziehungsRahmen) {
		this.ueberziehungsRahmen = ueberziehungsRahmen;
	}
	public String toString() {
		return ("Der Kontostand der Konto " + kontoNr + " beträgt gerade " + kontoStand + "€ und Ueberziehungsrahmen von " + ueberziehungsRahmen + "€");
	}
}
