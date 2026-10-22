//bace class 
class Animal{
    //properrtys 
    String color;
    //function 
    void eat(){
        System.out.println("Eating");
    }
}
// 1st Drive class 

class Mammel extends Animal{
    // properties 
    int legs ;
}

//2nd Drived class 

class Dog extends Mammel{
    String breed;
} 


// main function / class
public class MultiLevelInheritance {
    public static void main (String args[]){
        // class / function calls 

        Dog dobby = new Dog();

        dobby.eat();

        dobby.legs = 4 ;
        System.out.println(dobby.legs);

        dobby.breed = "Dasi";
        System.out.println(dobby.breed);
    }
}
