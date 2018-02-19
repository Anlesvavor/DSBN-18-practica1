package models.subtypes;

import models.Animal;
import models.enums.Dieta;

/**
 *  Model that represents a @code{models.Animal} that consumes weeds
 *  @author Jesus Jose Saenz Fierro
 *  @see models.Animal
 *  @since 1.0
 *  @version 1.0
 */

public class Herbivorous extends Animal {

    private Boolean esRumiante;
    private Dieta dieta;

    public Herbivorous() {
        this.esRumiante = Boolean.TRUE;
        this.dieta = Dieta.FITOFAGO;
    }

    public Herbivorous(Boolean esRumiante, Dieta dieta) {
        this.esRumiante = esRumiante;
        this.dieta = dieta;
    }

    public Boolean getEsRumiante() {
        return esRumiante;
    }

    public void setEsRumiante(Boolean esRumiante) {
        this.esRumiante = esRumiante;
    }

    public Dieta getDieta() {
        return dieta;
    }

    public void setDieta(Dieta dieta) {
        this.dieta = dieta;
    }
}
