package org.exercise;

import java.util.Scanner;



public class Cibi_Preferiti {
    public static void main(String[] args) {
        int numberFoods ;
        Scanner scanner = new Scanner(System.in);
        do {

            System.out.print("Quali sono i tuoi cibi preferiti? Elenca almeno 5 (massimo 10): ");
            numberFoods = Integer.parseInt(scanner.nextLine());
            if (numberFoods < 5 || numberFoods > 10) {
                System.out.println("Numero non accettato!");
            }
        } while (numberFoods < 5 || numberFoods > 10);

        String[] cibi = new String[numberFoods];
        System.out.println("Inserisci i tuoi cibi preferiti!");
        for (int i = 0; i < numberFoods; i++) {
            System.out.print(i+1+"- ");
            cibi[i] = scanner.nextLine();
        }
        System.out.println("Totale cibi: " + cibi.length);
        System.out.println("Primo cibo: " + cibi[0]);
        System.out.println("Ultimo cibo: " + cibi[cibi.length - 1]);
        System.out.println("Cibo a metà classifica: " + cibi[Math.round((float) numberFoods / 2) - 1]);
        scanner.close();
    }
}
