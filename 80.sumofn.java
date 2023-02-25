import java.io.*;
import java.util.*;
class GFG {
    public static void main(String args[])
        throws ArrayIndexOutOfBoundsException{
        Scanner s = new Scanner(System.in);
System.out.println("Enter the limit : ");
int n = s.nextInt();
        try {            

int x= 0;
            for (int i = 0; i <= n; i++) {
                x = x + i ;
            }
System.out.println("Sum of given numbers : " +x);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(
                "Array Bounds Exceeded...\nTry Again");
        }
    }
}