package javaIntro;

public class Java22SuperKeyWord extends Java23SuperParent {

    String name = "Nebyou";

    public void getStringName(){
        System.out.println(super.name);
    }

    public void getData(){
        System.out.println("This is my local data");
    }
    public void getMyData(){
        super.getData();
    }

    public static void main(String[] args) {
        Java22SuperKeyWord skw = new Java22SuperKeyWord();
        skw.getStringName();
        skw.getMyData();
    }
}
