package sorting;

import java.util.ArrayList;
import java.util.List;

public class QuickSortAlgo {

    public static void main(String[] args) {
        int[] arr = new int[]{7, 6, 10, 5, 9, 2, 1, 15, 5};
        int lb= 0;
        int ub = arr.length-1;
        quickSort(arr,lb,ub);
        printSortedArray(arr);
    }

    private static void printSortedArray(int[] arr) {
        List<Integer>list = new ArrayList<>();
        for (int data: arr){
            list.add(data);
        }
        System.out.println(list);
    }

    private static void quickSort(int[] arr, int lb, int ub) {
        if (lb < ub){
            int loc = partition(arr,lb,ub);
            quickSort(arr,lb,loc-1);
            quickSort(arr,loc+1,ub);
        }
    }

    private static int partition(int[] arr, int lb, int ub) {
        int pivot = arr[lb];
        int start = lb;
        int end = ub;
        while (start < end){
            while (pivot >= arr[start]){
                if (start <= arr.length-2){
                    start++;
                }else{
                    if (arr.length-1 == start){
                        break;
                    }
                }
            }
            while (arr[end] > pivot){
                end--;
            }
            if (start < end){
                swap(arr, start,end);
            }
        }
        swap(arr,lb,end);
        return end;
    }

    private static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }


}
