public class CompressionString{

    public static String Compress(String str){

        String newstr = " ";

        for(int i = 0 ; i < str.length(); i++){
            
            // for add count in your string we use two way strint that why we write :- Integer
            Integer count = 1;

            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            newstr += str.charAt(i);
            if(count > 1){
                newstr += count.toString();
            }
        }
        return newstr;
    }

    public static void main (String args[]){
        String str = "aaabbccd";

        System.out.println(Compress(str));
    }
}