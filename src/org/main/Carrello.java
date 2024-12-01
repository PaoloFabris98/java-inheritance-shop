package org.main;

import org.classes.*;

import java.util.ArrayList;
import java.util.List;

public class Carrello {
    public static void main(String[] args) {
        // carrello
        List<Prodotto> carrello = new ArrayList<>();

        // Headphones
        Headphones headphones1 = new Headphones("AirPods", "Apple", 199.99, 22.0, "Bianco", true);
        Headphones headphones2 = new Headphones("WH-1000XM4", "Sony", 349.99, 22.0, "Nero", true);
        Headphones headphones3 = new Headphones("QuietComfort 45", "Bose", 329.99, 22.0, "Argento", true);

        // Television
        Television tv1 = new Television("OLED TV", "LG", 1500.0, 22.0, 55, true);
        Television tv2 = new Television("Bravia", "Sony", 1200.0, 22.0, 50, true);

        // Celphone
        Celphone phone1 = new Celphone("Galaxy S21", "Samsung", 799.99, 22.0, 128);
        Celphone phone2 = new Celphone("iPhone 13", "Apple", 999.99, 22.0, 256);

        carrello.add(headphones1);
        carrello.add(headphones2);
        carrello.add(tv1);
        carrello.add(phone1);

        System.out.println("\nTentativo di aggiungere un prodotto nullo:");
        Prodotto prodottoNullo = null;
        if (prodottoNullo == null) {
            System.out.println("Errore: Il prodotto non può essere nullo e non è stato aggiunto al carrello.");
        }

        System.out.println("\nCreazione di prodotti con valori non validi:");
        Headphones invalidHeadphones = new Headphones(null, "FakeBrand", -10.0, -5.0, null, false);
        Television invalidTv = new Television("InvalidTV", null, -500.0, -10.0, -50, false);
        Celphone invalidPhone = new Celphone(null, null, -999.0, -22.0, -128);

        System.out.println("\nProdotti nel carrello:");
        for (Prodotto prodotto : carrello) {
            System.out.println("- " + prodotto.getName() + " di " + prodotto.getBrand() +
                    " | Prezzo base: " + prodotto.getPryce() +
                    " | Prezzo con IVA: " + prodotto.getTaxedPryce());
        }

        System.out.println("\n\nPrezzi senza IVA.\n");
        for (Prodotto prodotto : carrello) {
            System.out.println("Marca: " + prodotto.getBrand());
            System.out.println("Prezzo: " + prodotto.getPryce() + " Euro.");
            System.out.println();
        }
        System.out.println("\nPrezzi con IVA.\n");
        for (Prodotto prodotto : carrello) {
            System.out.println("Marca: " + prodotto.getBrand());
            System.out.println("Prezzo: " + prodotto.getFormattedTaxedPryce() + " Euro.");
            System.out.println();

        }
    }
}
