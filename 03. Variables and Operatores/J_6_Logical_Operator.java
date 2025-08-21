public class J_6_Logical_Operator 
{   
    public static void main(String[] args)
    {
        boolean a = true, b = false;

        // Logical operations using boolean values
        // Using logical operators
        boolean andResult = a && b; // Logical AND
        boolean orResult = a || b; // Logical OR
        boolean notResult = !a; // Logical NOT

        // Print the results of the logical operations
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
        System.out.println("Logical AND (a && b): " + andResult);
        System.out.println("Logical OR (a || b): " + orResult);
        System.out.println("Logical NOT (!a): " + notResult);
    }
}
