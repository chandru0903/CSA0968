import java.util.Scanner;
class grade {
 public static void main(String[] args) {
try{
 Scanner in = new Scanner(System.in);
 System.out.println("Enter the marks in python: ");
 int m1 = in.nextInt();
 System.out.println("Enter the marks in c programming: ");
 int m2 = in.nextInt();
 System.out.println("Enter the marks in Mathematics: ");
 int m3 = in.nextInt();
 System.out.println("Enter the marks in Physics: "); 
 int m4 = in.nextInt();
 int tot = m1+m2+m3+m4;
 float avg = tot/4;
 System.out.println("Total : " +tot);
 System.out.println("Aggregate : " +avg);

if(avg>= 75){
System.out.println("Grade is Distinction.");}
else if(avg>=60 && avg<75){
System.out.println("Grade is First Division. ");}
else if(avg>=50 && avg<60){
System.out.println("Grade is Second Division. ");}
else if(avg>=40 && avg<50){
System.out.println("Grade is Third Division. ");}
else{
System.out.println("Grade is Fail.");}
 }
 
catch(Exception e){
System.out.println("Invaild input....");}

}
}