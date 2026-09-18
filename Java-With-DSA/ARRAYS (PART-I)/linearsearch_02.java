// create a string menu and find the item 


public class linearsearch_02 {
    public static int linearsearch(String menu[], String key ){
        // find the key value 

        for(int  i = 0; i < menu.length; i++){
            if (menu[i] == key){
                return i;
            }
        }
        return -1 ;
    }

    // main function 

    public static void main (String args[]){
        String menu[] = {"samosa", "dosa" , "idli" , "momo" , "kachori "};
        
        String key = "dosa";

        int index = linearsearch(menu, key);

        if(index == -1){
            System.out.println("noy found ");
        }
        else {
            System.out.println("key is at index:-  " + index);
        }

    }
    
}
