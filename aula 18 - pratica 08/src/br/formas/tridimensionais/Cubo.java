package br.formas.tridimensionais;
import br.formas.base.FormaTridimensional;

public class Cubo extends FormaTridimensional {
    private double lado;

    public Cubo(double lado) {
        super("Cubo");
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return 6 * (lado * lado);
    }

    @Override
    public double calcularVolume() {
        return lado * lado * lado;
    }

    @Override
    public String toString() {
        return nome + " | Lado: " + lado +
               " | Área total: " + calcularArea() +
               " | Volume: " + calcularVolume();
    }
}
