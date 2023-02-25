import java.io.*;

import java.util.*;


class dectooct{
    
public static void main(String []args){
        
Scanner s = new Scanner(System.in);
        
System.out.println("Enter the decimal number : ");
        
int dec = s.nextInt();
        
System.out.println("Binary value of "+dec+" : ");
        System.out.println(Integer.toBinaryString(dec));
        System.out.println("Octal value of "+dec+" : ");
        System.out.println(Integer.toOctalString(dec));  
    
}
}
            