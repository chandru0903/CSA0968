import java.util.*;
class pyramid{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
int n,i,j,k;
System.out.println("Enter the rows : ");
try{
n=s.nextInt();
if(n>0){
for(i=0;i<n;i++){
for(k=n;k>i;k--){
System.out.print(" ");
}
for(j=0;j<=i;j++){
System.out.print("* ");
}
System.out.println();
}
}
else{
System.out.println("Enter the positive numbers");
}
}
catch(InputMismatchException e){
System.out.println("Enter the integer value in rows");
}
}
}