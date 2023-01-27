import java.io.*;
import java.util.*;

public class multiplication{
public static void main(String arg[]){
Scanner s= new Scanner(System.in);
System.out.println("enter the value of m:");
int m = s.nextInt();
System.out.println("enter the value of n:");
int n = s.nextInt();
if(n>0){
for(int i=0;i<=n;i++){
System.out.println(i+"x"+m+"="+ m*i );
}
}
else{
System.out.println("Enter the positive number for multiplication...");
}
}
}
