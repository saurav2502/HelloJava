package letcode;

import java.util.Arrays;

public class MergeArray {
    public static void main(String[] args) {
        int[] arr1 = new int[10];
        for (int i = 0; i <4; i++) {
            arr1[i] = i+1;
        }
        int[] arr2 = new int[4];
        for (int j = 0; j <4; j++) {
            arr2[j] = j+1;
        }

        int[] c = mergeArray(arr1,arr1.length,arr2,arr2.length);
        Arrays.sort(c);
        for (int i = 0; i <c.length ; i++) {
            System.out.print(c[i]+" ");
        }
    }

    private static int[] mergeArray(int[] arr1, int length, int[] arr2, int length1) {
        int[] ret = new int[length];
        if (length == 0){
            int j=1;
            for (int i = 1; i <= length1; i++) {
                arr1[i] = arr2[j++];
            }
            return arr1;
        }else {
            int p =0;
            for (int i = length; i <arr1.length ; i++) {
                ret[i] = arr2[p++];
            }
        }
        return ret;
    }
}
