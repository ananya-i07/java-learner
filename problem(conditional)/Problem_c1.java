import java.util.Scanner;
// if overall marks is greater than 48 and each markes is greater than 33 then studen is pass otherwise no.
public class Problem_c1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("please enter you marks of 3 subjects");
        byte m1=sc.nextByte();
        byte m2=sc.nextByte();
        byte m3=sc.nextByte();
        float avg=(m1+m2+m3)/3.0f;
        if(avg>48 && m1>33 && m2>33 && m3>33){
        System.out.println("you have pass successfully");
        }
        else{
        System.out.println("you are not pass");
        }
        sc.close();
    }
    
}
