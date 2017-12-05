import java.util.Scanner;
public class HotelDiaria {
	static Scanner leia = new Scanner (System.in);
	public static void main(String[] args) {
	
		double taxa = 0, dias;
		int diaria=300;
		
	
		
		
		System.out.println("Digite o numero de dias: ");
		dias = leia.nextDouble();
		
		
		    if (dias<15){
			taxa=((diaria*dias)+(dias*20));
			System.out.println("Taxa adicional " + taxa);
		    } else if (dias==15){
			taxa=((diaria*dias)+(dias*14));
			} else
				taxa=((diaria*dias)+(dias*12));
			System.out.println("Taxa Adicional "+ taxa);
		
		

	}

}
