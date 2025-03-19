// sum of first n even numbers using while loop.
import java.util.Scanner;

public class Sum_Even_no {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter the number");
        int n = sc.nextInt();
        int i=1;
        int sum=0;
        while(i<=n){
            if(i%2==0){
            sum=sum+i;
            }
            i++;
        }
        System.out.println(sum);
        sc.close();
    }
}
