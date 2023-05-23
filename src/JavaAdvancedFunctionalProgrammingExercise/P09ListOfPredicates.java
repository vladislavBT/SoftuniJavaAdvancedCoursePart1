package JavaAdvancedFunctionalProgrammingExercise;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class P09ListOfPredicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Integer> divide = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> list = IntStream.rangeClosed(1,n)
                .boxed()
                .filter(num -> {
                    int switcher=1;
                    for (int i = 0; i < divide.size(); i++) {
                        if(num%divide.get(i)==0){
                            continue;
                        }
                        else{
                            switcher=0;
                            break;
                        }
                    }
                    if(switcher==1){
                        return true;
                    }
                    return false;
                })
                .collect(Collectors.toList());
        list.forEach(number -> System.out.print(number + " "));
    }
}
