import java.io.*;
import java.util.*;
class alphaord{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
System.out.println("Enter the no of times:");
int x = s.nextInt();
String[] b=new String[x];
char o;
String temp;
int i,j;
System.out.println("Enter the word of range "+x+":");
for(i=0;i<x;i++){
b[i]=s.next();
}
for(i=0;i<x;i++){
for(j=i;j<x;j++){
if(b[i].charAt(0)>b[j].charAt(0)){
temp=b[i];
b[i]=b[j];
b[j]=temp;
}

}
}
System.out.print("order(A/D)");
o=s.next().charAt(0);
if(o=='A'){
for(i=0;i<x;i++){
System.out.println(b[i]);
}
}
else if(o=='D'){
for(i=x;i>0;i--){
System.out.println(b[i]);
}
}
else{
System.out.println("Enter the order A or D");
}
}
}