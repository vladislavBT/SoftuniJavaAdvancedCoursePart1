package JavaAdvancedStackAndQueuesExercise;
import java.util.ArrayDeque;
import java.util.Scanner;
public class P03MaximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            String [] arr = scanner.nextLine().split(" ");
            if(Integer.parseInt(arr[0]) == 1){
                int x = Integer.parseInt(arr[1]);
                stack.push(x);
            }
            else if(Integer.parseInt(arr[0]) == 2){
                stack.pop();
            }
            else if(Integer.parseInt(arr[0]) == 3){
                int max=Integer.MIN_VALUE;
                for (Integer input : stack) {
                    if(input>max){
                        max=input;
                    }
                }
                System.out.println(max);
            }
        }
    }
}
