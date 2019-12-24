package entities;

public class Account {
	
	private int number; 		// Atributo n�mero da conta
	private String holder;		// Atributo titular da conta
	private double balance;		// Atributo saldo da conta
	
	// Construtor respons�vel pela abertura da conta SEM dep�sito inicial
	public Account(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}

	// Construtor respons�vel pela abertura da conta COM dep�sito inicial
	public Account(int number, String holder, double initialDeposit) {
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit);
	}

	// M�todo respons�vel por retornar o n�mero da conta
	public int getNumber() {
		return number;
	}

	// M�todo respons�vel por retornar o nome do titular da conta
	public String getHolder() {
		return holder;
	}

	// M�todo respons�vel por modificar o nome do titular da conta
	public void setHolder(String holder) {
		this.holder = holder;
	}

	// M�todo respons�vel por retornar o saldo da conta
	public double getBalance() {
		return balance;
	}

	// M�todo respons�vel por realizar dep�sitos na conta
	public void deposit(double amount) {
		this.balance += amount;
	}
	
	// M�todo respons�vel por realizar saques na conta
	public void withdraw(double amount) {
		if (amount > 0) {
			this.balance -= amount + 5;
		}
	}
	
	// M�todo respons�vel por retornar informa��es sobre a conta
	// Ex. "Account 0001, Holder: Ranyery Coutinho, Balance: $ 250.00"
	public String toString() {
		return "Account "
				+ number
				+ ", Holder: "
				+ holder
				+ ", Balance: $ "
				+ String.format("%.2f", balance);
	}

}
