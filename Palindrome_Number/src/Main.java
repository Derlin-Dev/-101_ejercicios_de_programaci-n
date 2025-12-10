
public class Main {
    public static void main(String[] args) {
        long x = 1234567899;

        boolean result = isPalindrome(x);

        if (result != true) {
            System.out.println("No es un palindrome");
        }else {
            System.out.println("Es un palindrome");
        }
    }

    public static boolean isPalindrome(long x) {

        if (x < 0) return false;

        String numConvert = "";
        String numStr = String.valueOf(x);
        char[] arrStr = numStr.toCharArray();

        for (int i = arrStr.length - 1 ; i >= 0; i--) {
            numConvert += String.valueOf(arrStr[i]);
        }

        if (x != Long.parseLong(numConvert)) {
            return false;
        }else {
            return true;
        }

    }
}