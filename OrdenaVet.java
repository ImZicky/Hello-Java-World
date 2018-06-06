package bla.bla.bla.bla.beans;

//ORDENE UM VETOR DO MAIOR VALOR PRA O MENOR BASEADO EM DOIS VETORES COM VALORES INTEIROS

public class OrdenaVet {

	public static void main(String[] args) {
		//CRIO DOIS VETORES
		int [] vet1 = {-5, -9, -3, 4, -8, -50};
		int [] vet2 = {30, 55, 74 ,2 , 5, 32};
		//FAÇA DOIS INDICES
		int i = 0, j = 0;
		//CALCULO O TAMANHO DO TERCEIRO VETOR
		int n = vet1.length + vet2.length; 
		//CRIO O TERCEIRO VETOR
		int[] vet3 = new int[n];
		
		//PREENCHO O TERCEIRO VETOR COM OS VALORES DOS DOIS PRIMEIROS
		for (int k = 0; k < vet3.length; k++) {
			if(i < 6) {
					vet3[k] = vet1[i];
					i++;
				}
		}

		for (int k = 6; k < vet3.length; k++) {
			vet3[k] = vet2[j];
			j++;
		}
		//FAÇO UMA VARIAVEL PRA TROCA DE VALORES
		int change;
		//CRIO DOIS FORS PRA LER OS VETORES 
		for (int k = 0; k < vet3.length; k++) {
			for (int k2 = 0; k2 < vet3.length; k2++) {
				//SE O ANTECESSOR FOR MAIOR QUE O SUCESSOR, TROCA OS VALORES
				if(vet3[k] > vet3[k2]) {
					change = vet3[k];
					vet3[k] = vet3[k2];
					vet3[k2] = change;		
				}
			}
		}
		//MOSTRO NA TELA O VETOR ORDENADO DO MAIOR(74) PRA O MENOR(-50)
		for (int k = 0; k < vet3.length; k++) {
			System.out.print(" ["+vet3[k]+"] ");
		}
	}
}
