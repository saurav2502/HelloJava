package sorting;

import org.jetbrains.annotations.NotNull;

public class SelectionSortAlgo {

    public static void main(String[] args) {
        int[] arr = new int[]{7,4,10,8,3,1};
        for (int i = 0; i <arr.length-1 ; i++) {
            int min_index = findMinEle(arr,i,arr.length);
            swap(arr,i,min_index);
        }
        print(arr);
    }

    private static void swap(int[] arr, int i, int min_index) {
        int temp = arr[min_index];
        arr[min_index] = arr[i];
        arr[i] = temp;
    }

    private static int findMinEle(@NotNull int[] arr, int i, int length) {
        int key = arr[i];
        int minIndex = 0;
        for (int j = i; j < arr.length; j++) {
            if (key > arr[j]){
                key = arr[j];
                minIndex = j;
            }
        }
        return minIndex;
    }

    public static void print(@NotNull int[] arr){
        for (int p: arr){
            System.out.print(p+", ");
        }
    }
}
