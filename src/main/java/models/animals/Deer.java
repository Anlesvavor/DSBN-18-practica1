package models.animals;

import com.sun.org.apache.xerces.internal.impl.dv.xs.BooleanDV;
import models.interfaces.Consumidor;
import models.subtypes.Herbivorous;

/**
 * Model that represents a deer inside de application
 * @author Jesus Jose Saenz Fierro
 * @see models.Animal
 * @since 1.0
 * @version 1.0
 */

public class Deer extends Herbivorous implements Consumidor{
    private Boolean mudaCuernos;

    public Boolean getMudaCuernos() {
        return mudaCuernos;
    }

    public Deer() {
        this.mudaCuernos = Boolean.FALSE;
    }

    public Deer(Boolean mudaCuernos) {
        this.mudaCuernos = mudaCuernos;
    }

    public void setMudaCuernos(Boolean mudaCuernos) {
        this.mudaCuernos = mudaCuernos;
    }

    @Override
    public void comer() {
        System.out.println("mooooo");
    }
}
