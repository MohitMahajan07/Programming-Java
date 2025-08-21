class J_6_Add
{
    // Method overloading is a feature that allows a class to have more than one method with the same name,
    // as long as their parameter lists are different (either in number, type, or order of parameters).
    
    // Example of method overloading:
    
    public int add(int a, int b) 
    {
        return a + b;
    }
    
    public double add(double a, double b) 
    {
        return a + b;
    }
    
    public int add(int a, int b, int c) 
    {
        return a + b + c;
    }
}

public class J_6_Method_Overloading 
{
    public static void main(String[] args)
    {
        J_6_Add obj = new J_6_Add();

        int a = 5, b = 10;
        System.out.println(a + " + " + b + " = " + obj.add(a, b));

        double x = 5.5, y = 10.5;
        System.out.println(x + " + " + y + " = " + obj.add(x, y));

        int c = 9;
        System.out.println(a + " + " + b + " + " + c + " = " + obj.add(a, b, c));
    }
}
