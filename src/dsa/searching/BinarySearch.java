package dsa.searching;

public class BinarySearch {


    public static void main(String[] args) {

    }

    //normal binary search

    private static int binarySearch(int[] arr, int target){

        int left = 0;
        int right = arr.length-1;

        while (left <= right){

            int mid = (left + right)/2;

            if(arr[mid] == target){
                return mid;
            }else if(arr[mid] < target){
                left = mid+1;
            } else right = mid-1;
        }
        return -1;
    }

    //Recursive Binary search

    private static int recursiveBinarySearch(int[] arr, int left, int right, int target){

        while (left <= right){
            int mid = left + (right-left)/2;
            
            if (arr[mid]==target){
                return mid;
            } else if (arr[mid]<target) {
                return recursiveBinarySearch(arr, mid+1, right, target);
            } else return recursiveBinarySearch(arr, left, mid-1, target);
        }
        return -1;
    }
}
