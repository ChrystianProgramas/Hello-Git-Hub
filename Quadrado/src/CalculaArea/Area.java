package CalculaArea;
public class Area {
    private double areaCirculo;
    private double areaQuadrado;
    private double areaRetangulo;
    private double areaTriangulo;
    void Circulo(double pi, double raio) {
        this.areaCirculo = pi * raio * 2;
        System.out.println ("A area do circulo �: " + this.areaCirculo);
    }
    void Quadrado(double lado) {
        this.areaQuadrado = lado * lado;
        System.out.println ("A area do quadrado �: " + this.areaQuadrado);
    }
    void Retangulo(double base, double altura) {
        this.areaRetangulo = base * altura;
        System.out.println ("A area do retangulo �: " + this.areaRetangulo);
    }
    void Triangulo(double base, double altura) {
        this.areaTriangulo = (base * altura)/2;
        System.out.println ("A area do triangulo �: " + this.areaTriangulo);        
    }
}