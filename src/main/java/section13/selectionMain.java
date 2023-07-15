package section13;

import java.util.Arrays;

public class selectionMain {

    public static void main(String[] args) {

        Integer[] input = {13,2,4,2,4,6,8,0,12,2};

        System.out.println(Arrays.toString(input));

        System.out.println(Arrays.toString(selectionSort(input)));


    }

    public static Integer[] selectionSort(Integer[] input){

        Integer min;
        int index;

        for (int i = 0; i < input.length; i++) {
            min=input[i];
            index=i;

            for(int j=i; j < input.length; j++){
                if(min>input[j]){
                    min=input[j];
                    index=j;
                }
            }

            if(min<input[i]){
                input[index]=input[i];
                input[i]=min;
            }
        }
        return input;
    }

}
