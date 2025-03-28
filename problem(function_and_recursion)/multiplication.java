import java.util.Scanner;

public class multiplication {
    static void multipl(int n){
      for(int i=1;i<11;i++) {
        System.out.printf("%d * %d = %d \n",n,i,n*i );
      }
    }
    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
        System.out.println("enter the number");
        int n= s.nextInt();
        multipl(n);
        s.close();
    }
}