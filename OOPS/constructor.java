class student {
    String name ; 
    int roll ; 

    // constructor 
    student (){
        System.out.println("constructoe is calling ");
    }
}

public class constructor{
    public static void main(String args[]){
        student s1 = new student ();
        System.out.println(s1);
    }
}