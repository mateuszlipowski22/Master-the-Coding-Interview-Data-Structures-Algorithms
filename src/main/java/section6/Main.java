package section6;

public class Main {

    public static void main(String[] args) {

        System.out.println(reverseString("czy ja dobrze zrozumialam"));

    }

    public static String reverseString(String toReverse){
        int length = toReverse.length();
        char[] reverse = new char[length];
        for (int i = 0; i < toReverse.length(); i++) {
            reverse[i]=toReverse.charAt(length-i-1);
        }

        return String.valueOf(reverse);
    }

}
