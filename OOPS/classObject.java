// package OOPS;

class pen{
    String color ;
    int Tip ; 

    void setcolor(String newcolor){
        color = newcolor ;
    }

    void settip (int newtip ){
        Tip = newtip ;
    }
}
public class classObject {
    public static void main (String args[]){
        pen p1 = new pen(); // create a pen object that called p1 
        p1.setcolor("blue");
        System.out.println(p1.color);

        p1.settip(5);
        System.out.println(p1.Tip);
    }    
}
