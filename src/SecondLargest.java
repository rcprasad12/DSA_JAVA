import java.sql.PseudoColumnUsage;
import java.sql.SQLOutput;

public class SecondLargest {

    public static void main(String[] args) {

        int arr[] = {23,56,6,-88,-999,345,9999};

        int first = Integer.MIN_VALUE;
        int Second = Integer.MIN_VALUE;

        for(int num : arr){
            if(num > first){
                Second = first;
                first  = num ;
            } else if (num > Second && Second !=first) {
                Second = num;
            }

        }
        System.out.println(Second);

    }

}
