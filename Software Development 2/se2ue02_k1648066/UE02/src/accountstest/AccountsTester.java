package accountstest;
import accounts.AccountException;
import accounts.CreditAccount;
import accounts.GiroAccount;
import accounts.SavingsAccount;
import inout.In;
import inout.Out;
public class AccountsTester {

	public static void main(String[] args) {
		Out.println("Tester\n======================\n");
		Out.println("Constructors Test\n---------------------");
		Out.println("Gyrokonto Negative Kontostand von -200€: ");
		GiroAccount giroAccount = new GiroAccount(-200, 100);
		Out.println(giroAccount.toString() + "\n");
		Out.println("Gyrokonto Positive Kontostand von 200€: ");
		GiroAccount giroAccount2 = new GiroAccount(200, 100);
		Out.println(giroAccount2.toString()+ "\n");
		Out.println("Savingskonto Negative Kontostand von -200€: ");
		try {
			SavingsAccount savingsAccount = new SavingsAccount(-200);
			Out.println(savingsAccount.toString()+ "\n");
		} 
		catch (AccountException ex) {
			Out.println(ex.getMessage()+ "\n");
		}
		Out.println("Savingskonto Positive Kontostand von 200€: ");
		try {
			SavingsAccount savingsAccount2 = new SavingsAccount(200);
			Out.println(savingsAccount2.toString()+ "\n");
		} 
		catch (AccountException ex) {
			Out.println(ex.getMessage()+ "\n");
		}
		Out.println("Creditkonto Negative Kontostand von -200€: ");
		try {
			CreditAccount creditAccount = new CreditAccount(-200);
			Out.println(creditAccount.toString()+ "\n");
		} 
		catch (AccountException ex) {
			Out.println(ex.getMessage()+ "\n");
		}
		Out.println("Creditkonto Positive Kontostand von 200€: ");
		try {
			CreditAccount creditAccount2 = new CreditAccount(200);
			Out.println(creditAccount2.toString()+ "\n");
		} 
		catch (AccountException ex) {
			Out.println(ex.getMessage()+ "\n");
		}
		Out.println("Withdraw Test\n---------------------");
		Out.println("Girokonto kleiner als Ueberziehungsrahmen: ");
		try {
			Out.println("Withdraw von 50€ und Ueberziehungsrahmen von 100€:");
			giroAccount2.withdraw(50);
			Out.println(giroAccount2.toString()+ "\n");
		} 
		catch (AccountException ex) {
			Out.println(ex.getMessage()+ "\n");
		}
		Out.println("Girokonto hoeher als Ueberziehungsrahmen: ");
		try {
			Out.println("Withdraw von 200€ und Ueberziehungsrahmen von 100€:");
			giroAccount2.withdraw(200);
			Out.println(giroAccount2.toString()+ "\n");
		} 
		catch (AccountException ex) {
			Out.println(ex.getMessage()+ "\n");
		}
		Out.println("Savingskonto, withdraw kleiner als verfügbarer Betrag: ");
		try {
			Out.println("Withdraw von 25€ und Kontostand von 200€:");
			SavingsAccount savingsAccount2 = new SavingsAccount(200);
			savingsAccount2.withdraw(25);
			Out.println(savingsAccount2.toString()+ "\n");
		} 
		catch (AccountException ex) {
			Out.println(ex.getMessage()+ "\n");
		}
		Out.println("Savingskonto, withdraw größer als verfügbarer Betrag: ");
		try {
			Out.println("Withdraw von 300€ und Kontostand von 175€:");
			SavingsAccount savingsAccount2 = new SavingsAccount(175);
			savingsAccount2.withdraw(300);
			Out.println(savingsAccount2.toString()+ "\n");
		} 
		catch (AccountException ex) {
			Out.println(ex.getMessage()+ "\n");
		}
		Out.println("Creditkonto, withdraw: ");
		try {
			Out.println("Withdraw von 100€ und Kontostand von -200€:");
			CreditAccount creditAccount = new CreditAccount(-200);
			creditAccount.withdraw(100);
			Out.println(creditAccount.toString()+ "\n");
		} 
		catch (AccountException ex) {
			Out.println(ex.getMessage()+ "\n");
		}
		Out.println("Deposit Test\n---------------------");
		try {
			Out.println("Girokonto, Deposit von 100€ und Kontostand von 150€:");
			giroAccount2.deposit(100);
			Out.println(giroAccount2.toString()+ "\n");
		} 
		catch (AccountException ex) {
			Out.println(ex.getMessage()+ "\n");
		}
		try {
			Out.println("Savingskonto, Deposit von 100€ und Kontostand von 200€:");
			SavingsAccount savingsAccount = new SavingsAccount(200);
			savingsAccount.deposit(100);
			Out.println(savingsAccount.toString()+ "\n");
		} 
		catch (AccountException ex) {
			Out.println(ex.getMessage()+ "\n");
		}
		try {
			Out.println("Creditkonto, Deposit von 100€ und Kontostand von -200€:");
			CreditAccount creditAccount = new CreditAccount(-200);
			creditAccount.deposit(100);
			Out.println(creditAccount.toString()+ "\n");
		} 
		catch (AccountException ex) {
			Out.println(ex.getMessage()+ "\n");
		}
		try {
			Out.println("Creditkonto, Deposit von 200€ und Kontostand von -100€:");
			CreditAccount creditAccount = new CreditAccount(-100);
			creditAccount.deposit(200);
			Out.println(creditAccount.toString()+ "\n");
		} 
		catch (AccountException ex) {
			Out.println(ex.getMessage()+ "\n");
		}
		Out.println("Getters\n---------------------");
		Out.println("Kontostandgetter von eine Konto mit 250€: " + giroAccount2.getKontoStand() + "€");
		Out.println(giroAccount2.toString()+ "\n");
		Out.println("Kontonummergetter von eine Konto mit Nummer 2: " + giroAccount2.getKontoNr());
		Out.println(giroAccount2.toString()+ "\n");
		Out.println("Ueberziehungsrahmengetter von eine Konto mit Ueberziehungsrahmen 100€: " + giroAccount2.getUeberziehungsRahmen() + "€");
		Out.println(giroAccount2.toString()+ "\n");
		Out.println("Setters\n---------------------");
		Out.println("Set der Ueberziehungsrahmenvon von eine Konto mit Ueberziehungsrahmen 100€ auf 200€: ");
		Out.println(giroAccount2.toString());
		Out.println("Nach dem Set: ");
		giroAccount2.setUeberziehungsRahmen(200);
		Out.println(giroAccount2.toString()+ "\n");
		Out.println("--------------------- End ---------------------");
		
	}
}
