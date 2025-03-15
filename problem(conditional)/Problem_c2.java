import java.util.Scanner;
/*interest paid:
 * below 2.5l-> no tax
 * 2.5l-5.0l->5%
 * 5.0l-10l-> 20%
 * above 10l-> 30%
 */

public class Problem_c2 {
    public static void main(String[] args) {
        float tax=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter your salary in digits:");
        int salary=sc.nextInt();
        if(salary>=250000 && salary<=500000){
        System.out.println("tax to be paid:");
        tax= (salary-250000)*0.05f;
        System.out.println(tax);
        } 
        else if(salary>500000 && salary<=1000000){
            System.out.println("tax to be paid:");
            tax=(salary-500000)*0.2f;
            tax=tax+(500000*0.05f);
            System.out.println(tax);
        }
        else if(salary>1000000){
            System.out.println("tax to be paid:");
            tax=((salary-1000000)*0.3f);
            tax=tax+(500000*0.2f);
            tax=tax+(500000*0.05f);    
            System.out.println(tax);
        }
        else{
            System.out.println("you dont have to pay the tax");
        }
        sc.close();
    }
    
}
