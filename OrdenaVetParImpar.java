package bla.bla.bla.bla.beans;


public class OrdenaVetParImpar {
	public static void main(String[] args) {
		//CRIO O VETOR PARA SEPARAR
		int vet1[] = {2,5,9,3,4,7,8,0,-5,1,-8,5};
		
		//CRIO OS CONTADORES
		int contaPar = 0;
		int contaImpar = 0;
		
		//CONTO QUANTOS PARES / IMPARES
		for (int i = 0; i < vet1.length; i++) {
			if(vet1[i]%2 == 0){
				contaPar++;
			}else {
				contaImpar++;
			}
		}
		
		//CRIO OS VETORES DE PARES E IMPARES
		int vetPar[] = new int[contaPar];
		int vetImpar[] = new int[contaImpar];
		
		//CRIO VAR AUXILIAR
		int j = 0;
		int k = 0;

		//SEPARO OS PARES E IMPARES
		for (int i = 0; i < vet1.length; i++) {
			if(vet1[i] % 2 == 0) {
				vetPar[j] = vet1[i];
				j++;
			}else {
				vetImpar[k] = vet1[i];
				k++;
			}
		}
		
		//ESCREVO OS VETORES DE IMPAR E PAR
		for (int i = 0; i < vetImpar.length; i++) {
			System.out.print(" ["+vetImpar[i]+"] ");
		}
		
		System.out.println();
		
		for (int i = 0; i < vetPar.length; i++) {
			System.out.print(" ["+vetPar[i]+"] ");			
		}
	}
}
