import java.util.Scanner;


public class Reajuste {

	private static Scanner leia;

	public static void main(String[] args) {
		leia = new Scanner(System.in);
		
		int prod;
		double preco, precoF;
		
		System.out.println("Digite a venda mensal do produto: ");
		prod = leia.nextInt();
		System.out.println("Digite o valor do produto: ");
		preco = leia.nextDouble();
		
		
		if (prod<500){
		precoF = ((preco*0.10)+preco);
		System.out.println("Valor final do produto " + precoF);
	    }else if (prod<=500 && prod<1200){
		precoF = ((preco*0.15)+preco);
		System.out.println("Valor final do produto " + precoF);
	    }else {
		precoF = ((preco*0.20) - preco);
		System.out.println("Valor final do produto " + (-precoF));}
		
		

	    }
	}



