public class PhraseCheck1 {
    public static void main(String[] args) {
        String string = "()(()";
        if (isPhraseCorrect(string)) {
            System.out.println("The phrase is correct");
        }
    }

    private static boolean isPhraseCorrect(String string) {
        int count = 0;

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == '(') {
                count++;
            } else {
                count--;
                if (count < 0) {
                    int braceNumber = i + 1;
                    System.out.println("The phrase is incorrect. The brace # " + braceNumber + " is odd");
                    return false;
                }
            }
        }
        if (count > 0) {
            System.out.println("The phrase is incorrect. There are " + count + " unclosed opening brace(s)");
            return false;
        }
        return true;
    }
}
