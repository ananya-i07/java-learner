import java.util.Scanner;
// print some "escape sting characters". 
//eg: \",\',\\,\n,\t etc.
public class Problem_string3 {
    public static void main(String[] args) {

    Scanner sc=new Scanner(System.in);
    System.out.println("Please enter your name");
    String x=sc.nextLine();
    System.out.println("required string:");
    String letter="\"Dear <|name|>, Thanks a lot.\"";
    System.out.println(letter.replace("name", x));
    sc.close();

    }
}
