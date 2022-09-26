class Stock {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices));
    }
    public static int maxProfit(int[] prices) {
        int profit=0, min = prices[0], j=1, arrlen = prices.length;
        while(j<arrlen){
            if(min>prices[j])
                min=prices[j];
            if(prices[j]-min>profit)
                profit = prices[j]-min;
            j++;
        }

        return profit;
    }
}