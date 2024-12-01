package org.classes;

public class Headphones extends Prodotto {
    protected String colore;
    protected boolean isWireless = false;
    protected int wiredDiscount = 7;

    public Headphones(String name, String brand, Double pryce, Double tax, String colore,
            boolean isWireless) {
        super(name, brand, pryce, tax);
        if (colore != null) {
            this.colore = colore;
            this.isWireless = isWireless;
            if (isWireless == false) {
                this.standardDiscount = wiredDiscount;
            }
        }
    }

    public void setColore(String i) {
        this.colore = i;
    }

    public void setIsWireless(boolean i) {
        this.isWireless = i;
    }

    public String getColore() {
        return this.colore;
    }

    public boolean getIsWireless() {
        return this.isWireless;
    }

    public void setWiredDiscount(int i) {
        if (i >= 0) {
            this.wiredDiscount = i;
        } else {
            System.out.println("Il valore dello sconto non può essere inferiore a 0");
        }
    }

    public int getWiredDiscount() {
        return this.wiredDiscount;
    }
}
