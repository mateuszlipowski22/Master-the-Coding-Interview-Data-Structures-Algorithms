package section12;

public class recusionMain {

    public static void main(String[] args) {

        System.out.println("findFactorialRecursive(6) = " + findFactorialRecursive(1));
        System.out.println("findFactorialIterative(6) = " + findFactorialIterative(1));

    }

    public static int findFactorialRecursive(int number){
        if(number==1){
            return 1;
        }else {
            return number*findFactorialRecursive(number-1);
        }
    }

    public static int findFactorialIterative(int number){
        int result = 1;
        int index=2;
        while(index<=number){
            result=result*index;
            index++;
        }
        return result;
    }
}
