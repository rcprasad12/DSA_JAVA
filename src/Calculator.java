import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int ans = 0 ;

        while (true) {
            System.out.println("enter the operator : ");

            char op = sc.next().trim().charAt(0);
            System.out.println();

            if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){
                System.out.println("Enter the two numbers : ");
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();
                System.out.println();
                if(op == '+'){
                    ans = num1 + num2 ;
                }
                if(op == '-'){
                    ans = num1 - num2 ;
                }
                if(op == '*'){
                    ans = num1 * num2;
                }
                if(op == '/'){
                    if(num2 !=0) {
                        ans = num1 / num2;
                    }
                }
                if(op == '%'){
                    ans = num1 % num2 ;
                }

            }
            else if(op == 'x' || op == 'X'){
                break;
            }
            else {
                System.out.println("Invalid Operator");
            }
            System.out.println(ans);

        }

    }
}
