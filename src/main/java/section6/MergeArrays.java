package section6;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Objects;

public class MergeArrays {

    public static void main(String[] args) {

        Integer[] array1 = new Integer[]{0, 3, 4, 31};
        Integer[] array2 = new Integer[]{4, 6, 30};

        System.out.println(Arrays.toString(mergeArrays(array1, array2)));

    }

    public static Integer[] mergeArrays(Integer[] array1, Integer[] array2) {

        LinkedList<Integer> linkedList1 = new LinkedList<>(Arrays.asList(array1));
        LinkedList<Integer> linkedList2 = new LinkedList<>(Arrays.asList(array2));

        Integer[] output = new Integer[linkedList1.size() + linkedList2.size()];
        int i = 0;
        while (linkedList1.size() + linkedList2.size() > 0) {
            if (Objects.nonNull(linkedList1.peek()) && Objects.nonNull(linkedList2.peek())) {
                if (linkedList1.peek() < linkedList2.peek()) {
                    output[i] = linkedList1.pop();
                }else {
                    output[i] = linkedList2.pop();
                }
            }else {
                if (Objects.isNull(linkedList1.peek())){
                    output[i] = linkedList2.pop();
                }else {
                    output[i] = linkedList1.pop();
                }
            }
            i++;
        }

        return output;
    }

}
