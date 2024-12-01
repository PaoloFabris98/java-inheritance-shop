package org.classes;

import java.util.Random;

public class Celphone extends Prodotto {
    protected String imei;
    protected int memory;

    public Celphone(String name, String brand, Double pryce, Double tax, int memory) {
        super(name, brand, pryce, tax);
        if (memory >= 0) {
            Random random = new Random();
            StringBuilder temp = new StringBuilder();
            for (int i = 0; i < 15; i++) {
                temp.append(random.nextInt(10)); // Genera un numero tra 0 e 9

            }
            this.imei = temp.toString();
            this.memory = memory;
        }
    }

    public String getImei() {
        return this.imei;
    }

    public int getMemory() {
        return this.memory;
    }

}
