package java_tutorials;

public class Operators4 {

    public static void main(String[] args) {
        // operators in java are used to perform operations on variables and values (e.g. +, -, *, /, %, etc.)
        // operators are used to perform arithmetic, logical, and comparison operations
        // Operators are grouped into groups based on their functionality
        // 1. Arithmetic operators (e.g. +, -, *, /, %)
        // 2. Assignment operators (e.g. =, +=, -=, *=, /=, %=)
        // 3. Comparison operators (e.g. ==, !=, >, <, >=, <=)
        // 4. Logical operators (e.g. &&, ||, !)
        // 5. Bitwise operators (e.g. &, |, ^, ~, <<, >>, >>>)
        // 6. Special operators (e.g. instanceof, new, (type), ? :)
        // 7. Equality operators (e.g. ==, !=)
        // 8. Conditional operators (e.g. &&, ||)

        //Types 
        // 1. Unary operators
        // 2. Ternary operators
        // 3. Binary operators (e.g arithmetic, conditional, equality)

        //Examples
        System.out.println("=== Arithmetic operators ===");
        System.out.println(2==3);
        System.out.println(false && true);

        //ternary operators
        int a = 10;
        int b = 20;
        int c = (a > b) ? a : b;

        System.out.println("=== Ternary operators ===");
        System.out.println(c);

        //binary operators
        System.out.println("=== Binary operators ===");
        System.out.println(10 + 20);
        System.out.println(10 - 20);
        System.out.println(10 * 20);
        System.out.println(10 / 20);
        System.out.println(10 % 20);

        //assignment operators
        int x = 10;
        int y = 20;
        System.out.println("=== Assignment operators ===");
        System.out.println(x += y);
        System.out.println(x -= y);
        System.out.println(x *= y);
    }
}