// package OOPS;

public class gettersetter {
    public static void main(String args[]){
        pen p1 = new pen();

        p1.setcolor("blue");
        System.out.println(p1.getcolor());

        p1.settip(6);
        System.out.println(p1.gettip());
    }
    
}

class pen {
    private String color ; 
    private int tip ; 

    // getter for color 
    String getcolor (){
        return this.color;
    }
    // getter for tip 

    int gettip (){
        return this.tip;
    }

    //setter for color 

    void setcolor(String newcolor){
        this.color = newcolor;

    }

    // setter for tip 

    void settip (int tip ){
        this.tip = tip;
    }
}