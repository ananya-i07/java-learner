public class fibonacci{
    static int fib(int n){
        int fib;
        if (n==1||n==2){
         return n-1;
        }
        fib=fib(n-1)+fib(n-2);
        return fib;

    }
    
    public static void main(String[] args){
       int a= fib(6);
       System.out.println(a);
    }
}