abstract class Person{
    Person(){
        System.out.println("Person constructor called");
    }
    abstract void sayHello();
}
class Student extends Person{
    Student(){
        System.out.println("Student constructor called");
    }
    void sayHello(){
        System.out.println("Hello from Student");
    }
}
public class OOps4{
    public static void main(String[] args){
        Student s = new Student();
        s.sayHello();
    }
}