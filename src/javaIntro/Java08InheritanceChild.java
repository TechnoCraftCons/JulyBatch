package javaIntro;

public class Java08InheritanceChild extends Java07InheritanceParent {

// Inheritance it is a wa that we can access the properties and methods of other classes
    public void Name(){
        System.out.println("ChildName");
    }
    public static void main(String[] args) {
        Java08InheritanceChild ic = new Java08InheritanceChild();
        ic.Name();
        ic.Address();
        ic.LastName();
        System.out.println(ic.id);
    }
}
