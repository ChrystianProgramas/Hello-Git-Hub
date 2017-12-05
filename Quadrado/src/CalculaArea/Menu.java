package CalculaArea;
import java.util.Scanner;

import CalculaArea.Area;
public class Menu {
    Scanner entrada = new Scanner(System.in);
    Area area = new Area();
    void Principal () {
        System.out.println ("Calcula Area OOP by Gnomo");
        System.out.println ("1 - Area do Circulo");
        System.out.println ("2 - Area do Quadrado");
        System.out.println ("3 - Area do Retangulo");
        System.out.println ("4 - Area do Triângulo Retângulo");
    }
    void Circulo() {
        System.out.println ("Digite o valor de PI: ");
        double pi = entrada.nextDouble();
        System.out.println ("Digite o RAIO: ");
        double raio = entrada.nextDouble();    
        area.Circulo(pi,raio);
    }
    void Quadrado() {
        System.out.println ("Digite o valor do lado do quadrado: ");
        double lado = entrada.nextDouble();
        area.Quadrado(lado);
    }
    void Retangulo() {
        System.out.println ("Digite o valor da base: ");
        double base = entrada.nextDouble();
        System.out.println ("Digite o valor da altura: ");
        double altura = entrada.nextDouble();
        area.Retangulo(base,altura);
    }
    void Triangulo() {
        System.out.println ("Digite o valor da base: ");
        double base = entrada.nextDouble();
        System.out.println ("Digite o valor da altura");
        double altura = entrada.nextDouble();
        area.Triangulo(base, altura);
    }
}
