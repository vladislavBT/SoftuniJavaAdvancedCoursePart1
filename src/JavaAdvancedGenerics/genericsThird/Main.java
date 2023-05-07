package JavaAdvancedGenerics.genericsThird;
import javax.print.DocFlavor;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Scale<Integer> scale = new Scale<>(15,23);

        System.out.println(scale.getHeavier());

    }
}
