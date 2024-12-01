package org.classes;

public class Television extends Prodotto {
    protected int grandezza;
    protected boolean smartScreen;
    protected int smartDiscount = 10;

    public Television(String name, String brand, Double pryce, Double tax, int grandezza,
            boolean smartScreen) {
        super(name, brand, pryce, tax);
        if (grandezza >= 0) {
            this.grandezza = grandezza;
            this.smartScreen = smartScreen;
            if (smartScreen == false) {
                this.standardDiscount = smartDiscount;
            }
        }
    }

    public void setGrandezza(int i) {
        this.grandezza = i;
    }

    public void setSmartScreen(boolean i) {
        this.smartScreen = i;
    }

    public int getGrandezza() {
        return this.grandezza;
    }

    public boolean getSmartScreen() {
        return this.smartScreen;
    }

    public void setSmartDiscount(int i) {
        if (i >= 0) {
            this.smartDiscount = i;
        } else {
            System.out.println("Il valore dello sconto non può essere inferiore a 0");
        }
    }

    public int getSmartDiscount() {
        return this.smartDiscount;
    }

}