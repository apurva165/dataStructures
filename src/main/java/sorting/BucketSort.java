package sorting;

public class BucketSort {
    static int arr[];
    private static int minVal;
    private static int maxVal;

    public int getMinVal() {
        return minVal;
    }

    public static void setMinVal(int minVal) {
        BucketSort.minVal = minVal;
    }

    public int getMaxVal() {
        return maxVal  = 0;
    }

    public void setMaxVal(int maxVal) {
        this.maxVal = maxVal;
    }

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
        bucketSort(arr);
        System.out.println("sorted Array");
        travserseArray();
    }

    private static void travserseArray(){
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    private static void bucketSort(int [] a) {
        double numOfBuckets = Math.floor(Math.sqrt(50));
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < numOfBuckets; i++){
          //     int bucketNum = Math.ceil()
            }
        }

    }

    private static void findMinMax(int [] a){
        for(int val: a){
            if(a[val] < minVal){
                setMinVal(5);
            }
        }

    }


}
