public class MaxWealth {

    public static void main(String[] args) {

    }
    public int maximumWealth(int[][] accounts){
        int answer = Integer.MIN_VALUE;
        for(int person = 0 ; person < accounts.length;person++){
            int summ = 0;
            for(int account = 0 ; account < accounts[person].length; account++){
                summ += accounts[person][account];

                if(summ >answer){
                    answer =summ;
                }

            }
            return summ ;
        }
        return answer;
    }
}
