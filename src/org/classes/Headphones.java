package org.classes;

public class Headphones extends Prodotto {
    protected String colore;
    protected boolean isWireless;

    public Headphones(String name, String brand, Double pryce, Double tax, String colore, boolean isWireless) {
        super(name, brand, pryce, tax);
        if (colore != null) {
            this.colore = colore;
            this.isWireless = isWireless;
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
}
