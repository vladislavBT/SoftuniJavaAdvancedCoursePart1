package JavaAdvancedGenerics.genericsSecond;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer[] arr =ArrayCreator.create(5,69);

        String[] arr2 =ArrayCreator.create(String.class,5,"Bob");
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
    }
}
