import java.io.*;
import java.util.*;
class fr{  
    public static void main(String[] args) {  
        Scanner in=new Scanner(System.in);
        int r;
        System.out.println("Enter a number of elements:");
        r=in.nextInt();
        int [] arr = new int [r];
        for(int k=0;k<r;k++){
            System.out.print("Enter number:");
            arr[k]=in.nextInt();
        }
        
        int [] fr = new int [arr.length];  
        int visited = -1;  
        for(int i = 0; i < arr.length; i++){  
            int count = 1;  
            for(int j = i+1; j < arr.length; j++){  
                if(arr[i] == arr[j]){  
                    count++;  
                   
                    fr[j] = visited;  
                }  
            }  
            if(fr[i] != visited)  
                fr[i] = count;  
        }  
  
 
        System.out.println("---------------------------------------");  
        System.out.println(" Element | Frequency");  
        System.out.println("---------------------------------------");  
        for(int i = 0; i < fr.length; i++){  
            if(fr[i] != visited)  
                System.out.println("    " + arr[i] + "    |    " + fr[i]);  
        }  
        System.out.println("----------------------------------------");  
    }}