package sorting;

public class MergeSort {

    public static void main(String[] args) {
        int[] array = {10, 3, 2, 5, 8, 4, 3, 1, 2, 9, 7, 8};
        printArray(array);
        mergeSort(array, 0, array.length - 1);
        printArray(array);
    }

    private static void mergeSort(int[] arr, int left, int right) {
        if (right > left) {
            System.out.println("left :" + left);
            System.out.println("right :" + right);
            int middleVal = (left + right) / 2;
            System.out.println("middle Val :" + middleVal);
            mergeSort(arr, 0, middleVal);
            mergeSort(arr, middleVal + 1, right);
        }
    }

    private static void merge(int[] arr, int middle, int left, int right) {
        int[] leftTempArray = new int[middle - left + 2];
        int[] rightTempArray = new int[right - middle + 1];

        for (int i = 0; i <= middle - left; i++) //Copy values from Array 'A' to these tmp arrays
            leftTempArray[i] = arr[left + i];
        for (int i = 0; i < right - middle; i++)
            rightTempArray[i] = arr[middle + 1 + i];


    }
    private static void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

}
