package section3;

public class Exercise1 {

    public static void main(String[] args) {

        System.out.println(funChallenge(new String[]{"a"}));

    }

//    O(n) - answer
    public static int funChallenge( String [] input) {
        int a = 10; // O(1)
        a = 50 + 3; // O(1)

        for (int i = 0; i < input.length; i++) { // O(n)
//            anotherFunction(); // O(n)
            boolean stranger = true; // O(n)
            a++; // O(n)
        }
        return a; // O(1)
//        O(1+1+1+n+n+n+n)=O(3+4n)=O(n)
    }
}
