// sum the numbers in array without function.

import java.util.Scanner;

public class sum_array {
    public static void main(String[] args) {
         float sum=0;
    Scanner sc= new Scanner(System.in);
    float[] arr=new float[5];
    System.out.println("please enter 5 numbers of array");
    for(int i=0;i<5;i++){
        arr[i]=sc.nextFloat();
         }
        System.out.println("sum of array:");
        for(float element:arr){
        sum=sum+element;
        }
        System.out.println(sum);
        sc.close();
    }
}
