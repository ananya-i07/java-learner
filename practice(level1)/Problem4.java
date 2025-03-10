import java.util.Scanner;
// to check if enter no. is integer
public class Problem4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a valid integer"); 
        System.out.println(s.hasNextInt());
        s.close();
    }
    
}
