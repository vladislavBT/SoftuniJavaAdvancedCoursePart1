package JavaAdvancedStackAndQueues;
import java.util.ArrayDeque;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {

       ArrayDeque<Integer> stack = new ArrayDeque<>();
//
//        stack.push(15);
//        stack.push(84);
//        stack.push(73);
//        stack.push(69);
//
//        while (!stack.isEmpty()){
//            int topElement= stack.pop();
//            System.out.println(topElement);
//        }
        stack.offer(58);
        stack.push(14);
        stack.offer(82);
        stack.push(29);
        stack.push(45);
        stack.offer(99);
        stack.offer(16);

        for (Integer integer : stack) {
            System.out.println(integer);
        }


    }
}
