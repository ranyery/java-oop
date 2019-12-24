package entities;

public class Account {
	
	private int number; 		// Atributo número da conta
	private String holder;		// Atributo titular da conta
	private double balance;		// Atributo saldo da conta
	
	// Construtor responsável pela abertura da conta SEM depósito inicial
	public Account(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}

	// Construtor responsável pela abertura da conta COM depósito inicial
	public Account(int number, String holder, double initialDeposit) {
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit);
	}

	// Método responsável por retornar o número da conta
	public int getNumber() {
		return number;
	}

	// Método responsável por retornar o nome do titular da conta
	public String getHolder() {
		return holder;
	}

	// Método responsável por modificar o nome do titular da conta
	public void setHolder(String holder) {
		this.holder = holder;
	}

	// Método responsável por retornar o saldo da conta
	public double getBalance() {
		return balance;
	}

	// Método responsável por realizar depósitos na conta
	public void deposit(double amount) {
		this.balance += amount;
	}
	
	// Método responsável por realizar saques na conta
	public void withdraw(double amount) {
		if (amount > 0) {
			this.balance -= amount + 5;
		}
	}
	
	// Método responsável por retornar informações sobre a conta
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
