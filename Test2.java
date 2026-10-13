import java.util.Scanner;

public class Test2 {
    int a;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Test2 x = new Test2();

        System.out.print("Enter value of a: ");
        x.a = sc.nextInt();

        System.out.println("Value of a: " + x.a);

        sc.close();
    }
}