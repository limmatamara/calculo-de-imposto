package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Pessoa> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		for (int i=1; i<=n; i++) {
			System.out.println("Tax payer #" + i + " data: ");
			System.out.print("Individual or company (i/c)? ");
			char peopleType = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			double anualIncome = sc.nextDouble();
			if (peopleType == 'i') {
				System.out.print("Health expenditures: ");
				double healthExpenditures = sc.nextDouble();
				list.add(new PessoaFisica(name, anualIncome, healthExpenditures));
			} else {
				System.out.print("Number of employees: ");
				int numberOfEmployees = sc.nextInt();
				list.add(new PessoaJuridica(name, anualIncome, numberOfEmployees));
			}
		}
		System.out.println();
		System.out.println("TAXES PAID:");
		for (Pessoa pessoa: list) {
			System.out.printf( pessoa.getName()+ " $ " + "%.2f",pessoa.taxCalculation() );
			System.out.println();
		}
		System.out.println();
		double sum = 0.0;
		for (Pessoa pessoa: list) {
			sum += pessoa.taxCalculation();
		}
		System.out.print("TOTAL TAXES: $ " + sum);
		
	
		
	}

}
