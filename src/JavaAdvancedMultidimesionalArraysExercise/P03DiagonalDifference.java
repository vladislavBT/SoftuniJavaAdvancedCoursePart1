package JavaAdvancedMultidimesionalArraysExercise;
import java.util.Arrays;
import java.util.Scanner;
public class P03DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        int [][]matrix =new int[n][n];
        for (int i = 0; i < n; i++) {
            int []arr= Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
                matrix[i]=arr;
        }

        int firstSum=0;
        for (int i = 0; i < n; i++) {
            firstSum+=matrix[i][i];
        }
        int secondSum=0;
        for (int i = 0; i < n; i++) {
            secondSum+=matrix[n-i-1][i];
        }

        int difference = Math.abs(firstSum-secondSum);
        System.out.println(difference);
    }
}
