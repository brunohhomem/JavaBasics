import java.util.Scanner;

public class InputNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please input the first number: ");
        double a = sc.nextDouble();
        System.out.println("Please input the second number: ");
        double b = sc.nextDouble();

        System.out.println("The product of the two numbers is: " + a*b);
    }
}