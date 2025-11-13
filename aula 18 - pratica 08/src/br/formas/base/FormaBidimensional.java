package br.formas.base;

public abstract class FormaBidimensional extends FormaGeometrica {
    public FormaBidimensional(String nome) {
        super(nome);
    }

    // além da área, as formas 2D também têm perímetro
    public abstract double calcularPerimetro();
}
