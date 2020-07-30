package javaIntro;

public class Java09InheritanceGrandChild extends Java08InheritanceChild{

    // Is multiple inheritance allowed in Java?
    // No, multiple inheritance is not allowed in Java
    // How do we accomplish multiple inheritance in Java?
    // We can use multilevel inheritance or Interfaces
    public static void main(String[] args) {
        Java09InheritanceGrandChild igc = new Java09InheritanceGrandChild();
        igc.LastName();
        igc.Name();
        igc.Address();
    }
}
