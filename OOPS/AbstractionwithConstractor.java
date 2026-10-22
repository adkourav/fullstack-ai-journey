// now we are create a constroctor in the abstract class 

// create a abstract class 

abstract class Animal {
    // create a constructor
    Animal() {
        System.out.println("Animal constructor called ");
    }
}

// create a subclass of Animal class

class Horse extends Animal {
    // create a constructor of horse class
    Horse() {
        System.out.println("Horse constructor called ");
    }
}

// now we create a subclass of Horse super class

class Mustang extends Horse {
    // create a constructor
    Mustang() {
        System.out.println("Mustang constructor called ");
    }

    // create a methiod 
    void breed (){
        System.out.println("one of the famous breed of Horse ");
    }
}

public class AbstractionwithConstractor {
    public static void main(String args[]) {
        // create a object of Mustang class usingh of constructor
        // and its called every classes using of the hyrachi

        // Animal -> Horse -> Mustang

        Mustang myhorse = new Mustang();

        // method calling 
        myhorse.breed();

        // without calling any method its provide a output using the hyrachi

    }

    // the output is :-
    // Animal constructor called
    // Horse constructor called
    // Mustang constructor called

    // the last line is print in this last after the complete hyrachi 

    
    // one of the famous breed of Horse 
}
