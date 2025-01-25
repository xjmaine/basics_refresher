package java_tutorials;

public class VariablesDataTypes3 {
    // Variables and data types

    public static void main(String[] args) {
        // Basic concepts and practical implementations
        // Variables are used to store data in memory
        //variables can be divided into primitive types and non primitive types
        //primitive types are the basic data types in java e.g. boolean, byte, short, int, long, float, double, char, etc
        //non primitive types are the reference types in java e.g. arrays, classes, interfaces, etc

        // data types are used to define the type of data that a variable can store

        // Primitive data types examples
        int i = 10; // integer
        float f = 1.0f; // floating point
        long l = 1000000000000000000L; // long integer
        double d = 1.0; // double precision floating point
        char c = 'a'; // character
        boolean b = true; // boolean
        byte by = 10; // byte
        short s = 100; // short integer
        String str = "Hello World"; // string


        System.out.println("Primitive data types examples");
        System.out.println("Integer: "+i);
        System.out.println("Float: "+f);
        System.out.println("Long: "+l);
        System.out.println("Double: "+d);
        System.out.println("Character: "+c);
        System.out.println("Boolean: "+b);
        System.out.println("Byte: "+by);
        System.out.println("Short: "+s);
        System.out.println("String: "+str);

        // concatenation
        System.out.println("Concatenation: "+(15+5)+i+f);
    }
}
