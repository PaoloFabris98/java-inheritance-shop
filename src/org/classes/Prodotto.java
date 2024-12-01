package org.classes;

import java.util.Random;

public class Prodotto {
    protected int code;
    protected String name;
    protected String brand;
    protected Double pryce = 0.0;
    protected Double tax = 0.0;

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
        return this.pryce;
    }

    public Double getTaxedPryce() {
        return pryce + ((pryce / 100) * tax);
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

}