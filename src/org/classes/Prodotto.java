package org.classes;

import java.util.Random;

public class Prodotto {
    protected int code;
    protected String name;
    protected String brand;
    protected Double pryce = 0.0;
    protected Double tax = 0.0;
    protected int standardDiscount = 2;
    protected String fidelityCard = "n";

    public Prodotto(String name, String brand, Double pryce, Double tax) {
        if (name != null && brand != null && pryce >= 0 && tax >= 0) {
            Random random = new Random();
            this.code = random.nextInt(1000000);
            this.name = name;
            this.brand = brand;
            this.pryce = pryce;
            this.tax = tax;
        } else {
            System.out.println("Uno o più valori sono errati, non posso creare l'oggetto.");
        }
    }

    public int getCode() {
        return this.code;
    }

    public String getName() {
        return this.name;
    }

    public String getBrand() {
        return this.brand;
    }

    public Double getPryce() {
        if (fidelityCard.equals("y")) {
            return this.pryce - ((this.pryce / 100) * standardDiscount);
        } else {
            return this.pryce;
        }
    }

    public Double getTaxedPryce() {
        if (fidelityCard.equals("y")) {
            Double discountedPryce = getPryce();
            return discountedPryce + ((discountedPryce / 100) * tax);
        } else {
            return this.pryce + ((this.pryce / 100) * this.tax);
        }
    }

    public String getFormattedTaxedPryce() {
        return String.format("%.2f", getTaxedPryce());
    }

    public Double getTax() {
        return this.tax;
    }

    public void setName(String Nome) {
        this.name = Nome;
    }

    public void setBrand(String Marchio) {
        this.brand = Marchio;
    }

    public void setPryce(Double Prezzo) {
        this.pryce = Prezzo;
    }

    public void setTax(Double Iva) {
        this.tax = Iva;
    }

    public void setFidelityCard(String i) {
        String temp = i.toLowerCase();
        if (temp.equals("y") || temp.equals("n")) {
            this.fidelityCard = temp;
        }
    }

    public Boolean getFidelityCard() {
        if (this.fidelityCard.equals("y")) {
            return true;
        } else {
            return false;
        }
    }
}
