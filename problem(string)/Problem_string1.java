// convert user input string tpo lower case.
import java.util.Scanner;
public class Problem_string1 {
    public static void main(String[]arg){
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter your name");
        String name=sc.nextLine();
        System.out.println("name in lower case");
        System.out.println(name.toLowerCase());
        sc.close();

    }

    
}
