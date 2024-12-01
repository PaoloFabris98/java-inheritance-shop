package org.main;

import org.classes.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Carrello {
    public static void main(String[] args) {

        List<Prodotto> prodotti = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        String fidelityCard;

        System.out.println("Hai la tessera fedeltà? [y/n]");
        fidelityCard = input.nextLine();

        Celphone phone1 = new Celphone("iPhone 14", "Apple", 999.99, 22.0, 128);
        phone1.setFidelityCard(fidelityCard);
        prodotti.add(phone1);

        Celphone phone2 = new Celphone("Galaxy S23", "Samsung", 799.99, 22.0, 64);
        phone2.setFidelityCard(fidelityCard);
        prodotti.add(phone2);

        Celphone phone3 = new Celphone("Pixel 7", "Google", 599.99, 22.0, 32);
        phone3.setFidelityCard(fidelityCard);
        prodotti.add(phone3);

        Celphone phone4 = new Celphone("Xperia 5", "Sony", 699.99, 22.0, 16);
        phone4.setFidelityCard(fidelityCard);
        prodotti.add(phone4);

        Celphone phone5 = new Celphone("Redmi Note 12", "Xiaomi", 299.99, 22.0, 8);
        phone5.setFidelityCard(fidelityCard);
        prodotti.add(phone5);

        Television tv1 = new Television("OLED CX", "LG", 1499.99, 22.0, 55, true);
        tv1.setFidelityCard(fidelityCard);
        prodotti.add(tv1);

        Television tv2 = new Television("Crystal UHD", "Samsung", 599.99, 22.0, 43, false);
        tv2.setFidelityCard(fidelityCard);
        prodotti.add(tv2);

        Television tv3 = new Television("Bravia XR", "Sony", 1299.99, 22.0, 65, true);
        tv3.setFidelityCard(fidelityCard);
        prodotti.add(tv3);

        Television tv4 = new Television("QLED Q60B", "Samsung", 799.99, 22.0, 50, false);
        tv4.setFidelityCard(fidelityCard);
        prodotti.add(tv4);

        Television tv5 = new Television("NanoCell", "LG", 999.99, 22.0, 75, true);
        tv5.setFidelityCard(fidelityCard);
        prodotti.add(tv5);

        Headphones headphones1 = new Headphones("AirPods Pro", "Apple", 249.99, 22.0, "White", true);
        headphones1.setFidelityCard(fidelityCard);
        prodotti.add(headphones1);

        Headphones headphones2 = new Headphones("WH-1000XM5", "Sony", 349.99, 22.0, "Black", true);
        headphones2.setFidelityCard(fidelityCard);
        prodotti.add(headphones2);

        Headphones headphones3 = new Headphones("Soundcore Life Q20", "Anker", 59.99, 22.0, "Blue", false);
        headphones3.setFidelityCard(fidelityCard);
        prodotti.add(headphones3);

        Headphones headphones4 = new Headphones("QC45", "Bose", 329.99, 22.0, "Silver", true);
        headphones4.setFidelityCard(fidelityCard);
        prodotti.add(headphones4);

        Headphones headphones5 = new Headphones("Tune 510BT", "JBL", 49.99, 22.0, "Pink", false);
        headphones5.setFidelityCard(fidelityCard);
        prodotti.add(headphones5);

        for (Prodotto prodotto : prodotti) {
            System.out.println("Codice: " + prodotto.getCode());
            System.out.println("Nome: " + prodotto.getName());
            System.out.println("Marchio: " + prodotto.getBrand());
            System.out.println("Prezzo Base: " + prodotto.getPryce() + " euro");

            if (prodotto.getFidelityCard()) {
                System.out.println("Prezzo con Sconto: " + prodotto.getFormattedTaxedPryce() + " euro");
            } else {
                System.out.println("Prezzo con Tassa: " + prodotto.getFormattedTaxedPryce() + " euro");
            }

            System.out.println("----------");
        }
    }
}
