package JavaAdvancedStackAndQueuesExercise;
import java.util.ArrayDeque;
import java.util.Scanner;
public class P06RecursiveFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<Integer>queue=new ArrayDeque<>();
        int n =Integer.parseInt(scanner.nextLine());
        int sum1=1;
        int sum2=1;

        for (int i = 0; i < n-1; i++) {
            int a=sum2;
            sum2=sum2+sum1;
            sum1=a;
        }
        System.out.println(sum2);
    }
}
