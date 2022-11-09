import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(calculateBMI());
    }

    static double calculateBMI(){
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your height: ");
        double height = input.nextDouble();

        System.out.println("Please enter your weight: ");
        int weight = input.nextInt();

        return weight / (height * height);
    }
}