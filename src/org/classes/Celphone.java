package org.classes;

import java.util.Random;

public class Celphone extends Prodotto {
    protected int imei;
    protected int memory;

    public Celphone(String name, String brand, Double pryce, Double tax, int memory) {
        super(name, brand, pryce, tax);
        if (memory >= 0) {
            Random random = new Random(10);
            String temp = "";
            for (int i = 0; i < 15; i++) {
                temp += ("" + random);
            }
            this.imei = Integer.parseInt(temp);
            this.memory = memory;
        }
    }

    public int getImei() {
        return this.imei;
    }

    public int getMemory() {
        return this.memory;
    }

}
