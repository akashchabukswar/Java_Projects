import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int addition = num1 + num2;
        System.out.println("Addition of two numbers is: " + addition);
    }
}
