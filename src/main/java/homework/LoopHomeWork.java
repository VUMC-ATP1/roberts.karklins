package homework;

import java.util.Arrays;
import java.util.Scanner;


public class LoopHomeWork {
    public static void main(String[] args) {
        // 1. uzdevums
        Scanner scanner = new Scanner(System.in);
        int skaitluSumma = 0;
        while (skaitluSumma <= 100) {
            System.out.println("Noradit veselu skaitli:");
            int userInput = scanner.nextInt();
            skaitluSumma = skaitluSumma + userInput;
        }
        System.out.println("Gatavs!");

        // 2.uzdevums
        skaitluSumma = 0;
        System.out.println("Ierakstīt veselu skaitli");
        int pirmskaitlis;
        pirmskaitlis = scanner.nextInt();
        for (int i = 2; i < pirmskaitlis; i++) {
            if (pirmskaitlis % i == 0) {
                skaitluSumma++;
            }
        }
        if (skaitluSumma == 0) {
            System.out.printf("Ir Pirmskaitlis");
        } else {
            System.out.printf("Nav Pirmskaitlis");
        }

        // 3. uzdevums
        System.out.println();
        int[] numuri = {3, 7, 15, 1};
        String[] motocikli = {"Suzuki", "Honda", "BMW", "Kawasaki"};
        char[] burti = {'r', 'k', 'm', 'a',};
        System.out.print("While:");
        System.out.print("\n");
        int r = 0;
        while (r < numuri.length) {
            System.out.println(numuri[r]);
            r++;
        }
        System.out.print("");
        r = 0;
        while (r < motocikli.length) {
            System.out.println(motocikli[r]);
            r++;
        }
        System.out.print("");
        r = 0;
        while (r < burti.length) {
            System.out.println(burti[r]);
            r++;
        }
        System.out.print("Do while:");
        System.out.print("\n");
        r = 0;
        do {
            System.out.println(numuri[r]);
            r++;
        } while (r < numuri.length);
        System.out.print("");
        r = 0;
        do {
            System.out.println(motocikli[r]);
            r++;
        } while (r < motocikli.length);
        System.out.print("");
        r = 0;
        do {
            System.out.println(burti[r]);
            r++;
        } while (r < burti.length);
        System.out.print("For:");
        System.out.print("\n");
        for (int m = 0; m < numuri.length; m++) {
            System.out.println(numuri[m]);
        }
        System.out.print("");
        for (int m = 0; m < motocikli.length; m++) {
            System.out.println(motocikli[m]);
        }
        System.out.print("");
        for (int m = 0; m < burti.length; m++) {
            System.out.println(burti[m]);
        }
        System.out.print("");
        System.out.print("For each:");
        System.out.print("\n");
        for (int numurs : numuri) {
            System.out.println(numurs);
        }
        System.out.print("");
        for (String motocikls : motocikli) {
            System.out.println(motocikls);
        }
        System.out.print("");
        for (char burts : burti) {
            System.out.println(burts);
        }

        // 4. uzdevums

        int[] simts = new int[101];
        for (int t = 0; t < simts.length; t++) {
            if (t % 2 == 0) {
                System.out.print(t + ", ");
            }
        }

        // 5.uzdevums
        System.out.print("\n");
        Scanner sc = new Scanner(System.in);
        //Declare and Initialize the variable
        System.out.println("Ievadīt skaitli: ");
        int num = sc.nextInt();
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        System.out.println("Rezultātā sanāk " + fact);

        // 6. uzdevums

        final int pinKods = 0704;
        int meginajumuSkaits = 0;
        System.out.print("Lūdzu ievadiet PIN kodu: ");
        Scanner input = new Scanner(System.in);
        while (meginajumuSkaits < 3) {
            int inputPass = input.nextInt();
            meginajumuSkaits++;
            if (inputPass == pinKods) {
                System.out.println("PIN ir pieņemts, laipni lūdzam atpakaļ");
                break;
            } else {
                if (meginajumuSkaits <= 2) {
                    System.out.println("Nepareizs PIN, mēģiniet vēlreiz");
                } else {
                    System.out.println(" ");
                }
                if (meginajumuSkaits >= 3) {
                    System.out.println("Atvainojiet, bet jūs esat bloķēts");
                }
            }
        }
    }
}


