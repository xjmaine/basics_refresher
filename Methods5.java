// package java_tutorials;
import java_tutorials.Method5B;

public class Methods5 {
    
    public static void main(String[] args) {
        // Methods in Java
        // A method is a block of statements/code that performs a specific task
        // Methods are used to perform certain actions, and they are also known as functions
        // Methods are used to define the behavior of objects
        // Methods are used to break down a complex problem into smaller and manageable tasks
        // Methods are used to reuse code
        // Methods are used to improve code readability

        // Syntax
        //method to return char in a string

        String name = "string";
        int index = 2;

        Methods5 mt = new Methods5();
        mt.getChar(name, index);
        mt.getHeight();

        Method5B mtb = new Method5B();
        System.out.println("The sum btn 2 numbers: "+ mtb.getSum(index, index) );
        System.out.println("The difference btn 2 numbers: "+ mtb.getDifference(13, index) );
        System.out.println("The product btn 2 numbers: "+ mtb.getProduct(index, index) );
        System.out.println("The quotient btn 2 numbers: "+ mtb.getQuotient(index, index) );
        
    }

    char getChar(String str, int index) {
        char c = str.charAt(index);
        System.out.println("The character at index " + index + " is " + c);
        return c;
    }

    void getHeight(){
        System.out.println("Height is 5.8");
    }
}
