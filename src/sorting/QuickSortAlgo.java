package sorting;

public class QuickSortAlgo {

    public static void main(String[] args) {
        int[] arr = new int[]{7, 6, 10, 5, 9, 2, 1, 15, 5};
        int pivot = arr[0];
        int index = 0;
        int start = 0, end = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            while (arr[start] <= pivot) {
                start++;
            }
            while (arr[end] > pivot) {
                end--;
            }
            if (start < end) {
                swap(arr, start, end);
            } else {
                swap(arr, index, end);
            }
        }
    }

    private static void swap(int[] arr, int start, int end) {
        int temp = arr[end];
        arr[end] = arr[start];
        arr[start] = temp;
    }

}
