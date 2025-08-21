class J_11_Static
{
    // Instance Variable 
    String brand;
    int price;
    static String name; // Static Variable

    public void showDetails() 
    {
        System.out.println("Brand: " + brand + ", Price: " + price + ", Name: " + name);
    }

}
public class J_11_Static_Variable 
{
    public static void main(String[] args)
    {
        // Creating objects of the J_11_Static class
        J_11_Static phone1 = new J_11_Static();
        J_11_Static phone2 = new J_11_Static();
        
        // Setting values for instance variables
        phone1.brand = "Samsung";
        phone1.price = 1000;
        
        phone2.brand = "Apple";
        phone2.price = 1200;
        
        // Setting value for static variable
        J_11_Static.name = "Smartphone";
        
        // Displaying details of both phones
        phone1.showDetails();
        phone2.showDetails();
        
        J_11_Static phone3 = new J_11_Static();
        
        phone3.brand = "oppo";
        phone3.price = 700;
        phone3.showDetails();
    }
}
