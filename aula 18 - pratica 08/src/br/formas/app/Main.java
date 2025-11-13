package br.formas.app;

import java.util.ArrayList;

// importando as classes base
import br.formas.base.*;

// importando as classes concretas
import br.formas.bidimensionais.*;
import br.formas.tridimensionais.*;

public class Main {
    public static void main(String[] args) {

        // listas separadas para formas 2D e 3D
        ArrayList<FormaBidimensional> formas2D = new ArrayList<>();
        ArrayList<FormaTridimensional> formas3D = new ArrayList<>();

        // adicionando algumas formas
        formas2D.add(new Quadrado(4));
        formas2D.add(new Retangulo(3, 6));
        formas2D.add(new Circulo(2.5));

        formas3D.add(new Cubo(3));

        // retornando formas 2D
        System.out.println("=== FORMAS 2D ===");
        for (FormaBidimensional f : formas2D) {
            System.out.println(f.toString());
        }

        // retornando formas 3D
        System.out.println("\n=== FORMAS 3D ===");
        for (FormaTridimensional f : formas3D) {
            System.out.println(f.toString());
        }
    }
}
