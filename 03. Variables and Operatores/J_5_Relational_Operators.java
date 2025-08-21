public class J_5_Relational_Operators 
{
    public static void main(String[] args)
    {
        int x = 10, y = 20;
        
        // Using relational operators to compare x and y
        boolean isEqual = (x == y); // Equal to operator
        boolean isNotEqual = (x != y); // Not equal to operator
        boolean isGreater = (x > y); // Greater than operator
        boolean isLess = (x < y); // Less than operator
        boolean isGreaterOrEqual = (x >= y); // Greater than or equal to operator
        boolean isLessOrEqual = (x <= y); // Less than or equal to operator

        // Print the results of the comparisons
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        System.out.println("Is x equal to y? " + isEqual);
        System.out.println("Is x not equal to y? " + isNotEqual);
        System.out.println("Is x greater than y? " + isGreater);
        System.out.println("Is x less than y? " + isLess);
        System.out.println("Is x greater than or equal to y? " + isGreaterOrEqual);
        System.out.println("Is x less than or equal to y? " + isLessOrEqual);
    }
}
