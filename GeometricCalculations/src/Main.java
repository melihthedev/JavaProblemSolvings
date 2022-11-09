import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //System.out.println(calculateDiameterAndArea());
        System.out.println(calculateCircleSectorArea());
    }

    static String calculateDiameterAndArea(){
        Scanner input = new Scanner(System.in);


        System.out.println("Please enter the radius of the circle: ");
        double radius = input.nextDouble();

        double diameter = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;

        return "The diameter of the circle is: " + String.format("%.2f", diameter) + ", and the area is: " + String.format("%.2f", area);
    }

    static String calculateCircleSectorArea() {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the radius: ");
        double radius = input.nextDouble();

        System.out.println("Please enter the center angle: ");
        int angle = input.nextInt();

        double formula = (Math.PI * (radius * radius) * angle) / 360;

        return "The area of the given sector is: " + String.format("%.2f", formula);
    }
}