// Static Block is used to initialize static variables or perform actions that need to be executed only once when the 
// class is loaded.

class J_12_Static
{
    // Instance Variable 
    String brand;
    int price;
    static String name; // Static Variable

    static 
    {
        // Static block to initialize static variable
        name = "Smartphone";
        System.out.println("Static block executed. Static variable 'name' initialized to: " + name);
    }

    public void showDetails() 
    {
        System.out.println("Brand: " + brand + ", Price: " + price + ", Name: " + name);
    }

}

public class J_12_Static_Block 
{
    public static void main(String[] args)
    {
        // Creating objects of the J_11_Static class
        J_12_Static phone1 = new J_12_Static();
        J_12_Static phone2 = new J_12_Static();
        
        // Setting values for instance variables
        phone1.brand = "Samsung";
        phone1.price = 1000;
        
        phone2.brand = "Apple";
        phone2.price = 1200;
        
        // Displaying details of both phones
        phone1.showDetails();
        phone2.showDetails();
        
        J_12_Static phone3 = new J_12_Static();
        
        phone3.brand = "oppo";
        phone3.price = 700;
        phone3.showDetails();
    }
}
