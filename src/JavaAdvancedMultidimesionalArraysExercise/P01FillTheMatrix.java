package JavaAdvancedMultidimesionalArraysExercise;
import java.util.Scanner;
public class P01FillTheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String []arr= scanner.nextLine().split(", ");
        int n = Integer.parseInt(arr[0]);
        String pattern= arr[1];

        int matrix[][]=new int[n][n];
        if(pattern.equals("A")){
            patternA(matrix,n);
        }
        if(pattern.equals("B")){
            patternB(matrix,n);
        }
        print(matrix,n);
    }

    private static void print(int matrix[][],int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void patternB(int matrix[][],int n) {
        int x =0;
        for (int row = 0; row < n; row++) {
            if(row%2==0) {
                for (int col = 0; col < n; col++) {
                    x++;
                    matrix[col][row] = x;
                }
            }
            else{
                for (int col = n-1; col >=0; col--) {
                    x++;
                    matrix[col][row] = x;
                }
            }
        }
    }

    private static void patternA(int matrix[][],int n) {
        int x =0;
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                x++;
                matrix[col][row]=x;
            }
        }
    }
}
