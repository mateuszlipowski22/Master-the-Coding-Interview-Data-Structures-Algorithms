package section3;

import java.util.ArrayList;
import java.util.List;

public class Exercise3SpaceComplexity {

    public static void main(String[] args) {

        boooooo(new int[]{1,3,4,3,21,3,34});
        arrayOfHiNTiems(6);

    }

    public static void boooooo(int[] n){
        for (int i = 0; i < n.length; i++) {
            System.out.println("boooooooooooooooo");
        }
    }

    public static void arrayOfHiNTiems(int n){
        List<String> hiArray= new ArrayList<String>();

        for (int i = 0; i < n; i++) {
            hiArray.add("Hi");
            System.out.println(hiArray.get(i));
        }
    }
}
