package JavaAdvancedMultidimesionalArraysExercise;
import java.util.Scanner;
public class P05MatrixShuffling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String []arr=scanner.nextLine().split(" ");
        int rows = Integer.parseInt(arr[0]);
        int cols = Integer.parseInt(arr[1]);

        String[][]matrix = new String[rows][cols];

        for (int row = 0; row < rows; row++) {
            String []arr1=scanner.nextLine().split(" ");
            matrix[row]=arr1;
        }
        String command= scanner.nextLine();
        while(!command.equals("END")){
            String []arr3=command.split(" ");
            if(!arr3[0].equals("swap")){
                System.out.println("Invalid input!");
            }
            else{
                if(Integer.parseInt(arr3[1])>=rows || Integer.parseInt(arr3[2])>=cols || Integer.parseInt(arr3[3])>=rows || Integer.parseInt(arr3[4])>=cols){
                    System.out.println("Invalid input!");
                }
                else{
                    int swap1Row=Integer.parseInt(arr3[1]);
                    int swap1Col=Integer.parseInt(arr3[2]);
                    int swap2Row=Integer.parseInt(arr3[3]);
                    int swap2Col=Integer.parseInt(arr3[4]);
                    String swapper;
                    swapper=matrix[swap1Row][swap1Col];
                    matrix[swap1Row][swap1Col]=matrix[swap2Row][swap2Col];
                    matrix[swap2Row][swap2Col]=swapper;

                    for (int i = 0; i < rows; i++) {
                        for (int j = 0; j < cols; j++) {
                            System.out.print(matrix[i][j]+  " ");
                        }
                        System.out.println();
                    }
                }
            }

            command= scanner.nextLine();
        }
    }
}
