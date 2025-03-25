public class min_no_array {
    public static void main(String[] args) {
        int[] arr= {56,67,45,23,88,50,74,41};
        int min=arr[1];
        for (int element: arr) {
            if(min<element){
            }
            else if(min>element){
             min=element;
            }
        }
        System.out.println(min);
    }
}
