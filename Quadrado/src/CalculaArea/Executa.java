package CalculaArea;
import java.util.Scanner;
class CalculaArea {
    public static void main(String args[]) {
        @SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
        Menu menu = new Menu();
        int opc2;
    do {    
        menu.Principal();
        int opc = entrada.nextInt();
        switch (opc) {
        case 1 : menu.Circulo();
        break;
        case 2 : menu.Triangulo();
        break;
        case 3 : menu.Retangulo();
        break;
        case 4 : menu.Triangulo();
        break;
        }
        System.out.println ("Deseja voltar para o Menu Principal? 1.Sim / 2.Não");
        opc2 = entrada.nextInt();    
    } while (opc2 == 1);
    }
}