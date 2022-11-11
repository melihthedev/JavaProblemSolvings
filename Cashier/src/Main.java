import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double applePrice = 3.67;
        double tomatoPrice = 1.11;
        double bananaPrice = 0.95;
        double pearPrice = 2.14;
        double eggplantPrice = 5.00;

        double totalPriceOfProducts = 0;

        System.out.println("How much apple? ");
        totalPriceOfProducts += (input.nextDouble() * applePrice);

        System.out.println("How much tomato? ");
        totalPriceOfProducts += (input.nextDouble() * tomatoPrice);

        System.out.println("How much banana? ");
        totalPriceOfProducts += (input.nextDouble() * bananaPrice);

        System.out.println("How much pear? ");
        totalPriceOfProducts += (input.nextDouble() * pearPrice);

        System.out.println("How much eggplant? ");
        totalPriceOfProducts += (input.nextDouble() * eggplantPrice);

        System.out.println("Total price is: " + totalPriceOfProducts);
    }
}