package sorting;

public class BinarySearchAlgo {

    public static void main(String[] args) {
        int[] arr = new int[]{5,9,17,23,25,45,59,63,71,89};
        int l = 0, r = arr.length;
        int key = 60;
        boolean isexist = findElement(arr,l,r,key);
        System.out.println("element found is: "+ isexist);
    }

    private static boolean findElement(int[] arr, int l, int r, int key) {
        if (arr.length == 0){
            return false;
        }
        if (l > r){
            return false;
        }
        int mid = (l+r)/2;
        if (arr[mid] == key){
            return true;
        }else if (key < arr[mid]){
            r = mid - 1;
            return findElement(arr,l,r,key);
        }else {
            l = mid + 1;
            return findElement(arr,l,r,key);
        }
    }


}
