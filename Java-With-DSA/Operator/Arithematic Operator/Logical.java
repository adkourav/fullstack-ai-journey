

public class Logical {
    public static void main(String args[]){

        // && Logical AND {(T,T =T; T,F=F; F,T = F ; F,F = F)}
        System.out.println((3>2) && (5>0));

        // || Logical OR :- {(T,T = T ; T,F = T ; F,T = T ; F,F = F)}

        System.out.println((3<2) || (5>0));

        // ! Logical NOT :- {()}

        System.out.println(!(1<2));
        //output :- False 
        // if your condetion is true then its gives the output is false or your condetion is false then it gives the output true 

        // so basecally it is give the output opposite to your condetion 
    }
    
}
