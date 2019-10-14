public class RunTimeAnalysis {
    private int[] intArray = {1, 3, 4, 6, 7, 8, 6, 44, 2, 3, 4};
    private int arrayLength = 11;
    private static int number = 3;
    static int[] sortedArray = {1, 3, 5, 6, 7, 8, 13, 23, 24, 26};
    public static void main(String[] args) {
     //   findBiggestInArray();
       // findBiggestInArrayRecursion(int[] intArray, 11);
      //  findNumberInArray(number, 0);
        binarySearch(13, 0, sortedArray.length - 1);
    }

    private static void findBiggestInArray() {
        int[] intArray = {1, 3, 4, 6, 7, 8, 6, 44, 2, 3, 4};
        int maxnumber = 0;  // O(1)
        for (int i = 0; i <= intArray.length - 1; i++) {    //O(n-1) ~ O(n)
            if (maxnumber < intArray[i]) {  // O(1)
                maxnumber = intArray[i];  // O(1)
            }
        }
        System.out.println(maxnumber); // O(1)
    }


    private static void findBiggestInArrayRecursion( int[] intArray, int arrayLength) {
        int tempNumber = 0;
        if(arrayLength == 0 ){
            return;
        }
        if(intArray[arrayLength - 1] > tempNumber) {
            tempNumber = arrayLength  -1;
            findBiggestInArrayRecursion(intArray, arrayLength - 1);
        }
        System.out.println(tempNumber);

    }

    private static void findNumberInArray( int num, int tempNumber) {
        int[] intArray1 = {1, 3, 5, 6, 7, 8, 13, 23, 24, 26, 45};   // O(n)
        if(intArray1[tempNumber] == num){  //(1)
            System.out.println(tempNumber); //(1)
            System.out.println(intArray1[tempNumber]); //(1)
           return;
        }
            tempNumber = tempNumber + 1;  //(1)
            findNumberInArray(num , tempNumber);  //O(n -1)

    }
   // int[] sortedArray = {1, 3, 5, 6, 7, 8, 13, 23, 24, 26}; // work needs to be done
    private static void binarySearch( int num, int firstElement, int lastElement) {
       if(sortedArray[sortedArray.length/2] == num){
            System.out.println(sortedArray.length/2);
           return;
        }
        if(sortedArray[sortedArray.length/2] < num){
           binarySearch(num, sortedArray[sortedArray.length/2 + 1], sortedArray[sortedArray.length - 1]);
        }
        if(sortedArray[sortedArray.length/2] > num){
            binarySearch(num, sortedArray[0] ,sortedArray[sortedArray.length/2 - 1]);
        }
        //tempNumber = tempNumber + 1;  //(1)
        //findNumberInArray(num , tempNumber);  //O(n -1)


    }

}