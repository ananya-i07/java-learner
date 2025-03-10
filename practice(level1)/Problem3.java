import java.util.Scanner;
//kilometer to miles.
public class Problem3 {
     public static void main(String[] args) {
     Scanner s = new Scanner(System.in);
     System.out.println("kilometer:");
     float a= s.nextInt();
     System.out.println("mile:");
     System.out.println(a*0.62137119);
     s.close();
     }
}
