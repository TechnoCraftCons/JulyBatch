package javaIntro;

import java.util.Arrays;

public class Java24Exceptions {
    // Exceptions are errors that will be caused by an issue with our code
    // We have two types of Errors in java
    // 1. Runtime it will happen on the runtime 1. Compile time it will happen o at the compilation of the code or before it got executed

    public static void main(String[] args) {
        int a = 8;
        int b = 0;
        int result;
        int c[]= {1,2,4,5,6};


        try{
            result = a/b;
            System.out.println(result);
            System.out.println(c[4]);
        }
        catch (ArithmeticException e) {
            System.out.println("You can not divide a number by Zero");
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("The index you've passed is out of bound. Please fix your index value");
        }
        // Unhandled exception
        catch (Exception e){
            System.out.println("Opps something went wrong");
        }
        finally {
            System.out.println("I'm running every time whether there is an exception or not");
        }

        }


    }

