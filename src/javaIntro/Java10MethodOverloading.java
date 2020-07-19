package javaIntro;

public class Java10MethodOverloading {

    // Method Overloading is a concept that a method have the same name but different parameters
    public void MyMethod(){
        System.out.println("This is my method");
    }

    public void MyMethod(int a){
        System.out.println("My value is an integer " + a);
    }

    public void MyMethod(double a){
        System.out.println("My value is a double" + a);
    }

    public void MyMethod(boolean a){
        System.out.println("My value is a boolean value " + a);
    }

    public void MyMethod(int a , int b){
        System.out.println("I have two integer parameters " + a + " " + b);
    }
    public void MyMethod(int a ,int b, int c){

    }
}
