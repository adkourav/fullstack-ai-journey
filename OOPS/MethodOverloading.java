// method Overloading is the example of compile time polymorphism 

// when multiple method have same name but diffrent perameters (types , counts ) is called method overloading 


class calculator {
    int sum(int a , int b){
        return a+b;
    }

    float sum (float a , float b){
        return a+b;
    }

    int sum (int a , int b , int c){
        return a + b + c ;
    }
}
public class MethodOverloading{
    public static void main(String args[]){
        calculator c = new calculator();

        System.out.println(c.sum(10 , 20));
        System.out.println(c.sum((float) 10.4 , (float)22.5));
        System.out.println(c.sum(10 , 20 , 30));
    }
}
