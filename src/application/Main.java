package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		Account account;
		
		System.out.print("Enter account number: ");
		int accountNumber = input.nextInt();
		
		System.out.print("Enter account holder: ");
		// Necessário para consumir a quebra de linha pendente
		input.nextLine();
		String holderName = input.nextLine();
		
		System.out.printf("Is there an initial deposit (y/n)? ");
		char response = input.next().charAt(0);
		
		if (response == 'y' || response == 'Y') {
			System.out.print("Enter initial deposit value: ");
			double depositValue = input.nextDouble();
			account = new Account(accountNumber, holderName, depositValue);
		} 
		else {
			account = new Account(accountNumber, holderName);
		}
		
		System.out.println();
		System.out.println("Account Data: ");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		account.deposit(input.nextDouble());
		System.out.println("Updated account data: ");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		account.withdraw(input.nextDouble());
		System.out.println("Updated account data: ");
		System.out.println(account);
		
		input.close();

	}

}
