import java.io.*;
import java.util.*;
class nperfectnumber{
    public static void main(String[] args){
        try{
            Scanner s = new Scanner(System.in);
            System.out.println("Enter the value of n : ");
            int n = s.nextInt();
            int temp = 0,sum = 0,i,k,j=6;
            for(i=1;i<=n;i++){
                while(j>0){
                    temp = 0;
                    sum = 0;
                    for(k=1;k<j;k++){
                        if((j%k)==0){
                            sum=sum+k;
                        }
                    }
                    if(sum==j){
                        temp=1;
                    }
                    if(temp==1){
                        System.out.print(j+",");
                        j=j+1;
                        break;
                    }
                    else{
                        j=j+1;
                        continue;
                    }
                }
            }
        }
        catch(Exception e){
           System.out.println("Invalid value");
        }
    }
}




