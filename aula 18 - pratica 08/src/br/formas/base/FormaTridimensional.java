package br.formas.base;

public abstract class FormaTridimensional extends FormaGeometrica {
    public FormaTridimensional(String nome) {
        super(nome);
    }

    // as formas 3D também têm volume
    public abstract double calcularVolume();
}
