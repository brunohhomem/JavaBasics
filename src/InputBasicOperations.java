import java.util.Scanner;

public class InputBasicOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input the first number: ");
        double a = sc.nextDouble();
        System.out.println("Input the second number: ");
        double b = sc.nextDouble();

        System.out.println("The sum is: " + (a+b));
        System.out.println("The subtract is: " + (a-b));
        System.out.println("The multiply is: " + (a*b));
        System.out.println("The divide is: " + (a/b));
        System.out.println("The remainder is: " + (a%b));

    }
}