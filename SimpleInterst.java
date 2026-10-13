import java.util.Scanner;

public class SimpleInterst {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter principle amount :");
        double p = input.nextDouble();

        System.out.print("Enter rate of interst: ");
        double r = input.nextDouble();

        System.out.print("Enter time period: ");
        double t = input.nextDouble();

        double Simple_Interst = (p * t * r) / 100;

        System.out.println("Simple interst is: " + Simple_Interst);
    }
}
