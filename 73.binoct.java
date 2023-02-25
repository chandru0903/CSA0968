import java.util.Scanner;
class conversion {
 public static void main(String[] args) {
 Scanner in = new Scanner(System.in);
 System.out.println("Enter the binary value : ");
 int n = in.nextInt();
        int num = n;
        int d = 0;
        int b = 1;
        int temp = num;
        while (temp > 0) {
            int l = temp % 10;
            temp = temp / 10;
 
            d += l * b;
 
            b = b * 2;
        }

 //convert decimal to octal
 System.out.print("DECIMAL IS ");
 System.out.println(+d);
 System.out.print("OCTAL IS ");
 System.out.println(Integer.toOctalString(d));
 }
}