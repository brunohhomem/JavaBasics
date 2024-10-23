import java.util.Scanner;

public class CompareNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input the first number to compare: ");
        int a = sc.nextInt();
        System.out.println("Input the second number to compare: ");
        int b = sc.nextInt();

        if (a == b)
            System.out.printf("%d == %d\n", a, b);
        if (a != b)
            System.out.printf("%d != %d\n", a, b);
        if (a < b)
            System.out.printf("%d < %d\n", a, b);
        if (a > b)
            System.out.printf("%d > %d\n", a, b);
        if (a <= b)
            System.out.printf("%d <= %d\n", a, b);
        if (a >= b)
            System.out.printf("%d >= %d\n", a, b);
    }

}
