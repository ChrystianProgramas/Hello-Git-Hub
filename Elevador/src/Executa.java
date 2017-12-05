import java.util.Scanner;


public class Executa {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner (System.in);
		Elevador e = new Elevador();
		int x=0;
		e.inicializa();
		while (x<10000){
		System.out.println("Digite 1 para subir/Digite 2 para descer/Digite 3 para entrar uma pessoa/Digite 4 para sair uma pessoa");
		x = leia.nextInt();
		if (x == 1){
		e.subir();}
		else if (x==2){
			e.Descer();}
			if (x==3){
				e.entrar();}
				else if (x==4){
				e.Sair();}
				System.out.println("Quantidade de pessoas: "+ e.capatual);
				System.out.println("Andar atual do elevador: " +  e.andaratual);
			}
		
		}
}
		
		
	
	
	
	
	