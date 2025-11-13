package br.formas.bidimensionais;
import br.formas.base.FormaBidimensional;

public class Circulo extends FormaBidimensional {
    private double raio;
    private final double PI = 3.1415;

    public Circulo(double raio) {
        super("Círculo");
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return PI * raio * raio;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * PI * raio;
    }

    @Override
    public String toString() {
        return nome + " | Raio: " + raio +
               " | Área: " + calcularArea() +
               " | Perímetro: " + calcularPerimetro();
    }
}
