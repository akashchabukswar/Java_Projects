import java.util.Scanner;

public class Return {
    public static void main() {
        greet();
        int first = readNumber();
        int second = readNumber();

        int sum = first + second;
        System.out.println("Sum of two numbers is: ");
    }

    public static void readNumber() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter a number: ");
        int number = input.nextInt();
        return number;
    }

    public static void greet() {
        System.out.println("Welcome to my calculator");
    }
}
