import java.io.*;

import java.util.*;
class sq{
	
public static void main(String args[]){

Scanner in=new Scanner(System.in);

System.out.println("Enter the decimal number : ");
float a= in.nextFloat();
float s = a*a;
float c = a*a*a;
System.out.println("Enter the square root of decimal number : " +s);
System.out.println("Enter the cube root of decimal number : " +c);
}
}