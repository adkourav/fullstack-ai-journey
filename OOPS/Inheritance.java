 //base class
 class animal {
    String color;

    // function 
    void eats(){
        System.out.println("eating ");
    }
    // another function 
    void breath(){
        System.out.println("Breathing ");
    }
}
// drive class / subclass 
// "extends ":- it is use to inherit the properties of base class 

class Fish extends animal {
    int fins ; 
    void swim (){
        System.out.println("Swims in water ");
    }
}


// main funcation call or main class 

public class Inheritance{
    public static void main (String args[]){
        Fish Shark = new Fish();
        Shark.eats();
        Shark.breath();
        Shark.swim(); 
    }
}

