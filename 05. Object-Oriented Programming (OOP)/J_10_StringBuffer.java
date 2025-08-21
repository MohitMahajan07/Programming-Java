public class J_10_StringBuffer 
{
    // The StringBuffer class in Java is used to create mutable strings, which means that the content of a StringBuffer 
    // can be changed after it is created.
    public static void main(String[] args) 
    {
        // Creating a StringBuffer object
        // Syntax: StringBuffer sb = new StringBuffer("initial value");
        StringBuffer sb = new StringBuffer("Hello, World!");

        // Displaying the initial content of the StringBuffer
        System.out.println("Initial StringBuffer: " + sb);

        // Appending text to the StringBuffer
        sb.append(" Welcome to Java!");
        System.out.println("After append: " + sb);

        // Inserting text at a specific position
        sb.insert(7, "Java ");
        System.out.println("After insert: " + sb);

        // Reversing the content of the StringBuffer
        sb.reverse();
        System.out.println("After reverse: " + sb);

        // Deleting a portion of the StringBuffer
        sb.delete(0, 5); // Deletes characters from index 0 to 4
        System.out.println("After delete: " + sb);
        
        // Finding the length of the StringBuffer
        int len = sb.length();
        System.out.println("Length of StringBuffer: " + len);
    }
}
