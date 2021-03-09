package se.lexicon.jpa.entity;

public enum Measurement {
    TBSP(1), TSP(2), G(3), HG(4), KG(5), ML(6), CL(7), DL(8);

    private int measurement;

    Measurement() {

    }

    Measurement(int measurement) {
        this.measurement = measurement;
    }

    public int getMeasurement() {
        return measurement;
    }

    public void setMeasurement(int measurement) {
        this.measurement = measurement;
    }


}
