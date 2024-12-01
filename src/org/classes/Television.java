package org.classes;

public class Television extends Prodotto {
    protected int grandezza;
    protected boolean smartScreen;

    public Television(String name, String brand, Double pryce, Double tax, Boolean fedelityCard, int grandezza,
            boolean smartScreen) {
        super(name, brand, pryce, tax, fedelityCard);
        if (grandezza >= 0) {
            this.grandezza = grandezza;
            this.smartScreen = smartScreen;
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

}