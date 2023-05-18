package JavaAdvancedStreamsFilesAndDirectoriesExercise;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class P02SumBytes {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String inputPath = "src/JavaAdvancedStreamsFilesAndDirectoriesExercise/input.txt";
        try{
            int sum=0;
            FileReader fr=new FileReader(inputPath);
            BufferedReader bf = new BufferedReader(fr);
            String line = bf.readLine();
            while(line!= null) {
                for (int i = 0; i < line.length(); i++) {
                    sum += (int) line.charAt(i);
                }
                line = bf.readLine();
            }
            System.out.println(sum);
        }
        catch (IOException e){

        }


    }
}
