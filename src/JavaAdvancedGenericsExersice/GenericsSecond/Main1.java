package JavaAdvancedGenericsExersice.GenericsSecond;
import java.util.Scanner;
public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Box1 box = new Box1();

        int n =Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            box.add(num);
        }

        System.out.println(box.toString());

    }
}
