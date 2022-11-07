import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(calculateVAT());
    }

    static double calculateVAT() {
        double STANDART_VAT = 1.18;
        double DISCOUNT_VAT = 1.08;
        Scanner input = new Scanner(System.in);

        double VATPrice = 0;
        System.out.println("Please enter the price of the product: ");
        int priceOfProduct = input.nextInt();

        if (priceOfProduct > 1000) {
            VATPrice = priceOfProduct * DISCOUNT_VAT;
        } else {
            VATPrice = priceOfProduct * STANDART_VAT;
        }

        return VATPrice;
    }
}