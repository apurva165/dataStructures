public class Recursion {
    private static long factSum = 1000;
    public static void main(String[] args) {
     //   recursion(6);
     //   factorial(5);
     //   fibonacci(7);
    }
     private static void recursion(int number){
        System.out.println(number);
        if (number == 0) {
            return;
        }
        recursion(number - 1 );
   }

   private static long factorial(int number) {
        if (number <= 1){
            return 1;
        }
        factSum = number * factorial(number - 1);
        System.out.println(factSum);
        return factSum;
   }
   private static int fibonacci(int number) {
        if(number == 1) {
            return  0;
        }
        if(number == 2) {
            return  1;
        }
      int fibonacciNumber = fibonacci(number - 1) + fibonacci(number - 2);
        System.out.println(fibonacciNumber);
        return fibonacciNumber;
    }
}
