import java.util.*;

import java.io.*;

class si{
	
public static void main(String args[]){

Scanner in=new Scanner(System.in);
			
int p,n=0,r=0,s;
		
char c='\0';
			
System.out.println("Principal:");
		
p=in.nextInt();
		
if(p>0){
		
System.out.println("Years:");
		
n=in.nextInt();
		
in.nextLine();
		
}
		
else{
			
System.out.println("Invalid Principal");
		
}
		
if(n>0){
		
		
System.out.println("Senior citizen(Y/N):");
		
c=in.next().charAt(0);}
		
else{
			
System.out.println("Invalid Years");
		
}
		
if (c=='y'||c=='Y'||c=='n'||c=='N'){
			
if(c=='Y'||c=='y'){
				
r=12;
				
s=(p*n*r)/100;
				
System.out.println("Interest:"+s);
				
}
else if(c=='n'||c=='N'){
				
r=10;
				
s=(p*n*r)/100;
				
System.out.println("Interest:"+s);
			
}
		
}
else{
System.out.println("Invalid value...");
					
}
}}
