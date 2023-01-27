import java.io.*;
import java.util.*;
 class lcmgcd{
public static int gcd(int a[], int no){
int gcd = 0;
for(int i=1; i<=a[0]; i++){
 int temp = 0;
for(int j=0; j<no; j++){
 if((a[j]%i)!=0){
 temp = temp + 1;
}
 }
 if(temp==0){
 gcd = i;
}
 }
 return gcd;
}
 public static int lcm(int a[], int no, int b[]){
 int lcm=1;
 int temp=0;
 while(!Arrays.equals(a,b)){
 for(int i=1; i<=a[no-1]; i++){
 temp = 0;
 for(int j=0; j<no; j++){
if((a[j]%i)==0){
 a[j] = a[j]/i;
temp = temp + 1;
 }
else{
 a[j] = a[j];
 }
 }
if(temp!=0){
 lcm = lcm*i;
 }
 Arrays.sort(a);
}
 }
 return lcm;
}
 public static void main(String[] args){
 try{
Scanner s = new Scanner(System.in);
  System.out.println("Enter the no of values to input : ");
 int n = s.nextInt();
if(n<=0){
 System.out.println("Please enter a valid number : ");
}
else{
int[] arr = new int[n];
 int[] arr2 = new int[n];

 for(int i=0; i<n; i++){
System.out.println("Enter value "+(i+1)+" : ");
arr[i] = s.nextInt();
  }
for(int i=0; i<n; i++){
 arr2[i] = 1;
 }

Arrays.sort(arr);
System.out.println("GCD of the given values is : "+gcd(arr, n));
System.out.println("LCM of the given values is : "+lcm(arr, n, arr2));
 }
 }

catch(Exception e){
System.out.println("You have given a wrong input, please recheck");
 }
}
}