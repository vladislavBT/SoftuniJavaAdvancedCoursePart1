package JavaAdvancedStackAndQueuesExercise;
import java.util.ArrayDeque;
import java.util.Scanner;
public class P05BalancedParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        //char [] arr=new char[Integer.MAX_VALUE];
        ArrayDeque<Character> stack = new ArrayDeque<>();
        ArrayDeque<Character> queue = new ArrayDeque<>();
        for (int i = 0; i <= line.length()/2-1; i++) {
            stack.push(line.charAt(i));
        }
        for (int i = line.length()/2; i < line.length(); i++) {
            queue.offer(line.charAt(i));
        }
        int stackSize= stack.size();
        for (int i = 0; i < stackSize; i++) {
            if(stack.peek()=='(' && queue.peek()==')'){
                stack.pop();
                queue.poll();
                continue;
            }
            else if(stack.peek()=='[' && queue.peek()==']'){
                stack.pop();
                queue.poll();
                continue;
            }
            else if(stack.peek()=='{' && queue.peek()=='}'){
                stack.pop();
                queue.poll();
                continue;
            }
            else {
                System.out.println("NO");
                break;
            }
        }
        if(stack.isEmpty()){
            System.out.println("YES");
        }
    }
}
