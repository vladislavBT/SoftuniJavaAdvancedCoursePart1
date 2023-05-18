package JavaAdvancedStreamsFilesAndDirectoriesExercise;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;
public class P05LineNumbers {
    public static void main(String[] args) {
        String inputPath = "D:\\Intelij\\IdeaProjects\\JavaAdvancedPart1\\src\\JavaAdvancedStreamsFilesAndDirectoriesExercise\\inputLineNumbers.txt";
        String outputPath = "D:\\Intelij\\IdeaProjects\\JavaAdvancedPart1\\src\\JavaAdvancedStreamsFilesAndDirectoriesExercise\\output.txt";

        try(PrintWriter pw = new PrintWriter(outputPath)){
            Path inputFile = Paths.get(inputPath);
            List<String> lines = Files.readAllLines(inputFile);
            for (int i = 0; i < lines.size(); i++) {
                pw.println((i+1) +". " + lines.get(i));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
