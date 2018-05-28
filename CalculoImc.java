
import java.util.Scanner;

public class CalculoImc {

	public static void titulo() {
		System.out.println("-----------------------------------");		
		System.out.println("                IMC               ");
		System.out.println("-----------------------------------");
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		boolean normal = false, anormal = false;
		float minPeso;
		
		Scanner le = new Scanner(System.in);
		
		titulo();
		
		System.out.print("Qual a sua altura: ");
		float altura = le.nextFloat();
		
		System.out.print("Qual o seu peso: ");
		float peso = le.nextFloat();
		
		
		float imc =  peso / (altura * altura);
		
		System.out.println("-----------------------------------");
		
		System.out.println("imc: " + imc);
		
		if (imc < 17) {
			System.out.println("Muito abaixo do peso");
			anormal = true;
			
		}else if(imc >= 17 && imc <= 18.49 ) {
			System.out.println("Abaixo do peso");
			anormal = true;
			
		}else if(imc >= 18.50 && imc <= 24.99) {
			System.out.println("Peso Nomal");
			
			
		}else if(imc >= 25 && imc <= 29.99) {
			System.out.println("Sobre peso");
			normal = true;
			
		}else if(imc >= 30 && imc <= 34.99) {
			System.out.println("Obesidade 1");
			normal = true;
			
		}else if(imc >= 35 && imc <= 39.99) {
			System.out.println("Obesidade 2");
			normal = true;
			
		}else{
			System.out.println("Obesidade 3");			
			normal = true;
			
		}
		System.out.println("-----------------------------------");
		
		if (normal == true) {
			while (imc > 24.99) {
				peso = (float) (peso - 1);
				imc =  peso / (altura * altura);
			}

			minPeso = peso;
			System.out.println("Vc deve ter no minimo: " + minPeso + "kg");

		}else if (anormal == true) {
			while (imc < 18.50) {
				peso = (float) (peso + 1);
				imc =  peso / (altura * altura);
			}		
			minPeso = peso;
			System.out.println("Vc deve ter no minimo: " + minPeso + "kg");

		}else {System.out.println("PARABENS!!!");}
		System.out.println("-----------------------------------");
	}
}
