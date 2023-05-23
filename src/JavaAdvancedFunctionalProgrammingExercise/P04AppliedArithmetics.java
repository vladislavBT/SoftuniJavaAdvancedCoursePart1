package JavaAdvancedFunctionalProgrammingExercise;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P04AppliedArithmetics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List <Integer> list = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        String command = scanner.nextLine();

        while(!command.equals("end")){
            if(command.equals("add")){
                list = list.stream()
                        .map(n -> n+1)
                        .collect(Collectors.toList());
            }
            else if(command.equals("subtract")){
                list = list.stream()
                        .map(n -> n-1)
                        .collect(Collectors.toList());
            }
            else if(command.equals("multiply")){
                list = list.stream()
                        .map(n -> n*2)
                        .collect(Collectors.toList());
            }
            else if(command.equals("print")){
                list.forEach(s -> System.out.print(s +" "));
            }
            command = scanner.nextLine();
        }
    }
}
