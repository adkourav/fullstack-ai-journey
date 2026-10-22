// there are mainly 3 type of constructor 
// 1 . Non-perametrized , 2. peramertized , 3. copy constructor 

class student {
    String name ; 
    int roll ; 

    // Non-perametrized constructor 
    student (){
        System.out.println("Non-perametrized constructor is calling ");
    }

    // perametrized constructor 

    student(String name ){
        this.name = name ; 
    }
    student(int roll){
        this.roll = roll ;
    }
}

public class TypeofConstructor{
    public static void main (String args[]){
        // create a object of this class

        student s1 = new student();
        System.out.println(s1);
    
    // call perametrized constructor 

    student s2 = new student("adarsh");
    System.out.println(s2.name);
    student s3 = new student(123);
    System.out.println(s3.roll);
    }    
}