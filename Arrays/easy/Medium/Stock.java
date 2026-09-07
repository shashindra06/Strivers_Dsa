package Arrays.easy.Medium;

class Stock {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int maxi = 0;
        for (int num : prices) {
            if (num < min) {
                min = num;
            }
            maxi = Math.max(maxi, num - min);
        }
        return maxi;
    }
}
