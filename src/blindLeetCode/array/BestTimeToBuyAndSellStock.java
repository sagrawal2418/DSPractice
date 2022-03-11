package blindLeetCode.array;

public class BestTimeToBuyAndSellStock {

    public static void main(String[] args) {
        maxProfit(new int[]{7, 3, 14, 1, 5});
    }

    public static int maxProfit(int[] prices) {

        int minIndex = 0, profit = 0;


        for (int i = minIndex + 1; i < prices.length; i++) {
            if (prices[i] > prices[minIndex]) {
                if (prices[i] - prices[minIndex] > profit) {
                    profit = prices[i] - prices[minIndex];
                }
            }

            if (prices[i] < prices[minIndex]) {
                minIndex = i;
            }

        }

        return profit;

    }
}
