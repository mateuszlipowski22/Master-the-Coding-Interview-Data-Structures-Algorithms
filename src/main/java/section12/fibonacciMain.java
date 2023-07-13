package section12;

public class fibonacciMain {

    public static void main(String[] args) {

        System.out.println("fibonacciRecursive(2) = " + fibonacciRecursive(2));
        System.out.println("fibonacciRecursive(3) = " + fibonacciRecursive(3));
        System.out.println("fibonacciRecursive(4) = " + fibonacciRecursive(4));
        System.out.println("fibonacciRecursive(5) = " + fibonacciRecursive(5));
        System.out.println("fibonacciRecursive(6) = " + fibonacciRecursive(6));
        System.out.println("fibonacciIterative(7) = " + fibonacciIterative(7));

    }

    public static int fibonacciRecursive(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }else {
            return fibonacciRecursive(n-1)+fibonacciRecursive(n-2);
        }
    }

    public static int fibonacciIterative(int n){
        int first=0;
        int second=1;
        if(n==0){
            return 0;
        }

        if(n==1){
            return 1;
        }

        int temp;
        for(int i=2; i<n; i++){
            temp=second;
            second=first+second;
            first=temp;
        }
        return first+second;
    }
}
