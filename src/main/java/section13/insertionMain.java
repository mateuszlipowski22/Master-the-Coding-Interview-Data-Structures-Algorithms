package section13;

import java.util.Arrays;

public class insertionMain {

    public static void main(String[] args) {

        Integer[] input = {13,2,4,2,4,6,8,0,12,2};

        System.out.println(Arrays.toString(input));

        System.out.println(Arrays.toString(insertionSort(input)));


    }

    public static Integer[] insertionSort(Integer[] input){

        Integer temp;

        for (int i = 1; i < input.length; i++) {
            for(int j=i; j>0; j--){
                if(input[j]<input[j-1]){
                    temp=input[j];
                    input[j]=input[j-1];
                    input[j-1]=temp;
                }
            }
            System.out.println("Iteration "+i+Arrays.toString(input));
        }
        return input;
    }

}
