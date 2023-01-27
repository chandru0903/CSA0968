import java.io.*;

import java.util.*;
class leap {
	
public static void main(String args[]){

Scanner in=new Scanner(System.in);

System.out.println("Enter the date: ");
int d=in.nextInt();int m=in.nextInt();int y=in.nextInt();
System.out.println(d+ "/"+m+"/"+y);

if(y%4==0||y%400==0||y%100==0){
System.out.println("Given year is a leap year .");
}
else{
System.out.println("Given year is not a leap year .");
}
}}
