import java.util.*; 
class reverse {   
public static void main(String[] args) {     
Scanner sc = new Scanner(System.in);       
String str= sc.nextLine();        
String reversedString = "";   
for(int i = str.length()-1; i>=0; i--){       
reversedString = reversedString + str.charAt(i);     
}          
System.out.println(reversedString);   
}
} 