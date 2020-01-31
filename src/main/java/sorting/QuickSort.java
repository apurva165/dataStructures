package sorting;

public class QuickSort {
    public static void main(String[] args) {
        int[] array = {10, 3, 2, 5, 8, 4, 3, 1, 2, 9, 7, 8};
        quickSort(array, 0, array.length - 1);
    }

    private static void quickSort(int[] arr, int start, int end) {
        if (start < end) {
            int pivot = partition(arr, start, end);
            quickSort(arr, start, pivot-1 );
            quickSort(arr, pivot + 1,end);
        }
    }

    private static int partition(int[] arr, int p, int q) {
        int pivot = q;
        int i = p - 1;
        for (int j = p; j <= q; j++) {
            if (arr[j] <= arr[pivot]) {
                i++;
                int temp = arr[j];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        return i;
    }
}
