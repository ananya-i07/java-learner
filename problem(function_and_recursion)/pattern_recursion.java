public class pattern_recursion{
    static void stars(int n){
     if(n>0){
        stars(n-1);
     for(int i=0;i<n;i++){
        System.out.print("*");
     }
     System.out.println();
    }
    }
    public static void main(String[]arg){
     stars(5);
    }
}