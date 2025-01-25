package java_tutorials;

public class Method5B {
    /**
     * 1. getSum(num1, num1) -> int 
     * 2. getDifference(num1, num2) -> int
     * 3. getProduct(num1, num2) -> int
     * 4. getQuotient(num1, num2) -> int
     */

     public int getSum(int num1, int num2){
         int sum = num1 + num2;
         return sum;
     }

     public int getDifference(int num1, int num2){
         int difference = num1 - num2;
         return difference;
     }

        public int getProduct(int num1, int num2){
            int product = num1 * num2;
            return product;
        }

        public double getQuotient(int num1, int num2){
            double quotient = num1 / num2;
            return quotient;
        }
}
