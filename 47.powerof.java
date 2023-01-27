import java.io.*;

import java.util.*;
class powerof {
  public static void main(String[] args){
Scanner in=new Scanner(System.in);

System.out.println("Enter the number : ");
    int n = in.nextInt();
    int r = n;
        if(n>3){
    while(n%3==0)
    {
      n=n/3;
    }
    if (n==1)
      System.out.println(r + " is a Power of Three.");
    else
      System.out.println(r + " is not a Power of Three.");
  }
else{
         System.out.println("invalid input....");
}
}
}