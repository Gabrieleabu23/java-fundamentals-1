package org.exercise;

import java.util.Scanner;

public class Biglietto_del_treno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age, totalKm;
        double priceKm = 0.21;
        double totalPrice;
        System.out.print("Inserisci la tua età: ");
        age = Integer.parseInt(scanner.nextLine());
        System.out.print("Inserisci i km da percorrere: ");
        totalKm = Integer.parseInt(scanner.nextLine());

        double price = priceKm * totalKm;
        if (age < 18) {
            totalPrice = price - (price * 20 / 100);
        } else if (age > 65) {
            totalPrice = price - ( price * 40 / 100);
        } else {
            totalPrice = priceKm * totalKm;
        }
        System.out.println("Il prezzo totale è: "+totalPrice);
    scanner.close();
    }
}
