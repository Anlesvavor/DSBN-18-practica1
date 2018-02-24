package models.animals;

import models.enums.Caza;
import models.subtypes.Carnivorous;

/**
 * Model that represents a owl inside de application
 * @author Jesus Jose Saenz Fierro
 * @see models.Animal
 * @since 1.0
 * @version 1.0
 */

public class Owl extends Carnivorous {

    private Float envergadura;
    private Boolean esDeRapiña;

    public Owl(Float envergadura, Boolean esDeRapiña) {
        this.envergadura = envergadura;
        this.esDeRapiña = esDeRapiña;
    }

    public Owl(Caza caza, Float envergadura, Boolean esDeRapiña) {
        super(caza);
        this.envergadura = envergadura;
        this.esDeRapiña = esDeRapiña;
    }

    public Owl(Caza caza, Boolean zarpado, Boolean dentado, Float tasaDeExito, Integer caceriasMensuales, Float envergadura, Boolean esDeRapiña) {
        super(caza, zarpado, dentado, tasaDeExito, caceriasMensuales);
        this.envergadura = envergadura;
        this.esDeRapiña = esDeRapiña;
    }

    public Float getEnvergadura() {
        return envergadura;
    }

    public void setEnvergadura(Float envergadura) {
        this.envergadura = envergadura;
    }

    public Boolean getEsDeRapiña() {
        return esDeRapiña;
    }

    public void setEsDeRapiña(Boolean esDeRapiña) {
        this.esDeRapiña = esDeRapiña;
    }
}
