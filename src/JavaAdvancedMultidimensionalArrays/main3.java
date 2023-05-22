package JavaAdvancedMultidimensionalArrays;
import java.util.Arrays;
import java.util.Scanner;
public class main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] arr = scanner.nextLine().split(", ");
        int rows = Integer.parseInt(arr[0]);
        int cols = Integer.parseInt(arr[1]);

        int [][]matrix= new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            matrix[i]= Arrays.stream(scanner.nextLine().split(", "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }
        int sum=0;
        int max=Integer.MIN_VALUE;
        int maxRows=0;
        int maxCols=0;
        int maxSum=0;
        for (int i = 0; i < rows-1; i++) {

            for (int j = 0; j < cols - 1; j++) {
                sum+=matrix[i][j];
                sum+=matrix[i][j+1];
                sum+=matrix[i+1][j];
                sum+=matrix[i+1][j+1];
                if(sum>max){
                    max=sum;
                    maxRows=i;
                    maxCols=j;
                    maxSum=sum;
                }
                sum=0;
            }
        }

                System.out.print(matrix[maxRows][maxCols] + " ");
                System.out.println(matrix[maxRows][maxCols+1]);
                System.out.print(matrix[maxRows+1][maxCols] + " ");
                System.out.println(matrix[maxRows+1][maxCols+1]);
        System.out.println(maxSum);


    }
}
