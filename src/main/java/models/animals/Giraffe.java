package models.animals;

import models.enums.Dieta;
import models.subtypes.Herbivorous;

/**
 * Model that represents a Girrafe inside de application
 * @author Jesus Jose Saenz Fierro
 * @see models.Animal
 * @since 1.0
 * @version 1.0
 */

public class Giraffe extends Herbivorous {

    private Float longitudCuello;

    public Giraffe() {
        this.longitudCuello = 1.5f;
    }

    public Giraffe(Float longitudCuello) {
        this.longitudCuello = longitudCuello;
    }

    public Giraffe(Boolean esRumiante, Dieta dieta, Float longitudCuello) {
        super(esRumiante, dieta);
        this.longitudCuello = longitudCuello;
    }

    public Float getLongitudCuello() {
        return longitudCuello;
    }

    public void setLongitudCuello(Float longitudCuello) {
        this.longitudCuello = longitudCuello;
    }
}
