import java.util.Arrays;

public class binary2DSearch {

    public static void main(String[] args) {

        int[][] arr = {
                {10,20,30},
                {14,24,34},
                {16,26,44},
                //this array must be in sorted order
        };

        int[] ans = search(arr,34);

        System.out.println(Arrays.toString(ans));

    }

    static int[]search (int[][] matrix, int target){

                int r = 0 ;
                int c = matrix.length-1;

                while(r < matrix.length && c >=0){
                    if(matrix[r][c] == target){
                        return new int[]{r,c};
                    }
                    if(matrix[r][c] < target){
                        r++;
                    }
                    else{
                        c--;
                    }
                }
                return new int[] {-1,-1};
    }
}
