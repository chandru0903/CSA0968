import java.io.*;
import java.util.*;
class box{
double w;
double h;
double d;
  Box(double w, double h, double d) {
    width = w;
    height = h;
    depth = d;
  }
double volume(){
return w * h * d;
}
}
class volume{
public static void main(String args[]){
Scanner in = new Scanner(System.in);
System.out.println("Enter the Width : ");
int w = in.nextInt();
System.out.println("Enter the Heigth : ");
int h = in.nextInt();
System.out.println("Enter the Depth : ");
int d = in.nextInt();
  Box mybox1 = new Box(10, 20, 15);
double vol;
vol = mybox1.volume();
System.out.println("volume of box is : "+vol);
}
}