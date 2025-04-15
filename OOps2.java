abstract class Shape{
    abstract void area();
    void Display(){
        System.out.println("This is a shape");
    }
}
class Circle extends Shape{
    void area(){
        double radious= 5;
        double result= 3.14*radious*radious;
        System.out.println("Area of Circle is :" + result);
    }
    
}
class Rectangle extends Shape{
    void area(){
        int length=5;
        int breadth=10;
        int result = length*breadth;
        System.out.println("Area of rectangle is: " + result);
    }
}
public class OOps2{
    public static void main(String[] args){
        Circle c =new Circle();
        Rectangle r = new Rectangle();
        c.Display();
        c.area();
        r.Display();
        r.area();
    }
}