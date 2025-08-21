public class J_8_String 
{
    public static void main(String[] args) 
    {
        // Creating a string using String using new keyword
        // Syntax: String str = new String("value");
        String str1 = new String("Hello, Mohit!");

        // Creating a string using String literal
        // Syntax: String str = "value";
        String str2 = "Hello, World!";
        
        
        // Displaying the strings
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);
        
        // Concatenating strings
        String str3 = str1 + " Welcome to Java!";
        System.out.println("Concatenated String: " + str3);
        
        // Finding the length of a string
        int len = str1.length();
        System.out.println("Length of String 1: " + len);
        
        // Converting to uppercase
        // Syntax: String str.toUpperCase()
        System.out.println("String 1 in uppercase: " + str1.toUpperCase());
        
        // Checking if a string contains a substring   
        System.out.println("Does String 1 contain 'World'? " + str1.contains("World"));

        // method to get character at a specific index
        // Syntax: char str.charAt(index)
        char ch = str1.charAt(7); // 'W' is at index 7
        System.out.println("Character at index 7: " + ch);
    }
}
