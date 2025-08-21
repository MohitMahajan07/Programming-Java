class J_13_Static_Method_Test
{
    // Static method can be called without creating an instance of the class.
    // It belongs to the class rather than to any specific instance.
    public static void displayMessage()
    {
        System.out.println("In static method of different class.");
    }
}

public class J_13_Static_Method
{
    public static void main(String[] args) 
    {
        System.out.println("Main Start...");
        // Calling the static method without creating an instance of the class
        J_13_Static_Method_Test.displayMessage();
        System.out.println("Main end...");
    }
}