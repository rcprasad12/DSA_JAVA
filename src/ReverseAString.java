public class ReverseAString {

    public static void main(String[] args) {
        String str = "MALAYALAM";
        String rev = "";

        for(int i = str.length()-1;i>=0;i--){
            rev = rev + str.charAt(i);
        }
        System.out.println(rev);
        if (str.equals(rev)) {
            System.out.println(rev + " It is a Palindrome ");
        }else {
            System.out.println("It is not a Palindrome");
        }
    }
}
