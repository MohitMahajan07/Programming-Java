public class J_2_If_Else_If 
{
    public static void main(String[] args)
    {
        int age = 10;

        // If-Else If Statement
        if(age >= 18)
        {
            System.out.println("You can Drive");
        }
        else if(age >= 16)
        {
            System.out.println("You can Drive with a Learner's Permit");
        }
        else if(age >= 14)
        {
            System.out.println("You can ride a bicycle");
        }
        else
        {
            System.out.println("You cannot drive or ride a bicycle");
        }
    }
}
