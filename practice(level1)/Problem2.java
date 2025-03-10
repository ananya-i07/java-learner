import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args){
        Scanner name =new Scanner(System.in);
        System.out.println("What is your name?");
        String user_name = name.nextLine();
        System.out.println("Hello " + user_name + " have a good day !");
        name.close();
    }
 
    
}
