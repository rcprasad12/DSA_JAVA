import java.util.Arrays;
import java.util.Scanner;

public class SearchIn2Darray {

    public static void main(String[] args) {

            int [][] arr = {
                    {2,4,6,8} ,
                    {21,34,56,78} ,
                    {11,23,44,666} ,
                    {18,22}
            };
            Scanner sc = new Scanner(System.in);
            int target = sc.nextInt();
            int[]ans = search(arr,target);
        System.out.println(Arrays.toString(ans));
    }

    static  int[] search (int [][] arr , int target ){

        for(int row = 0 ; row < arr.length ; row++){
            for(int col = 0 ; col < arr[row].length ; col++){
                    if(arr[row][col] == target){
                        return new int[]{row,col};
                    }
            }
        }
        return new int[]{-1,-1};

    }
}
