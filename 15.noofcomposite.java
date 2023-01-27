import java.io.*;
import java.util.*;
import java.math.*;

public class count_all_prime_and_composite_entered_by_the_user{
    public static void main(String[] args){
        try{
            Scanner s = new Scanner(System.in);
            System.out.println("Enter the value of n : ");
            int n = s.nextInt();
            int num, temp, prime=0, comp=0;
            if(n<=0){
                System.out.println("Please enter a valid value : ");
            }
            else{
                for(int i=1; i<=n; i++){
                    System.out.println("Enter value "+i+" : ");
                    num = s.nextInt();
                    num = Math.abs(num);
                    temp = 0;
                    for(int j=2; j<num; j++){
                        if(num==2){
                            prime = prime + 1;
                        }
                        else if((num%j)==0){
                            temp = temp + 1;
                        }
                    }
                    if(temp==0){
                        prime = prime + 1;
                    }
                    else{
                        comp = comp + 1;
                    }
                }
                System.out.println("Number of composite values : "+comp);
            }
        }
        catch(Exception e){
            System.out.println("You have given a wrong input, please recheck");
        }
    }
}
