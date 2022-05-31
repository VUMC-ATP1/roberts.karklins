package homeworkTwo;

import java.util.Scanner;

public class HomeWorkTwo {
    public static void main(String[] args) {
// 1
        // a
        int x = 31;
        int y = 51;
        System.out.println(x < y); // true

        // b

        int a = 11;
        int b = 11;
        System.out.println(a != b); // false

        // c

        int c = 6;
        System.out.println((c <= 10) && (5 < c));

        // d

        int d = 6;
        System.out.println(d < 10 || d <= 5);

        // e
        int e = 1;
        System.out.println(e == 0 || e == 10);

        // f

        int f = 4;
        System.out.println((f * 4) > 10);


        // 2

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of a month");
        int month = input.nextInt();
        switch (month) {

            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;

            default:
                System.out.println("Error: invalid month.");

        }

// 3
        System.out.println("Enter first number");
        int num1 = input.nextInt();
        System.out.println("Enter second number");
        int num2 = input.nextInt();
        System.out.println("Enter third number");
        int num3 = input.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println("Largest number is:" + num1);
        } else if (num2 > num3) {
            System.out.println("Largest number is:" + num2);
        } else {
            System.out.println("Largest number is:" + num3);
        }
        // 4.

        String color1 = "green";
        String color2 = "yellow";
        String color3 = "red";

        System.out.println("Enter the light of traffic light");
        String lightname = input.next();
        if (lightname.equals(color1)) {
            System.out.println("You can cross the road.");
        } else if (lightname.equals(color2)) {
            System.out.println("Make sure if you can make it, otherwise wait again for the green light");
        } else if (lightname.equals(color3)) {
            System.out.println("Wait for the green light");
            //else {
            // System.out.println("Cannot find the value");
        } else {
            System.out.println("The traffic light is broken. Check your surroundings and cross the road carefully!");
        }
        // 5

        printBusinessCard();
        printBusinessCard();
        printBusinessCard();

        // 6
        printBusinessCardTwo("Roberts", "Karklins", "+371 28682357", 1990);
        printBusinessCardTwo("Roberts1", "Roberts1", "+371 28682357", 2022);

        // 7
        int summa = sum(23, 33);
        System.out.println(summa);

        // 8
        System.out.println(average(3,13,33));
    }

    // 5.
    public static void printBusinessCard() {
        System.out.println("Vizītkarte");
        System.out.println("########");
        System.out.println("Vārds: Roberts");
        System.out.println("Uzvārds: Kārkliņš");
        System.out.println("Telefona numurs: +371 28682357");
        System.out.println("Dzimšanas gads: 1990");
        System.out.println("########");
    }

    // 6
    public static void printBusinessCardTwo(String vards, String uzvards, String telefons, int dzimsanasgads) {
        System.out.println("Vizītkarte");
        System.out.println("########");
        System.out.printf("Vārds: %s%n", vards);
        System.out.printf("Uzvārds: %s%n", uzvards);
        System.out.printf("Telefona numurs: %s%n", telefons);
        System.out.printf("Dzimšanas gads: %d%n", dzimsanasgads);
        System.out.println("########");
    }
    // 7

    public static int sum(int r, int n) {
        return r + n;
    }

    // 8
    public static double average(double x, double y, double z) {
        return (x + y + z) / 3;
    }
}



