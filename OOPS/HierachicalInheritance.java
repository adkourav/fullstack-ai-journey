//base class 
class Animal {
    String color;
    void eat(){
        System.out.println("Eating ");
    }

    void breath(){
        System.out.println("breathing");
    }
}

// drive classes 

class Fish extends Animal{
    void swim(){
        System.out.println("Swim in Water ");
    }
}

class Mammels extends Animal{
    void walk (){
        System.out.println("Walking ");
    }
}

class Bird extends Animal{
    void fly(){
        System.out.println("bird is flying ");
    }
}

public class HierachicalInheritance {
    public static void main(String args[]){
        Bird eagle = new Bird();
        eagle.eat();
        eagle.fly();
    }
    
}
