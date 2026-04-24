public class q7BuyandSell {

    public static int maxProfit(int[] prices) {
        int max = 0;
        int min = prices[0];

        for (int price : prices) {
            max = Math.max(max, price - min);
            min = Math.min(min, price);
        }

        return max;
    }

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};

        int result = maxProfit(prices);
        System.out.println("Maximum Profit: " + result);
    }
}