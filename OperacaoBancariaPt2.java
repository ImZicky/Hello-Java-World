import java.util.Scanner;

public class BancoCreuza {
	
	static void titulo(String pNome) {
		System.out.println("============================================================");
		System.out.println("		Banco Do " + pNome);
		System.out.println("============================================================");
	}
	
	public static void main(String[] args) {
	
		String nome;
		
		Scanner le = new Scanner(System.in);
		
		Operacao operacao = new Operacao();
		
		System.out.println("------------------------------------------------------------");		
		System.out.print("		Qual o seu nome? >> ");
		nome = le.next();
		System.out.println("------------------------------------------------------------");
		
		titulo(nome);
		
		System.out.print("Você tem quanto na sua conta? >> ");
		double pValorConta = le.nextInt();
		
		operacao.setValorConta(pValorConta);
		
		
		System.out.println("['1' = Deposito] ['2' = Saque] ['3' = Converter Moeda]");
		int tipoOperacao = le.nextInt();
		
		double resp = (double) operacao.escolha(tipoOperacao);

		System.out.println("	Vc tem agr: $" + resp + " ," + nome);
			
	}

}
