import java.util.Scanner;
public class Pescador {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner leia = new Scanner (System.in);
		
		double peso, execesso, multa=4;
		
		System.out.println("Quantidade de kg dos peixes: ");
		peso = leia.nextDouble();
		if (peso<=50){
			System.out.println("Não precisa de multa");
		}else if(peso > 50){
			execesso = peso - 50;
			System.out.println( (execesso*peso));
		System.out.println("Multa:"+ multa*peso);}
			
		
	}
	}
		
	
		
		
		
				

	


