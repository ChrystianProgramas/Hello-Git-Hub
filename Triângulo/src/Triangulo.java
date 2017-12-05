import java.util.Scanner;
public class Triangulo {

	private static Scanner leia;

	public static void main(String[] args) {
		 leia = new Scanner (System.in);
	int num1, num2, num3;
	
	System.out.println("Escreva o primeiro lado do triângulo: ");
	num1 = leia.nextInt();
	
	System.out.println("Escreva o segundo lado do triângulo: ");
	num2 = leia.nextInt();
	
	System.out.println("Escreva o terceiro lado do triângulo: ");
	num3 = leia.nextInt();
	
	if ((num1<num2+num3) && (num2<num1+num3) && (num3<num1+num2));{
		System.out.println("Forma um triangulo");
	}
	if (num1 == num2 && num2 == num3 && num3 == num1) {
		System.out.println("Equilatero");
          } else if (num1 == num2 || num1 == num3){
              System.out.println("Isoceles");}
          else if (num1 != num2 && num2 != num3 && num3 != num2) {
          System.out.println("Escaleno");}
          else System.out.println("Estes valores não formam um triângulo");{
        	  
          
		
		}
		}

	
	}
