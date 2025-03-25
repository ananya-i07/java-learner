// check if array shorted in ascending.

import java.util.Scanner;

public class isarrayshorted {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    float[] arr=new float[7];
    int j=0;
    System.out.println("please enter 5 numbers of array");
    for(int i=0;i<7;i++){
        arr[i]=sc.nextFloat();
         }
      for (int i=0;i<7;i++) {
        if(arr[i]<=arr[i+1]){
            j++;
        break;
        }
      }
      if(j>0){
        System.out.println("Array is not sorted");
      }
         sc.close();
    }
}
