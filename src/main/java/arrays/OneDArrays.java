package arrays;

public class OneDArrays {
    private static int[] arr = null;
    public static void main(String[] args) {
        createArray();
        insertValue(2, 2);
        insertValue(1, 1);
        printValueForLocation(2);
    }

    private static void createArray() {
        arr = new int[10];
        for (int i = 0; i <10; i++ ){
            arr[i] = Integer.MIN_VALUE;
            System.out.println(arr[i]);
        }
    }

    private static void insertValue(int location, int value) {
       try {
           if(arr[location] == Integer.MIN_VALUE) {
               arr[location] = value;
           } else {
               System.out.println("occupied by another value ");
           }
       }
        catch (ArrayIndexOutOfBoundsException e){
           System.out.println(e);
        };
    }

    private static void  printValueForLocation(int location){
        System.out.println("at " + location +" value present is : "+ arr[location]);
    }

    private static void deleteValue(int location, int value) {
        try {
                arr[location] = Integer.MIN_VALUE;
                System.out.println("deleted value by another value ");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        };
    }

}
