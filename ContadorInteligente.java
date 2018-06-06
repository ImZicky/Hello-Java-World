package bla.bla.bla.bla.beans;

//FACA UM ALGORITMO QUE CONTE APARTIR DE ORDENS DO USUÁRIO (PENSE EM TODOS OS JEITOS DE CONTAR)
//[...3,2,1,0,-1,-2,-3...{PULANDO DE N EM N} OU ...-3,-2,-1,0,1,2,3... {PULANDO DE N EM N}]
import java.util.Scanner;

public class ContadorInteligente {

	public static void titulo() {
		System.out.println("---------------------------------");		
		System.out.println("     CONTADOR INTELIGENTE");
		System.out.println("---------------------------------");
		System.out.println();
	} 
	
	public static void main(String[] args) {

		int cont;
		boolean termino = false;
		
		Scanner le = new Scanner(System.in); 
		
		titulo();
		
		System.out.print("Vc quer contar de: ");
		int de = le.nextInt();
		
		System.out.print("Vc quer contar ate: ");
		int ate = le.nextInt();
		
		System.out.print("Vc quer ir pulando: ");
		int pulo = le.nextInt();
		
		if (de == ate || pulo == 0) {
			System.out.println();
			System.out.println("SERGIO MALANDRO, É VC?");
		}
		
		if (pulo != 0) {
			
			if(pulo < 0) {
				pulo = pulo * -1;
			}
		
			if(de > ate) {
				while (de > ate) {
					System.out.println(de);				
					de = de - pulo;
				}
			System.out.println(de);				
			}
			
			if(de < ate) {
				while (de <= ate) {
					System.out.println(de);								
					de = de + pulo;	
				}
			}
		}
		System.out.println("---------------------------------");			
	}
		
}
	