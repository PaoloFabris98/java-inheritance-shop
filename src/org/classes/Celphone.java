package org.classes;

import java.util.Random;

public class Celphone extends Prodotto {
    protected String imei;
    protected int memory;
    protected int memoryDiscount = 5;
    protected int memoriEnanchedDiscountLimit = 32;

    public Celphone(String name, String brand, Double pryce, Double tax, int memory) {
        super(name, brand, pryce, tax);
        if (memory >= 0) {
            Random random = new Random();
            StringBuilder temp = new StringBuilder();
            for (int i = 0; i < 15; i++) {
                temp.append(random.nextInt(10));

            }
            this.imei = temp.toString();
            this.memory = memory;
            if (this.memory < memoriEnanchedDiscountLimit) {
                this.standardDiscount = memoryDiscount;
            }
        }
    }

    public String getImei() {
        return this.imei;
    }

    public int getMemory() {
        return this.memory;
    }

    public void setMemoryDiscount(int i) {
        if (i >= 0) {
            this.memoryDiscount = i;
        } else {
            System.out.println("Il valore dello sconto non può essere inferiore a 0");
        }
    }

    public int getMemoryDiscount() {
        return this.memoryDiscount;
    }

    public void setMemoriEnanchedDiscountLimit(int i) {
        if (i >= 0) {
            this.memoriEnanchedDiscountLimit = i;
        } else {
            System.out.println("Il valore del limite per lo sconto non può essere inferiore a 0");
        }
    }

    public int getMemoriEnanchedDiscountLimit() {
        return this.memoriEnanchedDiscountLimit;
    }

}
