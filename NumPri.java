import java.util.Scanner;

public class NumPri {
	private static Scanner le;

	public static void main(String[] args) {
		Scanner le = new Scanner(System.in);
		
		String resp;
		String produto, nome;
		double desconto, acrecimo, preco, novoPreco = 0;
		
		System.out.println("-------------------------------------------------------------");
		System.out.println("                      LOJA DE 1,99");
		System.out.println("-------------------------------------------------------------");
		System.out.println();
		
		System.out.print("Qual o seu nome meu chapa: ");
		nome = le.nextLine();
		
		System.out.print(nome + ", qual o nome do produto que quer comprar: ");
		produto = le.nextLine();				
		
		System.out.print(nome + ", qual o preço normal de 1 " + produto + ": ");
		preco = le.nextDouble();
		
		System.out.print(">des< ou um acrécimo >aum< no valor total do seu produto: ");
		resp = le.nextLine();
		

				
		switch (resp) {
		case "des":
			System.out.print("e ai meu chapa, de quantos por cento irá ser o seu desconto: ");
			desconto = le.nextDouble();
			novoPreco = preco - (preco * desconto/100);
			break;
		
		case ("aum"):
			
				System.out.print("e ai meu chapa, de quantos por cento vai ser o seu aumento: ");
				acrecimo = le.nextDouble();
				novoPreco = preco + (preco * acrecimo/100);
				
		
		
		System.out.println(nome + ", o " + produto + " que valia R$" + preco + " agora vale: R$" + novoPreco);
				
	}
}

}
