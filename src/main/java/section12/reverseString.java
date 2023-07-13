package section12;

public class reverseString {

    public static void main(String[] args) {
        System.out.println("reverseString(\"miasto\") = " + reverseString("miasto"));
    }

    public static String reverseString(String word){

        if(word.length()==1){
            return word;
        }else {
            return word.charAt(word.length()-1) + reverseString(word.substring(0,word.length()-1));
        }
    }

}
