import java.io.*;

import java.util.*;
class sumdig{
    
public static void main(String []args){
        
Scanner s = new Scanner(System.in);
        
System.out.println("Enter the value of n : ");
        
int n = s.nextInt();
        
System.out.println("Enter the "+n+" digit number : ");
       
 int num = s.nextInt();
        
int k = num;
        
int sum = 0;
        
int temp;
        
while(num>9){
           
 sum = 0;
           
 while(num>0){
              
  temp = num%10;
                
sum = sum + temp;
                
num = num/10;
            
}
            
if(sum>9){
                
num = sum;
            
}
        }
        
System.out.println("Sum of the digits in "+k+" is : "+sum);
   
 }
}