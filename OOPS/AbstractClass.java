// abstract class 
abstract class Animal{
    // non-Abstract method 
    void eat(){
        System.out.println("Animal eats");
    }

    //Abstract method  
    abstract void walk();
}

// *** if we are create a abstract method in abstract class  ***
// *** now we extracs this class or create a subclasses so the walk / abstract method is nessecory to implement in every extended subclass ***

// subclass 
class Horse extends Animal{
    void walk(){
        System.out.println("walk on 4 legs ");
    }
}

// another subclass 
class Chicken extends Animal{
    // abstract method call
    void walk(){
        System.out.println("walk on 2 legs ");
    }
} 

// main class call all the methods 
public class AbstractClass{
    public static void main (String args[]){
        Horse h = new Horse();
        h.eat();
        h.walk();

        // create a object for chicken class 

        Chicken c = new Chicken();
        c.eat();
        c.walk();
    }

}