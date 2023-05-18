package JavaAdvancedStackAndQueuesExercise;
import java.util.ArrayDeque;
import java.util.Scanner;
public class P07SimpleTextEditor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        StringBuilder sb = new StringBuilder();
        ArrayDeque <String> stack = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            String [] arr = scanner.nextLine().split(" ");
            if(arr[0].equals("1")){
                sb.append(arr[1]);
                stack.push(sb.toString());
            }
            else if(arr[0].equals("2")){
                sb.replace(sb.length()-Integer.parseInt(arr[1]),sb.length(),"");
                stack.push(sb.toString());
            }
            else if(arr[0].equals("3")){
                System.out.println(sb.charAt(Integer.parseInt(arr[1])-1));
            }
            else if(arr[0].equals("4")){
                stack.pop();
                sb=new StringBuilder(stack.peek());
            }

        }
    }
}
