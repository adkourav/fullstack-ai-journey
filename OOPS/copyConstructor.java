class Student {
    String name ; 
    int roll; 

    //parametrized constructor 
    Student(String name , int roll ){
        this.name = name ; 
        this.roll = roll;
    }

    //copy constructor 

    Student (Student s){
        this.name = s.name ;
        this.roll = s.roll; 
    }
}

public class copyConstructor {
    public static void main (String args[]){
        // create the first object 
        Student s1 = new Student("Adarsh" , 101);

        // copy data from s1 into a new object 

        Student s2 = new Student(s1);

        System.out.println("original object :-");
        System.out.println(s1.name);
        System.out.println(s1.roll);


        // print copy object 

        System.out.println("copied object :- ");
        System.out.println(s2.name);
        System.out.println(s2.roll);
    }
}
