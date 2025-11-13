package br.formas.base;

public abstract class FormaGeometrica {
    protected String nome;

    public FormaGeometrica(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    // método abstrato que as subclasses devem implementar
    public abstract double calcularArea();
}
