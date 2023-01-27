import java.io.*;
import java.util.*;

public class vote{
    public static void main(String []args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your age : ");
        int age = s.nextInt();
        if(age>=18){
            System.out.println("You are eligible to vote");
        }
        else{
            age = 18 - age;
            System.out.println("You are eligible to vote after : "+age+" years");
        }
    }
}