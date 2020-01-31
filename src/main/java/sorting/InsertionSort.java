package sorting;

public class InsertionSort {
   private static int [] arr1 ;

    public static void main(String[] args) {
        arr1 = new int[8];
        arr1[0] = 40;
        arr1[1] = 30;
        arr1[2] = 6;
        arr1[3] = 4;
        arr1[4] = 28;
        arr1[5] = 22;
        arr1[6] = 236;
        arr1[7] = 243;

        travsersArray();

    }
    private static void travsersArray(){
        for(int i = 0; i < arr1.length; i++){
            System.out.println(arr1[i]);
        }
    }

    private static void  insertionSort(int [] a){
        for(int i = 0; i < a.length; i++) {
            int temp = a[i], j = i;
            while (j > 0 && a[j -1] > temp){
                a[j] = a[j - 1];
                j--;
            }
            a[j] = temp;
        }
    }


}
