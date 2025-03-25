//add to matrix of size 2*3.

import java.util.Arrays;

public class add_matrix {
    public static void main(String[] args) {
        int[][] A={{4,5,4},{3,7,5}};
        int [][] B={{3,6,8},{3,6,8}};
        int [][] R=new int[2][3];
        for(int i=0;i<2;i++){
          for(int j=0;j<3;j++){
           R[i][j]=A[i][j]+ B[i][j];
          }
        }
      System.out.println(Arrays.deepToString(R));
    }
    
}
