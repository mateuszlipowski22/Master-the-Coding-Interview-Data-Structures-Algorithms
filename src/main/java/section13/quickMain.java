package section13;

import java.util.Arrays;

public class quickMain {
    public static void main(String[] args) {

        int[] input = {13, 2, 4, 2, 4, 6, 8, 0, 12, 2, 5, 6};

        System.out.println(Arrays.toString(input));

        quickSort(input, 0, input.length-1);

        System.out.println(Arrays.toString(input));


    }

    public static void quickSort(int arr[], int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(arr, begin, end);

            quickSort(arr, begin, partitionIndex-1);
            quickSort(arr, partitionIndex+1, end);
        }
    }

    public static int partition(int arr[], int begin, int end) {
        int pivot = arr[end];
        int i = (begin-1);
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
        System.out.println(pivot);
        for (int j = begin; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;
                int swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
                System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));

            }
        }

        int swapTemp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = swapTemp;
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));

        return i+1;
    }
}
