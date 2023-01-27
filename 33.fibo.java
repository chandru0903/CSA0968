import java.io.*;

import java.util.*;


class fibo{
   
 public static void main(String []args){
        
Scanner s = new Scanner(System.in);
       
 System.out.println("Enter the range : ");
        
int r = s.nextInt();
        
int n1 = 0;
        
int n2 = 1;
       
 int n3 = n1+n2;
        
int temp = 0;
        
System.out.print(n1+", ");
       
 System.out.print(n2+", ");
        
int i;
       
 for(i=0;i<(r-2);i++){
            
System.out.print(n3+", ");
            
temp = n3;
           
 n1 = n2;
            
n2 = n3;
            
n3 = n1 + temp;
        
}
    
}
}