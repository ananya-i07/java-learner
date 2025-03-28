/* *****
   ****
   ***
   **
   *
 */
import java.util.Scanner;
public class pattern_function {
         static void pattern(int n){
            for(int i=0;i<n;i++){
                for(int j=0;j<=i;j++){
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

