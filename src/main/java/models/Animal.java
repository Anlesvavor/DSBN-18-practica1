package models;

import models.enums.Genero;

import java.awt.*;

/**
 * @Author Jesus Jose Saenz Fierro on 09/02/18.
 */
public class Animal {

    private Genero genero;
    private Color color;
    private Double peso;
    private Double altura;
    private Boolean hiberna;

    public Animal() {
        this.setGenero(Genero.FEMENINO);
        this.setColor(Color.BLACK);
        this.setPeso(0.1d);
        this.setAltura(0.1d);
        this.setHiberna(Boolean.FALSE);
    }

    public Animal(Genero genero) {
        this(); // Invoca al constructor
        this.setGenero(genero);
    }

    public Animal(Genero genero, Color color) {
        this(genero);
        this.setColor(Color.BLACK);
    }

    public Animal(Genero genero, Color color, Double peso) {
        this(genero, color);
        this.setPeso(peso);
    }

    public Animal(Genero genero, Color color, Double peso, Double altura) {
        this(genero, color, peso);
        this.setAltura(altura);
    }


    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Boolean getHiberna() {
        return hiberna;
    }

    public void setHiberna(Boolean hiberna) {
        this.hiberna = hiberna;
    }
}
