package JavaAdvancedStreamsFilesAndDirectoriesExercise;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
public class P06WordCount {
    public static void main(String[] args) {
        String inputPath = "D:\\Intelij\\IdeaProjects\\JavaAdvancedPart1\\src\\JavaAdvancedStreamsFilesAndDirectoriesExercise\\words.txt";
        String comparePath = "src/JavaAdvancedStreamsFilesAndDirectoriesExercise/Exercises Resources/text.txt";
        String outputPath = "D:\\Intelij\\IdeaProjects\\JavaAdvancedPart1\\src\\JavaAdvancedStreamsFilesAndDirectoriesExercise\\Exercises Resources\\result.txt";
try (PrintWriter pr = new PrintWriter(outputPath)){
    Scanner compare = new Scanner(new FileReader(comparePath));
    Scanner in = new Scanner(new FileReader(inputPath));
    LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
    while(in.hasNextLine()){
        String []a = (in.nextLine()).split(" ");
        for (int i = 0; i < a.length; i++) {
            map.put(a[i],0);
        }
    }
    while (compare.hasNextLine()){
        String []a =compare.nextLine().split(" ");
        for (int i = 0; i < a.length; i++) {
            if(map.containsKey(a[i])){
                int current = map.get(a[i]);
                current++;
                map.put(a[i],current);
            }
        }
    }

    for (Map.Entry<String, Integer> entry : map.entrySet()) {
        pr.println(entry.getKey() + " - " + entry.getValue());
    }


}
catch (IOException e){

}


    }
}
