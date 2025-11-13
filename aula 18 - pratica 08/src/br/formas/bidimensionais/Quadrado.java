package br.formas.bidimensionais;
import br.formas.base.FormaBidimensional;

public class Quadrado extends FormaBidimensional {
    private double lado;

    public Quadrado(double lado) {
        super("Quadrado");
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }

    @Override
    public double calcularPerimetro() {
        return 4 * lado;
    }

    @Override
    public String toString() {
        return nome + " | Lado: " + lado + 
               " | Área: " + calcularArea() + 
               " | Perímetro: " + calcularPerimetro();
    }
}
