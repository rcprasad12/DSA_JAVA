public class MaxWealth {

    public static void main(String[] args) {

    }
    public int maximumWealth(int[][] accounts){
        int answer = Integer.MIN_VALUE;
        for(int person = 0 ; person < accounts.length;person++){
            int sum = 0;
            for(int account = 0 ; account < accounts[person].length; account++){
                sum += accounts[person][account];

                if(sum >answer){
                    answer =sum;
                }

            }
            return sum ;
        }
        return answer;
    }
}
