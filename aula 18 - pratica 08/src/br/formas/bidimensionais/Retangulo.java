package br.formas.bidimensionais;
import br.formas.base.FormaBidimensional;

public class Retangulo extends FormaBidimensional {
    private double base;
    private double altura;

    public Retangulo(double base, double altura) {
        super("Retângulo");
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (base + altura);
    }

    @Override
    public String toString() {
        return nome + " | Base: " + base + " | Altura: " + altura +
               " | Área: " + calcularArea() +
               " | Perímetro: " + calcularPerimetro();
    }
}
