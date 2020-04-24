package DandQ;

public class MinCostToReactEOA {
    public static void main(String[] args) {
        int[][] arr =
                {
                        {4, 7, 8, 6, 4},
                        {6, 7, 3, 9, 2},
                        {3, 8, 1, 2, 4},
                        {7, 1, 7, 3, 7},
                        {2, 9, 8, 9, 3}
                };

        findMinCost(arr, arr.length - 1, arr[0].length - 1);
    }

    public static int findMinCost(int[][] arr, int col, int row) {
        if (row == -1 || col == -1) {
            return Integer.MAX_VALUE;
        }
        if (row == 0 && col == 0) {
            return arr[0][0];
        }

        int c1 = findMinCost(arr, col - 1, row);
        int c2 = findMinCost(arr, col, row - 1);

        return Integer.min(c1, c2) + arr[row][col];

    }
}
