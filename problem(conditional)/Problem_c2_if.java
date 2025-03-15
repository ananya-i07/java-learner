import java.util.Scanner;
/*interest paid (only by if):
 * below 2.5l-> no tax
 * 2.5l-5.0l->5%
 * 5.0l-10l-> 20%
 * above 10l-> 30%
 */
public class Problem_c2_if {
    public static void main(String[] args) {
        float tax=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter your salary in digits:");
        int salary=sc.nextInt();
        if( salary>1000000){
        tax=(salary-1000000)*0.3f;
        salary=1000000;
        }
        if( salary>500000){
            tax=tax+(salary-500000)*0.2f;
            salary=500000;
        }
        if( salary>250000){
            tax=tax+(salary-250000)*0.05f;
            System.out.println("tax to be paid:"+tax);
        }
        else{
        System.out.println("you do not have to pay tax");
        }
        sc.close();
    }
}