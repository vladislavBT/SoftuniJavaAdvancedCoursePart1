package JavaAdvancedMultidimensionalArrays;
import java.util.Arrays;
import java.util.Scanner;
public class main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows= Integer.parseInt(scanner.nextLine());
        int cols=Integer.parseInt(scanner.nextLine());

        char [][]firstMatrix = new char[rows][cols];
        char [][]secondMatrix = new char[rows][cols];
        char [][]thirdMatrix = new char[rows][cols];
        readMatrix(scanner, firstMatrix,rows,cols);
        readMatrix(scanner, secondMatrix,rows,cols);

        compareMatrix(firstMatrix,secondMatrix,rows,cols,thirdMatrix);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(thirdMatrix[i][j]+ " ");
            }
            System.out.println();
        }
    }

    private static void compareMatrix(char [][] firstMatrix, char [][] secondMatrix, int rows , int cols,char [][] thirdMatrix) {

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if(firstMatrix[i][j]==secondMatrix[i][j]){
                    thirdMatrix[i][j]=firstMatrix[i][j];
                }
                else{
                    thirdMatrix[i][j]='*';
                }
            }
        }
    }

    private static void readMatrix(Scanner scanner, char [][] matrix, int rows , int cols) {
        for (int i = 0; i < rows; i++) {
            char []arr = scanner.nextLine()
                    .replaceAll("\\s+" ,"").
                    toCharArray();

                    matrix[i]=arr;

        }
    }
}
