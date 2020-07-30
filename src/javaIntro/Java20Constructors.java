package javaIntro;
// Constructors are always called by the time of object creation
// If we don't have a constructor created by ourselves Java will create one for us which is called a default constructor
public class Java20Constructors {
    // Constructors will always have the same name with the class
    // Will not have a return type
    // We have two types of constructors 1. Default Constructor  2. Parametrized constructor
    public  Java20Constructors(){
        System.out.println("I am the first one to be called");
    }
    public Java20Constructors(String a){
        System.out.println("This is my Parameterized Constructor " + a);
    }

    public void MyMethod(){
        System.out.println("This is my Method");
    }
    public static void main(String[] args) {
        Java20Constructors cons = new Java20Constructors();
        cons.MyMethod();
    }
}
