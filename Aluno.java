package bla.bla.bla.bla.beans;

import java.util.Scanner;

public class Aluno {

	public static void main(String[] args) {
		
		float[] notas = new float[10];
		float[] frequencias = new float[10];
		String[] nomes = new String[10];
		
		Scanner le = new Scanner(System.in);
		
		int cont = 1;
		for (int i = 0; i < nomes.length; i++) {
			System.out.print("Qual o nome do "+ cont+"° aluno: ");
			nomes[i] = le.next();
			cont++;
		}
		cont=0;
		
		for (int i = 0; i < notas.length; i++) {
			System.out.print("Qual a nota de "+ nomes[i] +": ");
			notas[i] = le.nextFloat();

		}
		
		for (int i = 0; i < notas.length; i++) {
			System.out.print("Qual a frequencia de "+ nomes[i] +" nesse bimestre: ");
			frequencias[i] = le.nextFloat();

		}
		
	    for (int i = 0; i < 50; i++) {
			System.out.println();
		}
	
		System.out.println("Quer consultar infos de qual aluno: ");
		String pNome = le.next(); 
		
		for (int i = 0; i < nomes.length; i++) {
			if (nomes[i].equals(pNome)) {
				
				System.out.println(" Nome: " + nomes[i]);
				System.out.println(" Nota: " + notas[i]);
				System.out.println(" Frequencia: " + frequencias[i]);
				break;
			}else {
				System.out.println("Desculpe, mas o aluno não se encontra nessa sala.");
				break;
			}
		}
	}
}
