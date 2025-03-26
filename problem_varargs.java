public class problem_varargs {
    public static void varargs(int...arr){
    float avg=0;
    int sum=0;
    for(int element:arr)  {
     sum=sum+element;
    }
    avg=(float)sum/arr.length;
    System.out.println(avg);
 }
    public static void main(String[] args) {
        varargs(5,32,34,65,85,34);
    }
}