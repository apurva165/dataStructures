package sorting;

public class SelectionSort {
    static int arr[];

    public static void main(String[] args) {
        arr = new int[9];
        arr[0] = 40;
        arr[1] = 30;
        arr[2] = 6;
        arr[3] = 4;
        arr[4] = 28;
        arr[5] = 22;
        arr[6] = 236;
        arr[7] = 243;
        arr[8] = 233;


        travserseArray();
        selectionSort(arr);
        System.out.println("sorted Array");
        travserseArray();
    }

    private static void travserseArray(){
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    private static void selectionSort(int [] a) {
        for(int i = 0; i < a.length; i++){
            for (int j = i + 1; j < a.length; j++){
                if(a[j] < a[i]){
                    int tempVal = a[j];
                    a[j] = a[i];
                    a[i] = tempVal;
                }
            }
        }
    }

}
