package models.animals;

import com.sun.org.apache.xpath.internal.operations.Bool;
import models.enums.Caza;
import models.interfaces.Consumidor;
import models.subtypes.Carnivorous;

/**
 * Model that represents a Lion inside de application
 * @author Jesus Jose Saenz Fierro
 * @see models.Animal
 * @since 1.0
 * @version 1.0
 */

public class Lion extends Carnivorous implements Consumidor{

    private Boolean tieneMelena;
    private Boolean esLider;

    public Lion() {
    }

    public Lion(Boolean tieneMelena, Boolean esLider) {
        this.tieneMelena = tieneMelena;
        this.esLider = esLider;
    }

    public Lion(Caza caza, Boolean tieneMelena, Boolean esLider) {
        super(caza);
        this.tieneMelena = tieneMelena;
        this.esLider = esLider;
    }

    public Lion(Caza caza, Boolean zarpado, Boolean dentado, Float tasaDeExito, Integer caceriasMensuales, Boolean tieneMelena, Boolean esLider) {
        super(caza, zarpado, dentado, tasaDeExito, caceriasMensuales);
        this.tieneMelena = tieneMelena;
        this.esLider = esLider;
    }

    public Boolean getTieneMelena() {
        return tieneMelena;
    }

    public void setTieneMelena(Boolean tieneMelena) {
        this.tieneMelena = tieneMelena;
    }

    public Boolean getEsLider() {
        return esLider;
    }

    public void setEsLider(Boolean esLider) {
        this.esLider = esLider;
    }

    @Override
    public void comer() {
        System.out.println("chomp chomp");
    }
}
