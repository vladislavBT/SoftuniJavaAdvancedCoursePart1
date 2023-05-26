package JavaAdvancedGenericsExersice.GenericsFourth;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<String> list = new ArrayList<>();
        CustomList <String>customList = new CustomList(list);

        String command = scanner.nextLine();

        while(!command.equals("END")){
            String []arr = command.split(" ");
            String firstCommand = arr[0];
            if(firstCommand.equals("Add")){
                String line = arr[1];
                customList.add(line);
            }else if(firstCommand.equals("Remove")){
                int index =Integer.parseInt(arr[1]);
                customList.remove(index);
            }else if(firstCommand.equals("Contains")){

                String line = arr[1];
                System.out.println(customList.contains(line));
            }else if(firstCommand.equals("Swap")){

                int firstIndex = Integer.parseInt(arr[1]);
                int secondIndex = Integer.parseInt(arr[2]);
                customList.swap(firstIndex,secondIndex);

            }else if(firstCommand.equals("Greater")){
                String line = arr[1];
                System.out.println(customList.countGreaterThan(line));

            }else if(firstCommand.equals("Max")){
                System.out.println(customList.getMax());
            }
            else if(firstCommand.equals("Min")){
                System.out.println(customList.getMin());
            }
            else if(firstCommand.equals("Print")){
                customList.print();
            }
            else if(firstCommand.equals("Sort")){
                Sort.sort(customList);
            }
            command= scanner.nextLine();
        }



    }
}
