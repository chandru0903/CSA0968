import java.io.*;
import java.util.*;
class BoxDemo {
  public static void main(String args[]) {
Scanner in = new Scanner(System.in);
System.out.println("Enter the Width : ");
int width = in.nextInt();
System.out.println("Enter the Heigth : ");
int height = in.nextInt();
System.out.println("Enter the Depth : ");
int depth = in.nextInt();
    Box mybox1 = new Box(width, height ,  depth );
    double vol;
    vol = mybox1.volume();
    System.out.println("Volume is " + vol);
  }
}
class Box {
  double width;
  double height;
  double depth;
  Box(double w, double h, double d) {
    width = w;
    height = h;
    depth = d;
  }
  double volume() {
    return width * height * depth;
  }
}