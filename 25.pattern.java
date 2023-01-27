import java.io.*;
import java.util.*;

public class pattern2{
    public static void main(String []args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = s.nextInt();
        int i,j;
        for(i=1;i<=n;i++){
            for(j=0;j<i;j++){
                System.out.print(i);
            }
            System.out.println("");
        }
        for(i=(n-1);i>=1;i--){
            for(j=0;j<i;j++){
                System.out.print(i);
            }
            System.out.println("");
        }
    }
}