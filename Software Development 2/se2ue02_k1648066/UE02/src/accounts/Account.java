package accounts;

public abstract class Account {
	static int nextId = 1;
	final int kontoNr;
	double kontoStand;
	Account (double kontoStand){
		this.kontoNr = nextId;
		this.kontoStand = kontoStand;
		nextId++;
	}
	Account (int kontoStand){
		this.kontoNr = nextId;
		this.kontoStand = kontoStand;
		nextId++;
	}
	Account(){
		this.kontoNr = nextId;
		this.kontoStand = 0;
		nextId++;
	}
	
	public void withdraw(double betrag) throws AccountException {
		this.kontoStand -= betrag;
	}
	public void withdraw(int betrag) throws AccountException {
		this.kontoStand -= betrag;
	}
	public void deposit(double betrag) throws AccountException{
		this.kontoStand += betrag;
	}
	public void deposit(int betrag) throws AccountException{
		this.kontoStand += betrag;
	}
	public String toString() {
		return ("Der Kontostand der Konto " + kontoNr + " beträgt gerade " + kontoStand + "€");
	}
	public double getKontoStand() {
		return kontoStand;
	}
	public int getKontoNr() {
		return kontoNr;
	}
}
