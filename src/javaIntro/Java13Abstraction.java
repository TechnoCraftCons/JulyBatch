package javaIntro;

 abstract class MyAbstractClass{

    // Abstract method doesn't have any implementation or body
    public abstract void GetCreditReport(String ssn);

    public abstract void GetTwoYearsInquires(String ssn);

    public void MyMethod(){
        System.out.println("This is my method");
    }
}

public class Java13Abstraction extends MyAbstractClass {

    public void GetCreditReport(String ssn){
        System.out.println("Getting the credit report of " + ssn + " member");
    }

    public  void GetTwoYearsInquires(String ssn){
        System.out.println("You have nth inquiry for member " + ssn);
    }

    public static void main(String[] args) {
        Java13Abstraction abs = new Java13Abstraction();
        abs.GetCreditReport("123-45-7896");
        abs.GetTwoYearsInquires("789-58-9633");

        // Abstract class can not be instantiated or we can not create an object of an abstract class
        //MyAbstractClass ab = new MyAbstractClass();
    }
}
