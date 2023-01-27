import java.io.*;
import java.util.*;
import java.math.*;

public class reverse_a_number_using_loop{
    public static void main(String[] args){
        try{
            Scanner s = new Scanner(System.in);
            System.out.println("Enter the number : ");
            int num = s.nextInt();
            int temp = num;
            System.out.println("Reversed number : ");
            if(num<0){
                System.out.print("-");
            }
            while(temp!=0){
                System.out.print(Math.abs(temp%10));
                temp = temp / 10;
            }
        }
        catch(Exception e){
            System.out.println("You have given a wrong input, please recheck");
        }
    }
}
