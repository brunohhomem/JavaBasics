public class ReverseString {
    public static void main(String[] args) {

        //Classe StringBuilder
        String original = "The quick brown fox";
        String reversed = new StringBuilder(original).reverse().toString();

        System.out.println(original);
        System.out.println(reversed);
    }
}
