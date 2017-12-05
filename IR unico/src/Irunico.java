import java.util.Scanner;


public class Irunico {
	static Scanner leia = new Scanner (System.in);
	public static void main(String[] args) {
		
		double rendabruta1, rendabruta, imposto=0, desconto;
		int pessoas;
		
		
		
		System.out.println("Informe a renda bruta anual: ");
		rendabruta1 = leia.nextDouble();
		System.out.println("Informe o numero de pessoas: ");
		pessoas = leia.nextInt();
		
		
		desconto = (600*pessoas);
		rendabruta = (rendabruta1-desconto);
		
		 if (rendabruta<=10.000){
		 System.out.println("Isento");
         }else if (rendabruta>10000 && rendabruta <= 30000){
          imposto = (rendabruta*0.05);
          System.out.println("Imposto= "+  imposto );}
		 else if (rendabruta>30000 && rendabruta<=60000){
		 imposto = (rendabruta*0.10);
		 System.out.println("Imposto= "+  imposto );}
	     else
	     imposto = (rendabruta*0.15);
		 System.out.println("Imposto= "+  imposto );}
	    
		 
		
		

	}


