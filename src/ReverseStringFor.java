public class ReverseStringFor {
    public static void main(String[] args) {
        //Utilizando For, menos performático
        String original = "The quick brown fox";
        String reversed = "";

        System.out.println("Original: " + original);

        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);
            System.out.println("Reversing: " + reversed);
        }

        System.out.println("Reversed: " + reversed);
    }
}
