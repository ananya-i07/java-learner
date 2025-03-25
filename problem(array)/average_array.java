// to find average of an array.
public class average_array {
    public static void main(String[] args) {
       int[]arr= {4,6,6,5,4,2,2};
       float sum=0;
       float avg;
       for(int element:arr){
           sum=sum+element;
       }
       avg=(float)sum/7;
       System.out.println("average of array:"+avg);
    }
    
}
