package JavaAdvancedStreamsFilesAndDirectoriesExercise;
import java.io.*;
import java.util.Scanner;
public class P04ExtractIntegers {
    public static void main(String[] args) {
        String inputPath = "src/JavaAdvancedStreamsFilesAndDirectoriesExercise/input.txt";
        String outputPath = "D:\\Intelij\\IdeaProjects\\JavaAdvancedPart1\\src\\JavaAdvancedStreamsFilesAndDirectoriesExercise\\output.txt";

        try {
            FileReader in = new FileReader(inputPath);
            //FileOutputStream out= new FileOutputStream(new FileWriter(outputPath));
            PrintWriter out = new PrintWriter(outputPath);
            int vowels=0;
            int consonants=0;
            int punctuation=0;

            int oneSymbol = in.read();

            while(oneSymbol>=0) {
                char symbol= (char) oneSymbol;
                if (symbol=='a' || symbol=='o' || symbol=='u' || symbol=='i' || symbol=='e') {
                    vowels++;
                }
                else if (symbol=='!' || symbol=='?' || symbol==',' || symbol=='.') {
                    punctuation++;
                }
                else if(!Character.isWhitespace(symbol)){
                    consonants++;
                }
                oneSymbol = in.read();

            }
            out.println("Vowels: " + vowels);
            out.println("Consonants: " + consonants);
            out.println("Punctuation: " + punctuation);

            out.close();
            in.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }
    }

