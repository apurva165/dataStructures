package sorting;

import com.sun.java.swing.plaf.windows.WindowsDesktopIconUI;

public class BubbleSort {
    static int arr[];
    public static void main(String[] args) {
        arr = new int[5];
        arr[0] = 40;
        arr[1] = 30;
        arr[2] = 6;
        arr[3] = 3;
        arr[4] = 23;

        printArray(arr);
        bubbleSort1(arr);
        printArray(arr);
    }

    public static void bubbleSort1(int[] arr) {
        for(int index = 0; index < arr.length -1; index++) {
            for(int j = 0; j < arr.length - 1 - index; j ++) {
                if(arr[j] > arr[j + 1]) {
                    int tempArr = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = tempArr;
                }
            }
        }
    }


   private static void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

}
