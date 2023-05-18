package JavaAdvancedStackAndQueuesExercise;
import java.util.ArrayDeque;
import java.util.Scanner;
public class P04BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String arr[] = scanner.nextLine().split(" ");
        int n = Integer.parseInt(arr[0]);
        int s = Integer.parseInt(arr[1]);
        int x = Integer.parseInt(arr[2]);
        int min = Integer.MAX_VALUE;
        int switcher = 0;

        ArrayDeque<Integer> queue = new ArrayDeque<>();
        String input[] = scanner.nextLine().split(" ");

        for (int i = 0; i < n; i++) {
            queue.offer(Integer.parseInt(input[i]));
        }
        for (int i = 0; i < s; i++) {
            queue.poll();
        }
        if (queue.isEmpty()) {
            System.out.println(0);
        }
        for (Integer i : queue) {
            if (x == i) {
                System.out.println("true");
                switcher = 1;
                break;
            }
            if (i < min) {
                min = i;
            }
        }
        if (switcher == 0 && !queue.isEmpty()) {
            System.out.println(min);
        }
    }
}
