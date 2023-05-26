package JavaAdvancedExamPreparation;
import java.util.ArrayDeque;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
public class P01Cooking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> liquid = new ArrayDeque<>();
        String[] line = scanner.nextLine().split(" ");
        for (int i = 0; i < line.length; i++) {
            liquid.offer(Integer.parseInt(line[i]));
        }

        ArrayDeque<Integer> ingredients = new ArrayDeque<>();
        String[] line2 = scanner.nextLine().split(" ");
        for (int i = 0; i < line2.length; i++) {
            ingredients.push(Integer.parseInt(line2[i]));
        }
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("Bread", 0);
        map.put("Cake", 0);
        map.put("Fruit Pie", 0);
        map.put("Pastry", 0);
        while (!liquid.isEmpty() && !ingredients.isEmpty()) {
            int newIngredient = ingredients.pop() + 3;
            int sum = liquid.poll() + newIngredient-3;

            if (sum == 25) {
                int current = map.get("Bread") + 1;
                map.put("Bread", current);

            } else if (sum == 50) {
                int current = map.get("Cake") + 1;
                map.put("Cake", current);

            } else if (sum == 75) {
                int current = map.get("Fruit Pie") + 1;
                map.put("Fruit Pie", current);

            } else if (sum == 100) {
                int current = map.get("Pastry") + 1;
                map.put("Pastry", current);

            } else {

                ingredients.push(newIngredient);
            }


        }

        if (map.get("Bread") >= 1 && map.get("Cake") >= 1 && map.get("Fruit Pie") >= 1 && map.get("Pastry") >= 1) {
            System.out.println("Wohoo! You succeeded in cooking all the food!");
        } else {
            System.out.println("Ugh, what a pity! You didn't have enough materials to cook everything.");
        }

        if (liquid.isEmpty()) {
            System.out.println("Liquids left: none");
        } else {
            System.out.print("Liquids left: ");
            while (!liquid.isEmpty()) {
                if (liquid.size()==1) {
                    System.out.printf("%d%n", liquid.poll());
                }else {
                    System.out.printf("%d, ", liquid.poll());
                }

            }
        }

        if (ingredients.isEmpty()) {
            System.out.println("Ingredients left: none");
        } else {
            System.out.print("Ingredients left: ");
            while (!ingredients.isEmpty()) {
                if (ingredients.size()==1) {
                    System.out.printf("%d%n", ingredients.pop());
                }else {
                    System.out.printf("%d, ", ingredients.pop());
                }
            }
        }

        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.printf("%s: %d%n",e.getKey(),e.getValue());
        }


    }
}
