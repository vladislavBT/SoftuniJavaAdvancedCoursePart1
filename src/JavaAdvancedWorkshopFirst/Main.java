package JavaAdvancedWorkshopFirst;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        MyStack stack = new MyStack();
        stack.push(13);
        stack.push(24);
        stack.push(57);
        System.out.println(stack.pop());

    }
}
