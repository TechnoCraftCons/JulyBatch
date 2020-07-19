package javaIntro;

public class Java07InheritanceParent {

    public String id = "abc124";

    public void LastName(){
        System.out.println("Family Last Name");
    }

    public void Address(){
        System.out.println("123 main st, Dallas, TX 75321");
    }
    private void SSN(){
        System.out.println("123-12-7889");
    }

    public static void main(String[] args) {
        Java07InheritanceParent ip = new Java07InheritanceParent();

    }
}
