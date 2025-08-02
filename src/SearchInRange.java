public class SearchInRange {

    public static void main(String[] args) {
            int [] arr = {1,34,54,333,5678,9999};
            int target = 333;
        System.out.println(linearSearch( arr,target , 1,4));
    }

    static int linearSearch(int[] arr , int target , int start , int end){

                if(arr.length == 0) {
                    return -1;
                }
                for(int index = start ; index <= end; index++){
                    int element = arr[index];
                    if(element == target){
                        return index;
                    }
                }
                return -1;
    }
}
