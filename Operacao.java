import java.util.Scanner;

public class Operacao {
	
	double valorConta;
	double saldoAtual;

	Scanner le = new Scanner(System.in);

	
	void setValorConta(double pValorConta){
		this.valorConta = pValorConta;
	}
	

	
	double escolha(int pTipoOperacao){
		switch (pTipoOperacao) {
		case 1:
			System.out.println("--------------------------------------------------------");
			System.out.println(" 	       	Deposito");
			System.out.println("--------------------------------------------------------");
			System.out.print("   Quanto vc quer depositar? >> ");
			int dep = le.nextInt();
			return valorConta + dep;
			 
		case 2:
			System.out.println("--------------------------------------------------------");
			System.out.println(" 	       	Saque");
			System.out.println("--------------------------------------------------------");
			System.out.print("   Quanto vc quer Sacar? >> ");
			int saq = le.nextInt();
			return valorConta - saq;
	
		case 3:
			System.out.println("--------------------------------------------------------");
			System.out.println(" 	        Conversão");
			System.out.println("--------------------------------------------------------");
			System.out.println(" [1 = Dollar] [2 = Euro] ");
			int conv = le.nextInt();
			
			if (conv == 1) {
				return valorConta/3.41; 
		
				
			}else if(conv == 2) {
				return valorConta/4.19;
			
			
			}else {return 69.;}
			
		default:
			System.out.println("Vc digitou errado fera...");
			break;
		}
		
		return pTipoOperacao;
	}
	
	
}
