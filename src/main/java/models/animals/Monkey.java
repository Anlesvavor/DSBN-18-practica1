package models.animals;

import models.enums.Dieta;
import models.subtypes.Herbivorous;

/**
 * Model that represents a Monkey inside de application
 * @author Jesus Jose Saenz Fierro
 * @see models.Animal
 * @since 1.0
 * @version 1.0
 */

public class Monkey extends Herbivorous {

    public Boolean lanzaPopo;
    public Boolean fuman;
    public Boolean pelanPlatanos;

    public Monkey(Boolean lanzaPopo, Boolean fuman, Boolean pelanPlatanos) {
        this.lanzaPopo = lanzaPopo;
        this.fuman = fuman;
        this.pelanPlatanos = pelanPlatanos;
    }

    public Monkey(Boolean esRumiante, Dieta dieta, Boolean lanzaPopo, Boolean fuman, Boolean pelanPlatanos) {
        super(esRumiante, dieta);
        this.lanzaPopo = lanzaPopo;
        this.fuman = fuman;
        this.pelanPlatanos = pelanPlatanos;
    }

    public Boolean getLanzaPopo() {
        return lanzaPopo;
    }

    public void setLanzaPopo(Boolean lanzaPopo) {
        this.lanzaPopo = lanzaPopo;
    }

    public Boolean getFuman() {
        return fuman;
    }

    public void setFuman(Boolean fuman) {
        this.fuman = fuman;
    }

    public Boolean getPelanPlatanos() {
        return pelanPlatanos;
    }

    public void setPelanPlatanos(Boolean pelanPlatanos) {
        this.pelanPlatanos = pelanPlatanos;
    }
}
