package models.animals;

import models.enums.Dieta;
import models.subtypes.Herbivorous;

/**
 * Model that represents a Toucan inside de application
 * @author Jesus Jose Saenz Fierro
 * @see models.Animal
 * @since 1.0
 * @version 1.0
 */

public class Toucan extends Herbivorous {

    private Float longitudPico;
    private String canto;

    public Toucan(Float longitudPico, String canto) {
        this.longitudPico = longitudPico;
        this.canto = canto;
    }

    public Toucan(Boolean esRumiante, Dieta dieta, Float longitudPico, String canto) {
        super(esRumiante, dieta);
        this.longitudPico = longitudPico;
        this.canto = canto;
    }

    public Float getLongitudPico() {
        return longitudPico;
    }

    public void setLongitudPico(Float longitudPico) {
        this.longitudPico = longitudPico;
    }

    public String getCanto() {
        return canto;
    }

    public void setCanto(String canto) {
        this.canto = canto;
    }
}
