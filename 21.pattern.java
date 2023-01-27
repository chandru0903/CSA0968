import java.util.*;
class pat{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
char c;
int n,i,j;
System.out.print("Enter the symbol to be print :");
c=s.next().charAt(0);
System.out.print("Enter the no.of lines should be print : ");
try{
n=s.nextInt();
for(i=0;i<n;i++){
for(j=0;j<=i;j++){
System.out.print(c);
}
System.out.println();
}
}
catch(InputMismatchException e){
System.out.println("Enter the integer type data only");
}
}
}
