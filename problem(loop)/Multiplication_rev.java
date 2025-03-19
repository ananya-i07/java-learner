//print reverse multiplication of a number. 

import java.util.Scanner;

public class Multiplication_rev {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter the number");
        int n = sc.nextInt();
        int i=10;
        while(i>=1){
            int t=n*i;
            System.out.println(t);
            i--;
        }
        sc.close();
    }
}
