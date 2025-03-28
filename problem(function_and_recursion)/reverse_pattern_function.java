/*   *
     **
     ***
     **** ..........so on.
 */
import java.util.Scanner;
public class reverse_pattern_function {
         static void pattern(int n){
            for(int i=n;i<0;i--){
                for(int j=0;j<n;j++){
                System.out.print("*");
                }
                System.out.println();
                
            }
         }
    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
        System.out.println("enter the no of lines to be printed:");
        int n= s.nextInt();
        pattern(n);
        s.close();
    }
}
