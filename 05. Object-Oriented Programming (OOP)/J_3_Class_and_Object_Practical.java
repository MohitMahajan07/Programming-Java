// Making a class 
// Syntax: class Declaration in java
/*
* class ClassName 
* { 
*       // class body 
* }
*/

class J_3_Demo
{
    // Methods / Member functions of the Demo class
    public void playMusic()
    {
        System.out.println("Playing music...");
    }

    public void stopMusic()
    {
        System.out.println("Music Stopped...");
    }

    public void displayMessage(String message)
    {
        System.out.println("Message: " + message);
    }
}

public class J_3_Class_and_Object_Practical 
{
    public static void main(String[] args) 
    {
        // Create an instance/Object of the Demo class
        J_3_Demo demo = new J_3_Demo();  

        demo.playMusic(); // Call methods of the Demo class
        demo.stopMusic();
        demo.displayMessage("Hello, this is a message from the Demo class!");
    }
}