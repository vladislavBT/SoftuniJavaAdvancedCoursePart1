package JavaAdvancedStreamsFilesAndDirectoriesExercise;
import java.io.*;
import java.util.Scanner;
public class P07MergeTwoFiles {
    public static void main(String[] args) {

        try(PrintWriter pr= new PrintWriter("src/JavaAdvancedStreamsFilesAndDirectoriesExercise/Exercises Resources/result.txt")) {
            Scanner in1 = new Scanner(new FileReader("src/JavaAdvancedStreamsFilesAndDirectoriesExercise/inputOne.txt"));
            Scanner in2 = new Scanner(new FileReader("src/JavaAdvancedStreamsFilesAndDirectoriesExercise/inputTwo.txt"));

            while(in1.hasNextLine()){
                String[] a =in1.nextLine().split(" ");
                for (int i = 0; i < a.length; i++) {
                    pr.println(a[i]);
                }

            }
            while(in2.hasNextLine()){
                String[] a =in2.nextLine().split(" ");
                for (int i = 0; i < a.length; i++) {
                    pr.println(a[i]);
                }
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }
}
