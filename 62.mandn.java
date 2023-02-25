import java.io.*;

import java.util.*;


class mandn{
    
public static void main(String []args){
        
Scanner s = new Scanner(System.in);

System.out.println("Enter the number of values : ");
       
 int x = s.nextInt();
        
int arr[] ;  
for(int i=1;i<=x;i++){
                      
arr[i]= s.nextInt();
 }      
int m,n,sum,diff,i,j,max,min;
              
Arrays.sort(arr);
        
System.out.println("Enter the value of m : ");
        
m = s.nextInt();
        
System.out.println("Enter the value of n : ");
        
n = s.nextInt();
        
max = arr[x-m];
        
min = arr[n-1];
        
sum = max + min;
        
diff = max - min;
        
System.out.println(m+"th maximum number is : "+max);
        
System.out.println(n+"th maximum number is : "+min);
       
 System.out.println("Sum of the two numbers is : "+sum);
        
System.out.println("Difference between the two numbers is : "+diff);
    
}
}