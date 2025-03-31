package data;

import java.util.Arrays;

/**
 * @author zzgcn
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] a = {2, 4, 5, 1, 34, 1, 23, 32, 5423, 532, 423};
        int[] sort = sort(a);
        System.out.println(Arrays.toString(sort));
    }


    static int[] sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }



}
