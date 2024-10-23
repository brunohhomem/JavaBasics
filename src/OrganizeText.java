import java.util.Scanner;

public class OrganizeText {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int letter = 0, space = 0, number = 0, other = 0;

        String text = sc.nextLine();

        for (int i = text.length() - 1; i >= 0; i--) {
            if (Character.isLetter(text.charAt(i))) {
                letter++;
            } else if (Character.isSpaceChar(text.charAt(i))) {
                space++;
            } else if (Character.isDigit(text.charAt(i))) {
                number++;
            } else {
                other++;
            }
        }

        System.out.println("Letters: " + letter);
        System.out.println("Spaces: " + space);
        System.out.println("Numbers: " + number);
        System.out.println("Others: " + other);
    }
}
