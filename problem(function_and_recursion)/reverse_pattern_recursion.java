public class reverse_pattern_recursion{
    static void stars(int n){
     if(n>0){
     for(int i=0;i<n;i++){
        System.out.print("*");
     }
     System.out.println();
     stars(n-1);
     
    }
    }
    public static void main(String[]arg){
     stars(5);
    }
}