import java.io.*;

import java.util.*;
class factor{
	
public static void main(String args[]){

Scanner in=new Scanner(System.in);

System.out.println("Enter the number : ");
int r=0;
int a = in.nextInt();
for(int i =1;i<=a;i++){
if(a%i==0){
r++;
}
}
System.out.println("no of factorize: " +r);
}
}
