package JavaAdvancedMultidimesionalArraysExercise;
import java.util.Scanner;
public class P02MatrixOfPalindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String []arr=scanner.nextLine().split(" ");
        int rows = Integer.parseInt(arr[0]);
        int cols = Integer.parseInt(arr[1]);

        String [][] matrix=new String[rows][cols];
        for (int row = 0; row < rows ; row++) {
            for (int col = 0; col < cols; col++) {
                char firstAndLastLetter= (char) ((int) 'a' + row);
                char middleLetter= (char) ((int) 'a' + row + col);
                String combination=""+firstAndLastLetter +middleLetter + firstAndLastLetter;
                matrix[row][col]=combination;
            }
        }

        for (int row = 0; row < rows ; row++) {
            for (int col = 0; col < cols; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}
