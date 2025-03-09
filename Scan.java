import java.util.Scanner;
public class Scan {
    public static void main(String[] args) {
        System.out.println("let's add two numbers");
        Scanner s = new Scanner(System.in);
        System.out.println("enter first number");
        int a= s.nextInt();
        System.out.println("enter second number");
        int b= s.nextInt();
        System.out.println("sum is:"+ (a+b));
        s.close();
    
    }
    
}
