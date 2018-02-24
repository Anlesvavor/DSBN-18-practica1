package models.animals;

import models.enums.Dieta;
import models.interfaces.Consumidor;
import models.subtypes.Herbivorous;

/**
 * Model that represents a Elephant inside de application
 * @author Jesus Jose Saenz Fierro
 * @see models.Animal
 * @since 1.0
 * @version 1.0
 */

public class Elephant extends Herbivorous implements Consumidor{
    private Boolean sabeDeAgua;
    private Float longitudCuernos;

    public Elephant() {
        this.sabeDeAgua = Boolean.FALSE;
        this.longitudCuernos = 1.0f;
    }


    public Elephant(Boolean esRumiante, Dieta dieta, Boolean sabeDeAgua, Float longitudCuernos) {
        super(esRumiante, dieta);
        this.sabeDeAgua = sabeDeAgua;
        this.longitudCuernos = longitudCuernos;
    }

    public Boolean getSabeDeAgua() {
        return sabeDeAgua;
    }

    public void setSabeDeAgua(Boolean sabeDeAgua) {
        this.sabeDeAgua = sabeDeAgua;
    }

    public Float getLongitudCuernos() {
        return longitudCuernos;
    }

    public void setLongitudCuernos(Float longitudCuernos) {
        this.longitudCuernos = longitudCuernos;
    }

    @Override
    public void comer() {
        System.out.println("ñom, ñom");
    }

    @Override
    public String toString() {
        return "Hola soy un elefante";
    }
}
