package arrays;

import java.util.Arrays;

public class TwoDArrays {
    private static int[][] arr = null;
    public static void main(String[] args){
        arr = new int[2][2];
        declare2Darray();
        traversArray();
        addValue(1,1,28);
        traversArray();
        addValue(1,1,89);
        traversArray();
    }
    private static void declare2Darray() {
        for (int[] ints : arr) {
            //  System.out.println(arr[row][col]);
            Arrays.fill(ints, Integer.MIN_VALUE);
        }
    }

    private static void traversArray() {
        for (int[] ints : arr) {
            for (int anInt : ints) {
                //   arr[row][col] = Integer.MIN_VALUE;
                System.out.println(anInt);
            }
        }
    }

    private static void addValue(int row, int col, int val) {
           if (arr[row][col] == Integer.MIN_VALUE) {
                arr[col][row] = val;
                System.out.println(arr[row][col]);
           }
                else {
                   System.out.println("already contains value");
               }
        }
}
