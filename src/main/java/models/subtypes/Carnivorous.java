package models.subtypes;

import com.sun.org.apache.xpath.internal.operations.Bool;
import models.Animal;
import models.enums.Caza;
import models.enums.Genero;

import java.awt.*;

/**
 *  Model that represents a @code{models.Animal} that consumes meat
 *  @author Jesus Jose Saenz Fierro
 *  @see models.Animal
 *  @since 1.0
 *  @version 1.0
 */


public class Carnivorous extends Animal {

    private Caza caza;
    private Boolean zarpado;
    private Boolean dentado;
    private Float tasaDeExito;
    private Integer caceriasMensuales;

    public Carnivorous() {
        this.caza = Caza.PERSIGUE;
        this.zarpado = Boolean.TRUE;
        this.dentado = Boolean.TRUE;
        this.tasaDeExito = 0.10f;
        this.caceriasMensuales = 30;
    }

    public Carnivorous(Caza caza) {
        this();
        this.caza = caza;
    }


    public Carnivorous(Caza caza, Boolean zarpado, Boolean dentado, Float tasaDeExito, Integer caceriasMensuales) {
        this.caza = caza;
        this.zarpado = zarpado;
        this.dentado = dentado;
        this.tasaDeExito = tasaDeExito;
        this.caceriasMensuales = caceriasMensuales;
    }


    public Caza getCaza() {
        return caza;
    }

    public void setCaza(Caza caza) {
        this.caza = caza;
    }

    public Boolean getZarpado() {
        return zarpado;
    }

    public void setZarpado(Boolean zarpado) {
        this.zarpado = zarpado;
    }

    public Boolean getDentado() {
        return dentado;
    }

    public void setDentado(Boolean dentado) {
        this.dentado = dentado;
    }

    public Float getTasaDeExito() {
        return tasaDeExito;
    }

    public void setTasaDeExito(Float tasaDeExito) {
        this.tasaDeExito = tasaDeExito;
    }

    public Integer getCaceriasMensuales() {
        return caceriasMensuales;
    }

    public void setCaceriasMensuales(Integer caceriasMensuales) {
        this.caceriasMensuales = caceriasMensuales;
    }







}
