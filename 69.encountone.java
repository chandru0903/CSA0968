import java.io.*;
import java.util.*;
class encountone{
public static void main(String[] args) {
try{
Scanner s=new Scanner(System.in);
int v2=0;
double i1=0,i2=0,u=0,u1=0,u2=1;
int l=-1;
double as,ab;
while(v2!=l)
{
System.out.println("Enter an number");
v2=s.nextInt();
if(v2>=0)
{
u1=u1+v2;
i1=i1+1;
}
else
{
u2=u2+v2;
i2=i2+1;
}
}
as=u2/i2;
ab=u1/i1;
System.out.println("Total average of negative numbers:"+as);
System.out.println("Total average of positve numbers:"+ab);
}
catch(Exception e)
{
System.out.println("Invalid");
}
}
}