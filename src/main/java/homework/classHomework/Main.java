package homework.classHomework;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        // 1.
        Triangle veidojamTrijsturi = new Triangle();
        System.out.print("Pirmās malas garums:");
        veidojamTrijsturi.pirmaMala = scan.nextInt();
        System.out.print("Otrās malas garums:");
        veidojamTrijsturi.otraMala = scan.nextInt();
        System.out.print("Trešās malas garums:");
        veidojamTrijsturi.tresaMala = scan.nextInt();

        Triangle trijsturis = new Triangle(veidojamTrijsturi.pirmaMala, veidojamTrijsturi.otraMala, veidojamTrijsturi.tresaMala);

        System.out.println("Trijstura laukums ir " + trijsturis.laukums);

        if (trijsturis.vienadmalu()) {
            System.out.print("Trijstūris ir vienādmalu");
        } else {
            System.out.println("Trijstūris nav vienādmalu");
        }

        if (veidojamTrijsturi.vienadsanu()) {
            System.out.println("Trijstūris ir vienādsānu");
        } else {
            System.out.println("Trijstūris nav vienādsānu");
        }

        // 2

        Triangle veidojamTrijsturi1 = new Triangle();
        System.out.print("Pirmās malas garums:");
        int pirmaMala = scan.nextInt();
        System.out.print("Otrās malas garums:");
        int otraMala = scan.nextInt();
        System.out.print("Trešās malas garums:");
        int tresaMala = scan.nextInt();
        Triangle veidojamTrijsturi2 = new Triangle(pirmaMala, otraMala, tresaMala);

        System.out.println("Trijstūra laukums ir " + veidojamTrijsturi2.laukums);

        if (veidojamTrijsturi1.vienadmalu()) {
            System.out.println("Trijstūris ir vienādmalu");
        } else {
            System.out.println("Trijstūris nav vienādmalu");
        }

        if (veidojamTrijsturi1.vienadsanu()) {
            System.out.println("Trijstūris ir vienādsānu");
        } else {
            System.out.println("Trijstūris nav vienādsānu");
        }
    }
}