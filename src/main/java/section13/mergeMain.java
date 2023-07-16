package section13;

import java.util.Arrays;

public class mergeMain {
    public static void main(String[] args) {

        int[] input = {13, 2, 4, 2, 4, 6, 8, 0, 12, 2, 5, 6};

        System.out.println(Arrays.toString(input));

        mergeSort(input, input.length);

        System.out.println(Arrays.toString(input));


    }

    public static void mergeSort(int[] a, int n) {
        if (n < 2) {
            System.out.println(Arrays.toString(a));
            return;
        }
        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = a[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = a[i];
        }

        System.out.println(Arrays.toString(a));

        mergeSort(l, mid);
        mergeSort(r, n - mid);

        merge(a, l, r, mid, n - mid);
    }


    public static void merge(
            int[] a, int[] l, int[] r, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                a[k++] = l[i++];
            } else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
        System.out.println(Arrays.toString(a));
    }

//        public static void mergeSort(Integer[] input){
//
//        if(input.length<2){
//            return;
//        }
//
//        int mid = input.length/2;
//
//        Integer[] left = new Integer[mid];
//
//        Integer[] right = new Integer[input.length-mid];
//
//        for (int i = 0; i < mid; i++) {
//            left[i]=input[i];
//        }
//
//        for (int i = mid; i < input.length; i++) {
//            right[i-mid]=input[i];
//        }
//        System.out.println(Arrays.toString(left));
//        System.out.println(Arrays.toString(right));
//
//        mergeSort(left);
//        mergeSort(right);
//
//        merge(input, left, right, mid, input.length/2-mid);
//    }

//    public static Integer[] merge(Integer[] left, Integer[] right){
//        Integer[] result=new Integer[left.length+right.length];
//        int leftIndex=0;
//        int rightIndex=0;
//
//        while(leftIndex<left.length && rightIndex<right.length){
//            if(left[leftIndex] < right[rightIndex]){
//                result[leftIndex+rightIndex]=left[leftIndex];
//                leftIndex++;
//            }else {
//                result[leftIndex+rightIndex]=right[rightIndex];
//                rightIndex++;
//            }
//        }
//        System.out.println(Arrays.toString(result));
//        return result;
//    };

}
