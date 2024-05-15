package org.exercise;

import java.util.Scanner;

public class Bonus_Met_Gala {
    public static void main(String[] args) {
        String[] invitati = {"Jennifer Lopez", "Zendaya", "Chris Hemsworth", "Bad Bunny", "Cara Delevingne", "Kendall Jenner", "Uma Thurman", "Damiano David", "Luca Guadagnino"};
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();
        for (String item: invitati) {
            if(item.toLowerCase().contains( userName.toLowerCase())){
                System.out.println("Benvenuto bellissimo/a!");
                break;
            }
        }
        scanner.close();
    }
}
