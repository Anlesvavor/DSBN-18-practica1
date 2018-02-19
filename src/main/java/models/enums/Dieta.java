package models.enums;

public enum Dieta {
    FITOFAGO(Boolean.TRUE, Boolean.FALSE, Boolean.FALSE, Boolean.FALSE, Boolean.FALSE),
    FRUGIVORO(Boolean.FALSE, Boolean.TRUE, Boolean.FALSE, Boolean.FALSE, Boolean.FALSE),
    FOLIVORO(Boolean.FALSE, Boolean.FALSE, Boolean.TRUE, Boolean.FALSE, Boolean.FALSE),
    GRANIVORO(Boolean.TRUE, Boolean.FALSE, Boolean.FALSE, Boolean.TRUE, Boolean.FALSE),
    XILOFAGO(Boolean.TRUE, Boolean.FALSE, Boolean.FALSE, Boolean.FALSE, Boolean.TRUE);

    private Boolean comeHierba;
    private Boolean comeFrutas;
    private Boolean comeHojas;
    private Boolean comeSemillas;

    Dieta(Boolean comeHierba, Boolean comeFrutas, Boolean comeHojas, Boolean comeSemillas, Boolean comeMadera) {
        this.comeHierba = comeHierba;
        this.comeFrutas = comeFrutas;
        this.comeHojas = comeHojas;
        this.comeSemillas = comeSemillas;
        this.comeMadera = comeMadera;
    }

    public Boolean getComeHierba() {
        return comeHierba;
    }

    public Boolean getComeFrutas() {
        return comeFrutas;
    }

    public Boolean getComeHojas() {
        return comeHojas;
    }

    public Boolean getComeSemillas() {
        return comeSemillas;
    }

    public Boolean getComeMadera() {
        return comeMadera;
    }

    private Boolean comeMadera;
}
