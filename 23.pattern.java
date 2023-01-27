import java .util.*;
public class pattern{
    public static void main (String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the range: ");
        int a = s.nextInt();
        for (int i=0; i<a+1; i++){
            
            for(int j = 0; j<i; j++){
                System.out.print(i);
            }
            System.out.println("");
        }
    }
}