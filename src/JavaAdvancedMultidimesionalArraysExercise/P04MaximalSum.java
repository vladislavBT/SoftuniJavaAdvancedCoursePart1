package JavaAdvancedMultidimesionalArraysExercise;
import java.util.Arrays;
import java.util.Scanner;
public class P04MaximalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] arr = scanner.nextLine().split(" ");
        int rows=Integer.parseInt(arr[0]);
        int cols=Integer.parseInt(arr[1]);

        int [][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            int [] arr1= Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            matrix[i]=arr1;
        }
        int max=Integer.MIN_VALUE;
        int sum=0;
        int maxRow=0;
        int maxCol=0;
        for (int row = 0; row < rows-2; row++) {
            for (int col = 0; col < cols-2; col++) {
                sum+=matrix[row][col];
                sum+=matrix[row][col+1];
                sum+=matrix[row][col+2];
                sum+=matrix[row+1][col];
                sum+=matrix[row+1][col+1];
                sum+=matrix[row+1][col+2];
                sum+=matrix[row+2][col];
                sum+=matrix[row+2][col+1];
                sum+=matrix[row+2][col+2];
                if(max<sum){
                    max=sum;
                    maxRow=row;
                    maxCol=col;

                }
                sum=0;
            }
        }

        System.out.println("Sum = " + max);
                System.out.print(matrix[maxRow][maxCol]+" " + matrix[maxRow][maxCol + 1] + " " + matrix[maxRow][maxCol +2]);
        System.out.println();
        System.out.print(matrix[maxRow+1][maxCol]+" " + matrix[maxRow+1][maxCol + 1] + " " + matrix[maxRow+1][maxCol +2]);
        System.out.println();
        System.out.print(matrix[maxRow+2][maxCol]+" " + matrix[maxRow+2][maxCol + 1] + " " + matrix[maxRow+2][maxCol +2]);



    }
}
