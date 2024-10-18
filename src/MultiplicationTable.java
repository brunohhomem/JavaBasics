import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input one number: ");
        int x = sc.nextInt();

        for (int i = 0; i < 10; i++) {
            System.out.println(x + " x " + (i + 1) + " = " + (x * (i + 1)));
        }
    }
}
