import java.util.Scanner;

public class scanner {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your roll number and name: ");
        int rollno = sc.nextInt();
        String name = sc.next();
        System.out.println("Rollno: " + rollno + "\nName:" + name);
        sc.close();
    }
}