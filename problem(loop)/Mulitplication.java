//to print multiplication table of given number.

import java.util.Scanner;

public class Mulitplication {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter the number");
        int n = sc.nextInt();
        int i=1;
        while(i<=10){
            int t=n*i;
            System.out.println(t);
            i++;
        }
        sc.close();
        
    }
}
