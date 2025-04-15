

interface Animal{
    void eat();

}
abstract class Creature{
    void Breadth(){
    System.out.println("Breathes");
    }
}
class Human extends Creature implements Animal{
    public void eat(){
        System.out.println("Eats food");
    }
}
public class OOps3{
    public static void main(String[] args){
        Human h = new Human();
        h.eat();
        h.Breadth();
    }
}