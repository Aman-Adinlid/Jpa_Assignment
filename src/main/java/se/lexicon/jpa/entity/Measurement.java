package se.lexicon.jpa.entity;

public enum Measurement {
    TBSP, TSP, G, HG, KG, ML, CL, DL;

    private String measurement;

    Measurement() {

    }

    Measurement(String measurement) {
        this.measurement = measurement;
    }
}
