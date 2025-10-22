public class lSearch {

    public static void main(String[] args) {
        int nums[] = {2,45,6,3,7,8,10};
        int target = 3;

        int result = linearSearch(nums,target);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }

    public static int linearSearch(int[] nums , int target){

        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] == target){
                return i;
            }


        }
        return -1;
    }
}
