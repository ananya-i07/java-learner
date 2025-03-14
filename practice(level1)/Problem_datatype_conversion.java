import java.util.Scanner;
/*take input grade:
 * encrypt it by adding 8
 * and give orignal result:
 * by decrypt it
 */

public class Problem_datatype_conversion {

public static void main(String[] args) {
     Scanner s = new Scanner(System.in);
     System.out.println("enter your grade");
     char grade=s.next().charAt(0);
     grade=(char)(grade+8);
     //encrypt it by adding 8.
     System.out.println(grade);
     System.out.println("orignal grade:");
     grade=(char)(grade-8);
     System.out.println((char)grade);
     s.close();

}
}
