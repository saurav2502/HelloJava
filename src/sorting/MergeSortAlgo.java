package sorting;

public class MergeSortAlgo {

    public static void main(String[] args) {
        int[] arr = new int[]{15,5,24,8,1,3,16,10,20};
        int lb = 0;
        int ub = arr.length;
        mergeSort(arr,lb,ub);
    }

    private static void merge(int[] arr, int lb, int mid, int ub) {
        int i = lb;
        int j = mid +1;
        int k = lb;
        int[] b = new int[arr.length];
        while (i <= mid && j <= ub){
            while (arr[i] <= arr[j]){
                b[k] = arr[i];
                i++;k++;
            }
            while (arr[j] <= arr[i]){
                b[k] = arr[j];
                j++;
                k++;
            }
        }
        if (i > mid){
            while (j <= ub){
                b[k] = b[j];
                k++;
                j++;
            }
        }else {
            while (i <= mid){
                b[k] = b[i];
                k++;i++;
            }
        }
    }

    private static void mergeSort(int[] arr, int lb, int ub) {
        if (lb < ub){
            int mid = (lb + ub)/2;
            mergeSort(arr, lb, mid);
            mergeSort(arr, mid+1, ub);
            merge(arr,lb,mid,ub);
        }
    }
}
