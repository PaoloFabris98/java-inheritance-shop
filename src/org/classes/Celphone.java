package org.classes;

public class Celphone extends Prodotto {
    protected int imei;
    protected int memory;

    public Celphone(String name, String brand, Double pryce, Double tax, int memory) {
        super(name, brand, pryce, tax);

        this.memory = memory;
    }

}
