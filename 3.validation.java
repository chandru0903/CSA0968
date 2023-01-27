import java.io.*; 
import java.util.*; 
class validation{   
public static void main(String[] args) {     
Scanner sc = new Scanner(System.in); 
System.out.println("Enter the username:");
String s= sc.nextLine();
System.out.println("Re-enter the username:");
String x= sc.nextLine();
if(s.equals(x)){
System.out.println("Given username is valid...");
}
else{
System.out.println("Given username is Invalid...");
}
}}
