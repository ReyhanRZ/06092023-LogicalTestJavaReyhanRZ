import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        String oldWord = "NEGIE1";
        String newWord = "";
        char lastChar;
        char ch;
        for (int i = 0; i < oldWord.length(); i++) {
            if (i == oldWord.length() - 1) {
                lastChar = oldWord.charAt(i);
                newWord = newWord + lastChar;
            } else {
                ch = oldWord.charAt(i);
                newWord = ch + newWord; // newWord = N + "", newWord = E + N => EN
            }
        }

        System.out.println(newWord);
    }
}
