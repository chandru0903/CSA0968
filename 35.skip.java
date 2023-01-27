import java.io.*;

import java.util.*;
class skip{
	
public static void main(String args[]){

Scanner in=new Scanner(System.in);

System.out.println("Enter the number M : ");
int m = in.nextInt();
System.out.println("Enter the number N : ");
int n = in.nextInt();
System.out.println("Enter the numbers to be skip(K): ");
int k = in.nextInt();
k++;
for(int i=m;i<=n;i = i+k){
System.out.println( i );
}
System.out.println( );
}}