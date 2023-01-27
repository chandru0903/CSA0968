import java.io.*;

import java.util.*;

import java.math.*;


public class armstrong{
    
public static void main(String []args){
        
Scanner s = new Scanner(System.in);
        
System.out.println("Enter the number : ");
        
int n = s.nextInt();
        
int no = n;
        
String str = String.format("%d",n);
        
int l = str.length();
       
 int temp=0, num=0, i, temp1=0;
        
while(n!=0){
            
temp = n%10;
           
 temp1 = temp;
            
for(i=1;i<l;i++){
               
temp = temp*temp1;
            
}
            
num = num + temp;
            
n = n/10;
        
}
        
if(no==num){
            
System.out.println(no+" is an armstrong number");
       
 }
        
else{
            
System.out.println(no+" is not an armstrong number");
       
 }
    }
}
            
            