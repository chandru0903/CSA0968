import java.io.*;

import java.util.*;


class prmcom{
    
public static void main(String []args){
        
Scanner s = new Scanner(System.in);
        
System.out.println("Enter the number of values : ");
       
 int n = s.nextInt();
        
int i,j,temp=0,p=0,c=0,temp1=0;
        
for(i=1;i<=n;i++){
           
 temp1 = 0;
            
temp = 0;
            
System.out.println("Enter number "+i+" : ");
            
temp = s.nextInt();
            
if(temp==1){
               
 p = p - 1;
           
 }
            
if(temp==2){
                
p = p + 1;
           
 }
            
else{
                
for(j=2;j<temp;j++){
                  
  if((temp%j)==0){
                        
temp1 = temp1 + 1;
                   
 }}
                
if(temp1==0){
                    
p = p + 1;
                
}
               
 else{
                    
c = c + 1;
                
}}
}
        
System.out.println("Number of prime values : "+p);
        
System.out.println("Number of composite values : "+c);
    
}
}
                        
                