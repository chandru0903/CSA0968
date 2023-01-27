import java.io.*;
import java.util.*;

class GFG {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
 int count = 0;
String s= sc.nextLine();
 for (int i = 0; i < s.length(); i++) {
 if (!Character.isDigit(s.charAt(i))&& !Character.isLetter(s.charAt(i)) && !Character.isWhitespace(s.charAt(i))) {
System.out.println(s.charAt(i));
  count++;
 }
  }
 if (count == 0)
System.out.println( "No Special Characters found.");
else
System.out.println(  "String has Special Characters\n" + count + "  "+ "Special Characters found.");
    }
}