abstract class Animal{
    abstract void makeSound();
    void sleep(){
        System.out.println("Sleeping...");
    }
}class Dog extends Animal{
    void makeSound(){
        System.out.println("Dog barks");
    }
}
public class OOps1{
    public static void main(String[] args){
        Animal n= new Dog();
        n.makeSound();
        n.sleep();

    }
}