public class J_3_Ternary 
{
    public static void main(String[] args)
    {
        int num = 11;
        // Ternary Operator
        // Syntax: condition ? expression1 : expression2
        String ans = (num %2 == 0) ? "Even" : "Odd";
        
        System.out.println(num + " is: " + ans);
    }
}
