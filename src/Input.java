import java.util.Arrays;
import java.util.Scanner;

public class Input {

    public static void main(String[] args) {
            int[] arr = new int[5];
            arr[0] = 22;
            arr[1] = 33;
            arr[2] = 44;
            arr[3] = 55;
            arr[4] = 66;
        System.out.println(arr[3]);

        Scanner sc = new Scanner(System.in);

        String[] str = new String[4];
        for(int i = 0 ; i < str.length; i++){
            str[i] = sc.next();
        }
        System.out.println(Arrays.toString(str));
    }
}
