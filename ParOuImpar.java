package bla.bla.bla.bla.beans;

import java.util.Scanner;

public class ParOuImpar {
	private static Scanner le;

	public static void main(String[] args) {
		le = new Scanner(System.in);
		
		String nome;
		int num;
		
		
		System.out.print("Meu chapa, diga seu nome: ");
		nome = le.nextLine();
		
		System.out.print("Me diga um numero: ");
		num = le.nextInt();
		
		if(num%2 == 0) {
			System.out.println(nome + ", o número É PAR!");
		}
		else{
			System.out.println(nome + ", o número É IMPAR!");
		}
		
	}
}
