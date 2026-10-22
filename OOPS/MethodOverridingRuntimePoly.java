// Method overriding is the example of Runtime polymorphism 
// paarent and child class contain the same function with a different defination is called method/function overriding 

class Animal{
    void eat(){
        System.out.println("eats Everything ");
    }
}

class deer extends Animal{
    @Override
    void eat(){
        System.out.println("eats gress");
    }
}

public class MethodOverridingRuntimePoly {
    public static void main (String args[]){
        deer d = new deer();
        d.eat();
    }
}
