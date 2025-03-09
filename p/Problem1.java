import java.util.Scanner;

public class Problem1{
     public static void main(String[] args) {
     Scanner s = new Scanner(System.in);
     System.out.println("enter obtained marks");
     int a= s.nextInt();
     int b= s.nextInt();
     int c= s.nextInt();
     int d= s.nextInt();
     int e= s.nextInt();
     int sum=a+b+c+d+e;
     System.out.println("Total obtained marks:"+ sum);
     System.out.println("enter max marks");
     int total_marks= s.nextInt(); 
     double persentage=((double)sum/total_marks)*100;
     System.out.println(persentage);
     System.out.println("obtained persentage:"+persentage+"%");
     s.close();
     }
}