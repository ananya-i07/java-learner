// to find sum of first n natural numbers with recursion.
import java.util.Scanner;

public class sum_recursion {
    static int sum(int n){
        if(n==1){
            return 1;
        }
        return n + sum(n-1);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("please enter value of n:");
        int n= s.nextInt();
        int c = sum(n);
        System.out.printf(" sum of first %d natural numbers: %d",n,c);
        s.close();
    }
}
