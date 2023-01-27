import java.io.*;
import java.util.*;

public class alphabetical{
    public static void main(String []args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str = s.nextLine();
        int l = str.length();
        char arc[] = new char[l];
        int i, j,temp, temp1;
        for(i=0;i<l;i++){
            arc[i] = str.charAt(i);
        }
        Arrays.sort(arc);
        for(i=(l-1);i>=0;i--){
            System.out.print(arc[i]);
        }
    }
}
    