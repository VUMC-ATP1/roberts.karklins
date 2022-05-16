package homework;
// 1,2,3
public class FirstClass {
    public static void main(String[] args) {
        String country = "Nigeria";
        System.out.println(country);

        long nigeriaPopulation = 211400708;
        System.out.printf("There lives %d people.\n", nigeriaPopulation);

        int countryArea = 923769;
        System.out.println("It's size is " + countryArea + "km²");

        String nigeriaCapital = "Abuja";
        String nigeriaoldCapital = "Lagos";
        System.out.println("Biggest city is " + nigeriaCapital + ".");

        String nigeriaLanguage = "English (Nigerian)";
        System.out.println("Wikipeadia says official language is " + nigeriaLanguage + ". But also mentions national languages like Hausa ,Igbo and Yoruba.");

        boolean nigeriaEU = false;

        if (nigeriaEU) {
            System.out.println(country + " is a member of the European Union.");
        } else {
            System.out.println(country + " is not a member of the European Union.");
        }
        char nigeriaCurrency = '₦';
        System.out.println(country + " uses " + nigeriaCurrency + " (naira) currency.");

// 4

        System.out.println(nigeriaoldCapital + " was the national capital of " + country + " until December 1991 before the government decided to move their capital to " + nigeriaCapital + " in the centre of the country");
        System.out.printf("%s was the national capital of Nigeria until December 1991. \n ", nigeriaoldCapital);

        // 5

        int a = 47+3;
        int b = 14;
        int c = a + b;
        System.out.println (a+b+c);

        int d = b - a;
        System.out.println("And the d is " + d);

        int e = c * b;
        System.out.println("Different number: " + e);

        int f = (c / 5) * 4;
        System.out.println("Another one " + f );



    }
    }

