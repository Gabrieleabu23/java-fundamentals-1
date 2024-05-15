package org.exercise;

import java.util.Scanner;

public class BonusseachCharinaString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci una stringa:");
        String stringa = scanner.nextLine();
        System.out.println("Inserisci un carattere:");
        char inputChar = scanner.next().charAt(0);
        int lengthChar = 0, maxLength = 0, maxIndex = 0;
        char[] charList = stringa.toCharArray();
        for (int i = 0; i < charList.length; i++) {
            if (inputChar == charList[i]) {
                lengthChar++;
                if (lengthChar > maxLength) {
                    maxLength = lengthChar;
                    maxIndex = i - maxLength + 1;
                }else if(lengthChar == maxLength){
                    maxIndex = i - maxLength + 1;
                }
            } else {
                lengthChar = 0;
            }
        }
        System.out.println("Lunghezza massima della sequenza: " + maxLength);
        System.out.println("Primo indice del carattere inserito: " + maxIndex);
    }
}
