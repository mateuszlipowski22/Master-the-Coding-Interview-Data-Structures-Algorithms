package section7;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        int[] array1 = new int[]{2,5,1,2,3,5,1,2,4};

        int[] array2 = new int[]{2,1,1,2,3,5,1,2,4};

        int[] array3 = new int[]{2,3,4,5};

        System.out.println(findRecurring(array1));
        System.out.println(findRecurring(array2));
        System.out.println(findRecurring(array3));

    }

    public static int findRecurring(int[] array){

        Map map = new HashMap();

        for (int i = 0; i < array.length; i++) {
            if(map.containsKey(array[i])){
                return array[i];
            }else {
                map.put(array[i], i);
            }
        }
        return Integer.MIN_VALUE;
    }

}
