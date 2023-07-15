package section13;

import java.util.Arrays;

public class bubbleMain {

    public static void main(String[] args) {

        Integer[] input = {13,2,4,2,4,6,8,0,12,2};

        System.out.println(Arrays.toString(input));

        System.out.println(Arrays.toString(bubbleSort(input)));


    }

    public static Integer[] bubbleSort(Integer[] input){

        Integer temp;

        for (int i = 0; i < input.length; i++) {
            for(int j=1; j < input.length-i; j++){
                if(input[j-1]>input[j]){
                    temp=input[j-1];
                    input[j-1]=input[j];
                    input[j]=temp;
                }
            }
        }
        return input;
    }

}
