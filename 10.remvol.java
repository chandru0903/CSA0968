import java.util.Scanner;
class remvow
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the string:");
String str=sc.nextLine();
str=str.toLowerCase();
String s1= str.replaceAll("[aeiou]","" );
System.out.println("consonants in the string:"+s1);
}
}