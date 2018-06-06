package bla.bla.bla.bla.beans;

import java.util.Scanner;

public class CalRegra3 {
	//PROCEDIMENTO PARA TITULO
	public static void titulo(){
		//TABELINHA PARA MELHOR ENTENDIMENTO DO USUÁRIO
		System.out.println("===============================");		
		System.out.println("   CALCULADORA DE REGRA DE 3");
		System.out.println("===============================");
		System.out.println("  Valor de A |\t Valor de B \n  Valor de C |\t Valor de X");
		System.out.println("===============================");		
		System.out.println("Considerando essa tabela:");
		
	}


	public static void main(String[] args) {
		//SCANNER PARA PEGAR VALORES VIA CONSOLE
		Scanner le = new Scanner(System.in);
		titulo();

		//PONHO VALORES NAS VARIAVEIS	
		System.out.print("#Valor de 'A': ");
		float a = le.nextFloat();

		System.out.print("#Valor de 'B': ");
		float b = le.nextFloat();

		System.out.print("#Valor de 'C': ");
		float c = le.nextFloat();

		//CALCULO A REGRA DE TRES SIMPLES
		float x = c*b / a;

		//MOSTRO O RESULTADO NA TELA

		System.out.println("===============================");
		System.out.println("  "+a+"\t|\t"+b+"\n  "+c+"\t|\t"+x);
		System.out.println("===============================");
	}
}
