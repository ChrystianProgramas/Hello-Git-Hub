import java.util.Scanner;
public class ImpostoDeRenda {
	static Scanner leia = new Scanner (System.in);
	public static void main(String[] args) {
		
		double salarioH, salarioM, salarioC;
		int imposto = 0;
		
		System.out.println("Informe o salário do homem: ");
		salarioH = leia.nextDouble();
		System.out.println("Informe o salário da mulher");
		salarioM = leia.nextDouble();
		
		salarioC=salarioH+salarioM;
		
		 if (salarioH+salarioM<=900){
		 System.out.println("Isento");
         }else if (salarioC>900 | salarioC<=1500){
          imposto=(int) (salarioC*0.10);}
		 else if (salarioC>1500 | salarioC<=25000){
		 imposto=(int) (salarioC*0.15);
		 System.out.println("Imposto= "+  imposto );
	     System.out.println("Renda conjunta= "+ salarioC);	
		 System.out.println("Renda liquida= "+ (salarioC - imposto));
		 }else
	     imposto=(int) (salarioC*0.25);
		 System.out.println("Imposto= "+  imposto );
	     System.out.println("Renda conjunta= "+ salarioC);	
		 System.out.println("Renda liquida= "+ (salarioC - imposto));}
		 

        }
		

	