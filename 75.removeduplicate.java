import java.io.*;
import java.util.*;

public class removeduplicatefromarray{
    public static void main(String []args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of values : ");
        int n = s.nextInt();
        int i,j,temp = 0;
        int arr[] = new int[n];
        for(i=0;i<n;i++){
            System.out.println("Enter value "+(i+1)+" : ");
            arr[i] = s.nextInt();
        }
        for(i=0;i<n;i++){
            temp = 0;
            for(j=0;j<n;j++){
                if(arr[i]==arr[j]){
                    temp = temp + 1;
                }
            }
            if(temp<=1){
                System.out.print(arr[i]+", ");
            }
        }
    }
}