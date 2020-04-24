package DandQ;


public class ZeroOneKnapsack {
    public static void main(String[] args) {
        int[] profits = {3, 2, 5, 8, 4, 3, 1, 2, 9, 7, 8};
        int[] capacity = {3, 2, 5, 8, 4, 3, 1, 2, 9, 7, 8};

       int pro = knapsackAux(profits, capacity, 20, 0);

        System.out.println(pro);
    }

    private static int knapsackAux(int[] profits, int[] weights, int capacity, int currentIndex) {
        if (capacity <= 0 || currentIndex < 0 || currentIndex >= profits.length)//Base case
            return 0;

        int profit1 = 0;
        if (weights[currentIndex] <= capacity) // Taking current element
            profit1 = profits[currentIndex] + knapsackAux(profits, weights, capacity - weights[currentIndex], currentIndex + 1);

        int profit2 = knapsackAux(profits, weights, capacity, currentIndex + 1); // Not taking current element
        return Math.max(profit1, profit2);
    }//end of method


}

