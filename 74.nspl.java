import java.io.*;
import java.util.*;

class noofspecialchars{
    public static void main(String[] args)
    {   Scanner s = new Scanner(System.in);
        int count = 0;
        System.out.println("Enter the string : ");
        String str = s.nextLine();
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))&&!Character.isLetter(str.charAt(i))&&!Character.isWhitespace(str.charAt(i))) {
                count++;
            }
        }
        if (count == 0){
            System.out.println(
                "No Special Characters found.");
            }
        else{
            System.out.println("No of special characters : "+count);
        }
    }
}