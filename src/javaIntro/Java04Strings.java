package javaIntro;

public class Java04Strings {
    public static void main(String[] args) {

        /*
        *  Naming Convntion iis a convention that you will follow while writing a code
        *  CamelCase - indexPointIndex
        *  PascalCase = IndexPointIndex
        * */

            // This is one way to declare a string
            String myString = "My Name is Nebyou";


            // This is the other way to declare a string by creating an object of string class
            String myString2 = new String("My name is Tomas");

           // In programming we start counting indexes from 0
           // charAt will return us the character that exists on the index we passed
           char indexPoint = myString.charAt(9);
           System.out.println(indexPoint);

           // indexOf will return the index of the character that we passes on the parameter
           int charFromIndex = myString.indexOf("s");
           System.out.println(charFromIndex);

           // endsWith will return true or false buy checking if the string ends with the suffix that we passes as the parameter
           boolean endsWithValue = myString.endsWith("u");
           System.out.println(endsWithValue);


           if(endsWithValue){
            System.out.println("I am getting a true response");
             }
            else {
            System.out.println("I am getting a false response");
            }



           // toLowerCase will convert the string to all lower cases
           String convertToLower = myString.toLowerCase();
           System.out.println(convertToLower);

           // toUpperCase will convert our string to all upper cases
           String convertTOUpperCase = myString.toUpperCase();
           System.out.println(convertTOUpperCase);

           int length = myString.length();
           System.out.println(length);



    }
}
