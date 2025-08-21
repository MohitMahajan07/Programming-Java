public class J_3_Type_Conversion 
{
    public static void main(String[] args)
    {
        // Implicit type conversion (widening conversion)
        int intValue = 100;
        double doubleValue = intValue; // int to double
        System.out.println("Implicit Conversion: " + doubleValue);

        // Explicit type conversion (narrowing conversion)
        double anotherDoubleValue = 9.78;
        int anotherIntValue = (int) anotherDoubleValue; // double to int
        System.out.println("Explicit Conversion: " + anotherIntValue);

        // String to integer conversion
        String strNumber = "123";
        int convertedInt = Integer.parseInt(strNumber);
        System.out.println(strNumber + " String to Integer Conversion: " + convertedInt);

        // Integer to String conversion
        int number = 456;
        String convertedString = Integer.toString(number);
        System.out.println(number + " Integer to String Conversion: " + convertedString);
    }
}
