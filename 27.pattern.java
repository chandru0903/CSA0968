public class ReversePyramidPattern  
{  
public static void main(String[] args)  
{  
Scanner sc=new Scanner(System.in);
System.out.println("enter the symbol:");
String rows= sc.nextLine();  
for (int i= 0; i<= rows-1; i++)  
{  
for (int j=0; j<=i; j++)  
{  
System.out.print(" ");  
}  
for (int k=0; k<=rows-1-i; k++)  
{  
System.out.print("*" + " ");  
}  
System.out.println();  
}  
}  
}