package JavaAdvancedStackAndQueues;
import java.util.ArrayDeque;
import java.util.Scanner;
public class P01BrowserHistory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<String> history = new ArrayDeque<>();
        history.push("blank");
        String command = scanner.nextLine();
        String previousHistory;
        while (!command.equals("Home")) {

            if (command.equals("back")) {
                previousHistory = history.peek();
                history.pop();
                if (history.peek().equals("blank")) {
                    history.push(previousHistory);
                    System.out.println("no previous URLs");
                } else {
                    System.out.println(history.peek());
                }

            } else {
                history.push(command);
                System.out.println(history.peek());
            }
            command = scanner.nextLine();
        }

    }
}

