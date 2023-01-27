import java.util.Scanner;
class vowcon
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the string:");
String str=sc.nextLine();
str=str.toLowerCase();
String s1= str.replaceAll("[aeiou]","    " );
String s2=str.replaceAll("[bcdfghjklmnpqrstvxyz]","    ");
System.out.println("consonants in the string:"+s1);
System.out.println("vowels in the string:"+s2);
}
}