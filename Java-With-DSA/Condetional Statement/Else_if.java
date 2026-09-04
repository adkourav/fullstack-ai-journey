

public class Else_if {

    public static void main (String args[]){
        int age = 12;

        if(age >= 18 ){
            System.out.println("Adult");

        }
        else if(age >= 13 && age <= 18){
            System.out.println("teenager");
        }
        else{
            System.out.println("Child");
        }
        
    }
    
}
