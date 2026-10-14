// in java we have two methods to print the substring in java 
// 1 :- user create a function for the substring 
//2:- java inbuild function for the print substring 

// // method one :- inbuild function 

//public class Substring{
    
//     public static void main (String args[]){

//         String str = "helloworld" ;

//         // String substring = "";

//         System.out.println("substring :- " + str.substring(0,5));
//     }
// }



// method 2 :- user create function 

// public class Substring{

//     public static String substring(String str, int si , int ei){

//         String substr = "";

//         // for loop 

//         for (int i = si ; i < ei ; i++){

//             substr += str.charAt(i);
//         }
//         return substr;
//     }

//     // main function 

//     public static void main (String args[]){
//         String str = "HelloWorld";

//         //call the function 

//         System.out.println(substring(str, 3, 5));
//     }
// }