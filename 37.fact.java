import java.io.*;
import java.util.*;
class factorial{
public static void main(String arg[]){
Scanner s= new Scanner(System.in);
System.out.println("Enter the number:");
        try{
            int n=s.nextInt();
            if(n<=0){
                System.out.println("Invalid Value");
            }
            else{    
                int i, fact=1;
                for(i=n;i>0;i--){
                    fact=fact*i;
                }
                System.out.println("Factorial of "+n+" is : "+fact);
                }
           }
            catch(Exception e){
                System.out.println("Invalid Value");
            }
    }
 }