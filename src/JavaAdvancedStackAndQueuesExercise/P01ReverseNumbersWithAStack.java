package JavaAdvancedStackAndQueuesExercise;
import java.util.ArrayDeque;
import java.util.Scanner;
public class P01ReverseNumbersWithAStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line= scanner.nextLine();
        String [] arr = line.split(" ");

        ArrayDeque <Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < arr.length; i++) {
            stack.push(Integer.parseInt(arr[i]));
        }
        while (!stack.isEmpty()){
            System.out.printf("%d ",stack.pop());
        }
    }
}
