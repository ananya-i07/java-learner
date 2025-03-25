// to find reverse of an array.
import java.util.Arrays;
public class reverse_array{
  public static void main(String[] args) {
    int [] org={4,35,35,2,56,14};
    int[] rev= new int[6];
    for (int i= org.length-1;i>=0;i--) {
            rev[org.length - 1 - i] = org[i];
        }
        System.out.println(Arrays.toString(rev));
    }
  }