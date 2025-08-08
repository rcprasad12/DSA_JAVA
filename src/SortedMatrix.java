public class SortedMatrix {

    public static void main(String[] args) {

    }

    static int[] binarysearch(int[][] matrix ,int row , int cstart , int cend , int taregt){
        while (cstart <= cend){
            int mid = cstart + (cend - cstart)/2;
            if(matrix[row][mid] == taregt){
                return new int[]{row,mid};
            }
            if(matrix[row][mid] < taregt){
                cstart = mid + 1;
            }
            else {
                cend = mid-1;
            }
        }
        return new int[] {-1,-1};
    }

    static int[] search(int[][] matrix , int target){
        int rows = matrix.length;
        int cols = matrix[0].length;

        if(rows== 1) {
            return binarysearch(matrix,0,0,cols-1,target);

        }
        int rstart = 0;
        int rends = rows -1;
        int cmid = cols/2;


        //run the loop till 2 rows are remaining

        while (rstart < (rends-1)){
            int mid = rstart + (rends - rstart)/2;
            if(matrix[mid][cmid] == target){
                return new int[]{mid,cmid};
            }
            if(matrix[mid][cmid] < target){
                rstart = mid;
            }
            else{
                rends =mid;
            }

            // noow we have two rows
            //check whether the target is in the cols of 2rows
            if(matrix[rstart][cmid] == target){
                return new int[] {rstart,cmid};
            }

            //search in the first matrix
            if(target <= matrix[rstart][cmid-1]){

            }
            if(target >= matrix[rstart][cmid-1]){

            }
            if(target <= matrix[rstart+1][cmid-1]){

            }
                else {

            }
        }

    }

}
