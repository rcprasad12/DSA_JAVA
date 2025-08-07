public class orderAgnostic {

    public static void main(String[] args) {

        int[] arr = {3,9,27,81,229,343,455,678,888,9999};
        int target = 343;
        int ans = Orderagonisticcc(arr,target);
        System.out.println(ans);
    }

    static int Orderagonisticcc(int[] arr , int target){
        int start = 0 ;
        int end  = arr.length - 1 ;

        boolean isAsc;
        if(arr[start]< arr[end]){
            isAsc = true;
        }
        else {
            isAsc = false;
        }

        while(start <=end){
            //find the middle element
            // (start+end)/2 is not used to find middle element , becoz the range of int might exceed for large numbers in java
            int mid = start + (end-start)/2;

            if(arr[mid] == target){
                return mid;
            }
            if(isAsc){
                if(target < arr[mid]){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }
            else{
                if(target > arr[mid]){
                    end = mid-1;
                } else if (target < arr[mid]) {
                    start = mid+1;
                }
            }

        }
        return -1;
    }

}
