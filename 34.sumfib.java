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
               
int i;
     
int n4=1; 
r=r*2; 
 for(i=0;i<(r-2);i++){
            
            
temp = n3;
           
 n1 = n2;
            
n2 = n3;
            
n3 = n1 + temp;
if(i%2!=0){
n4=n4+n3;  }     
}
    
 System.out.print("sum of fibonacci serise:" +n4);
 
}
}