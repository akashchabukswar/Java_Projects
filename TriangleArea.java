import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter base of a triangle: ");
        double base = input.nextDouble();

        System.out.print("Enter height of a triangle: ");
        double height = input.nextDouble();

        double area = 0.5 * base * height;

        System.out.println("Area of a triangle is: " + area);
    }
}
