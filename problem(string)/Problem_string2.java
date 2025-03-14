// to replace space with underscore in given string.

import java.util.Scanner;

public class Problem_string2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter your name");
        String name=sc.nextLine();
        System.out.println("required string");
        System.out.println(name.replace(" ", "_"));
        sc.close();
    }
}
