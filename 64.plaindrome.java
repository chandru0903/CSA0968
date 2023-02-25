import java.util.*;
class palindrome{
    public static void main (String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String sen = s.nextLine();
        String a = sen;
        int l = sen.length();
        char c [] = sen.toCharArray();
        String sent = "";
        for (int i=l-1; i>=0; i--){
            sent = sent+c[i];
        }
        if(a.equals(sent)){
            System.out.println("It is a palindrome");
        }
        else{
            System.out.println("Its not a palindrome");
        }
    }
}