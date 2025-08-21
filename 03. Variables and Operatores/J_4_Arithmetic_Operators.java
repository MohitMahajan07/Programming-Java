public class J_4_Arithmetic_Operators 
{
    public static void main(String[] args)
    {
        int a = 10, b = 5;

        // Arithmetic operations
        // Note: Arithmetic operators can be used with both integers and floating-point numbers
        int sum = a + b; // Addition
        int difference = a - b; // Subtraction      
        int product = a * b; // Multiplication
        int quotient = a / b; // Division
        int remainder = a % b; // Modulus
        
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
        System.out.println("Addition: " + sum);
        System.out.println("Subtraction: " + difference);
        System.out.println("Multiplication: " + product);
        System.out.println("Division: " + quotient);
        System.out.println("Remainder: " + remainder);

        // Increment and Decrement operations
        // Note: Increment and Decrement operators can be used in both pre-increment/decrement
        int increment = ++a; // Increment
        int decrement = --b; // Decrement

        System.out.println("Increment a: " + increment);
        System.out.println("Decrement b: " + decrement);
    }
}
