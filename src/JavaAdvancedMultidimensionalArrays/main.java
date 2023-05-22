package JavaAdvancedMultidimensionalArrays;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String [] arr = scanner.nextLine().split(" ");
        int rows=Integer.parseInt(arr[0]);
        int cols=Integer.parseInt(arr[1]);

        int [][]matrix= new int [rows][cols];
        for (int i = 0; i < matrix.length; i++) {
            int [] arr1= Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            matrix[i]=arr1;
        }

        int n = Integer.parseInt(scanner.nextLine());
        boolean isFind=false;
        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j]==n){
                    System.out.println(i + " " + j);
                    isFind=true;
                }
            }
        }
        if(isFind==false){
            System.out.println("not found");
        }



    }
}
