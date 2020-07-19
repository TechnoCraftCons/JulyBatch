package javaIntro;
// Polymorphism is the concept that we can use the same method using different forms the way representing it is called method overriding
 class Shape{
      public void Draw()
      {
         System.out.println("Drawing a shape ...");
     }
}

class Rectangle extends Shape{
     public void Draw(){
        System.out.println("I am drawing a rectangle");
     }
}

class Circle extends Shape{
     public void Draw(){
         System.out.println("I am drawing a circle");
     }
}

class Hexagon extends Shape{
     public void Draw(){
         System.out.println("I am drawing Hexagon");
     }
}

public class Java12Polymorphism {

    public static void main(String[] args) {
        Shape s = new Rectangle();
        s.Draw();

        Shape s1 = new Hexagon();
        s1.Draw();

        Shape s2 = new Circle();
        s2.Draw();


    }

}
