package accounts;

public class AccountException extends Exception{
	private static final long serialVersionUID = 8938945920360510629L;
	public AccountException() { 
		super("General Account Exception"); 
		}
	public AccountException(double amount, double ueberziehungsRahmen) { 
		super(ExceptCause.WithdrawLimitException.name() + ". Abhebungsmenge ist " + amount + "€ groesser als Ueberziehungsrahmen von " + ueberziehungsRahmen + "€"); 
	}
	public AccountException(double amount) { 
		super(ExceptCause.WithdrawException.name() + ". Mit dieser Operation wurde die Sparkonto " + amount + "€ haben. Ein Sparkonto muss mehr als 0€ haben."); 
	}
	public AccountException(double amount, String stand) { 
		super(ExceptCause.WithdrawException.name() + ". Geld kann nicht von einen Kreditkonto behoben werden"); 
	}
	public AccountException(double amount, String stand, String count) { 
		super(ExceptCause.DepositException.name() + ". Ein Kreditkonto kann nicht mehr als 0€ haben. Mit diese Operation wurde es " + amount + "€ haben."); 
	}
	public AccountException(double amount, int stand, int count) { 
		super(ExceptCause.InvalidCreationException.name() + ". Eine Kreditkonto kann nicht mit " + amount + "€ erstellt werden"); 
	}
	public AccountException(double amount, int stand, String count) { 
		super(ExceptCause.InvalidCreationException.name() + ". Eine Sparkonto kann nicht mit " + amount + "€ erstellt werden"); 
	}
}
