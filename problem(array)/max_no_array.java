public class max_no_array {
    public static void main(String[] args) {
        int[] arr= {56,67,45,23,88,50,74,41};
        int max=arr[1];
        for (int element: arr) {
            if(max>element){
            }
            else if(max<element){
             max=element;
            }
        }
        System.out.println(max);
    }
}
