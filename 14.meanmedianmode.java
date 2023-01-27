import java.io.*;
import java.util.*;
public class meanarray{
    public static void main(String[] args){
        int arr[] = {16,18,27,16,23,21,19};
        int mean, median, mode=0, i, j, sum=0, n=0, k=0, l=arr.length;
        Arrays.sort(arr);
         
        for(i=0;i<l;i++){
            sum = sum+arr[i];
            
        }
        if(l%2==0){
            median=(arr[l/2]+arr[l/2+1])/2;
        }
        else{
            median=(arr[3]);
        }
        mean = sum/l;
        for(i=0;i<l;i++){
            n=0;
            for(j=0;j<l;j++){
                if(arr[i]==arr[j]){
                    n=n+1;
                }
            }
            if(n>k){
                k=n;
                mode=arr[i];
            }
        }
     System.out.println("Mean : "+mean);
     System.out.println("Median : "+median);
     System.out.println("Mode : "+mode);
    }
}

    
