import java.util.Arrays;

public class sortString {
    public static void main(String args[]) {

        String str = "bcda";

        // convert string to array

        char[] arr = str.toCharArray();

        // sort string

        Arrays.sort(arr);

        // conver array to string
        String sorted = new String(arr);

        System.out.println("original string :- " + str);

        System.out.println("sorted array :- " + sorted);
    }
}
