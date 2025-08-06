public class binarySearch {

    public static void main(String[] args) {
        //arrays must be sorted in binary search

        int[] arr = {3,9,27,81,229,343,455,678,888,9999};
        int target = 343;
        int ans = binarySSearch(arr,target);
        System.out.println(ans);

    }

    //return the index
    static int binarySSearch(int[] arr , int target){
        int start = 0 ;
        int end  = arr.length - 1 ;

        while(start <=end){
            //find the middle element
            // (start+end)/2 is not used to find middle element , becoz the range of int might exceed for large numbers in java
            int mid = start + (end-start)/2;

            if(target < arr[mid]){
                end = mid-1;
            } else if (target > arr[mid]) {
                start = mid+1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
