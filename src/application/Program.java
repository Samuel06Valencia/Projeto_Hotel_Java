package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluguel;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos quartos deseja alugar? ");
		int n = sc.nextInt();
		
		Aluguel[] vect = new Aluguel[10];
		
		for(int i = 0; i <= n; i++) {
			System.out.println("Rent "+i+"#:");
			
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Email: ");
			String email = sc.next();
			System.out.print("Informe o numero do quarto: ");
			int numeroQuarto = sc.nextInt();
			
			//Atribuindos os atributos para a posição do vetor
			Aluguel rent = new Aluguel(name,email);
			vect[numeroQuarto] = rent;
		}
		
		System.out.println("Informações do locatários: ");
		
		for(int i = 0; i < 10; i++) {
			if(vect[i] != null) {
			System.out.println(i+" "+vect[i]);
			}
		}
	}

}
