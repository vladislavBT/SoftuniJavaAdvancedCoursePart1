package JavaAdvancedStreamsFilesDirectories;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class P02WriteToFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputPath = "D:\\Intelij\\IdeaProjects\\JavaAdvancedPart1\\src\\JavaAdvancedStreamsFilesDirectories\\input.txt";
        String outputPath= "D:\\Intelij\\IdeaProjects\\JavaAdvancedPart1\\src\\JavaAdvancedStreamsFilesDirectories\\output.txt";

        List <Character> symbols = new ArrayList<>();
        Collections.addAll(symbols,'.',',','!','?');

        try{
            InputStream in = new FileInputStream(inputPath);
            OutputStream out = new FileOutputStream(outputPath);
            int oneBite = in.read();
            while (oneBite!=-1){
                if(!symbols.contains((char)oneBite)){
                    out.write((char) oneBite);
                }
                oneBite = in.read();
            }

        }catch (IOException e){

        }
    }
}
