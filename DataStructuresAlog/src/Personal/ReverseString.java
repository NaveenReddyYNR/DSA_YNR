package Personal;

public class ReverseString {

    public static void main(String[] args) {
        String word = "Hello i am writing java program";
        String revWord = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            revWord += word.charAt(i);
        }

        System.out.println(revWord);
    }
}
