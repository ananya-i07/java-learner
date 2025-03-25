//to check if given number is present in array or not.
import java.util.Scanner;

public class num_present
{
    public static void main(String[] args) 
    {
        boolean isInArray=false;
        float[] arr={2,5,7,8,10,18,11};
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter the integer number to search:");
        int num=sc.nextInt();
        for(float element:arr )
          {
            if(num==element)
            {
             isInArray=true;
             break;
            }
          }
        if(isInArray){
           System.out.println("number is present in given array");
           }
        else{
           System.out.println("number is not present in array");
           }
        sc.close(); 
    }
} 