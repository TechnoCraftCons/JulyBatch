package javaIntro;

public class Java01Basics {

    // A main method always java will look for this method to start executing the code
    public static void main(String[] args) {

        System.out.println("This is my first Java code");

        System.out.println("This is my first Java code");

        // Java is always case sensitive

        // Data types -
        // Variables -
        // Values -


        // It will hold only two values which are true or false
        boolean b = false;

        // byte data type will hold values from -128 to 127
        byte c = 127;

        System.out.println(c);
        // short datatype will hold values from -32,768 to 32,767

        short d = 32767;
        System.out.println(d);

        // int data type will hold values from -2,147,483,648  to 2,147,483,647

        int a = 2147483647;

        long g = 9223372036854775807L;

        // float  data type will hold a decimal value  and should end with f

        float e = 214748364785264892325165165165156165161.054634455616512651651616356165161651651613165616161616516161f;

        // double data type will hold a decimal value but more value than float and it shouldn't end with f
        double f = 2147483647852648923251651651651561651612.054634455616512651651616356165161651651613165616161616516161;

        // String data type is used to hold sting/words
        String mystring = "This is my string";

        // Printing a value with out the double quote it will print the value assigned to the variable
        System.out.println(mystring);
        // printing a value with a double quote it will print the value inside the double quote
        System.out.println("mystring");


        // I will create an object of the class

        Java02Methods jm = new Java02Methods();
        jm.AddTwoNumbers();
        jm.AddTwoNumbersWithParameter(100,100);



    }

}
