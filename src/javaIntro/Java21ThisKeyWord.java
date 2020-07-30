package javaIntro;

public class Java21ThisKeyWord {
// A variable outside the method it is called a global variable
    int a = 3;

    public void GetData(){
        // A variable  inside a method is called local variable
        int a = 10;
        System.out.println(a);
        System.out.println("If I want to print/access global variables I use this keyword " + this.a);
    }

    public  void GetAnotherData(){
        System.out.println(a);
    }

    public static void main(String[] args) {
        Java21ThisKeyWord tkw = new Java21ThisKeyWord();
        tkw.GetData();
        tkw.GetAnotherData();
    }
}
