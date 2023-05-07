package JavaAdvancedAlgorithms;
import java.util.Scanner;
public class ArraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {1,2,3,4};

        System.out.println(sumArr(arr, 0));


    }
    public static int sumArr(int[]arr, int index){

        if(index == arr.length-1){
            return arr[index];
        }

        int sum= arr[index]+ sumArr(arr, index+1);
        return sum;
    }
}
