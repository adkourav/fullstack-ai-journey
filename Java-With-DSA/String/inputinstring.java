import java.util.*;

public class inputinstring {
    public static void main(String args[]){
        // string is IMMUTABLE be can not change abter creation 

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string :- ");
        String name ; 

        name = sc.nextLine();

        System.out.println(name);
        sc.close();
    }

}
