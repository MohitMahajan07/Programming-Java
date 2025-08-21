class J_5_Calculator
{
    
    // Syntax: Method Declaration in Java
    /*
    * access modifier return_type method_name(parameter_list)
    * {
    *   // method body
    *  return value; // if return_type is not void
    * }
    */
        
    // Methods / Member functions of the Calculator class
    // These methods perform basic arithmetic operations
    public int add(int num1, int num2) 
    {
        return num1 + num2;
    }

    public int subtract(int num1, int num2) 
    {
        return num1 - num2;
    }

    public int multiply(int num1, int num2) 
    {
        return num1 * num2;
    }

    public double divide(int num1, int num2) 
    {
        if (num2 == 0)  return 0; // Avoid division by zero

        return (double) num1 / num2;
    }
}

public class J_5_Methods 
{
    public static void main(String[] args) 
    {
        int a = 10, b = 5;

        // Create an instance/Object of the Calculator class
        J_5_Calculator calculator = new J_5_Calculator();  

        System.out.println("Performing calculations with a = " + a + " and b = " + b);

        int result = calculator.add(a, b);// Call methods of the Calculator class
        System.out.println("Addition: " + result);
        result = calculator.subtract(a, b);
        System.out.println("Subtraction: " + result);
        result = calculator.multiply(a, b);
        System.out.println("Multiplication: " + result);
        System.out.println("Division: " + calculator.divide(a, b));
    }
}
