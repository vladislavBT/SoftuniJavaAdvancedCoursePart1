package JavaAdvancedStreamsFilesDirectories;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class P03CopyBytes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputPath="D:\\Intelij\\IdeaProjects\\JavaAdvancedPart1\\src\\JavaAdvancedStreamsFilesDirectories\\input.txt";
        String outputPath = "D:\\Intelij\\IdeaProjects\\JavaAdvancedPart1\\src\\JavaAdvancedStreamsFilesDirectories\\output.txt";

        try {
            FileInputStream in =new FileInputStream(inputPath);
            FileOutputStream out =new FileOutputStream(outputPath);

            int bite = in.read();
            while(bite!=-1){
                if(bite==32 || bite==10){
                    out.write((char)bite);
                }else{
                    String digits = String.valueOf(bite);
                    for (int i = 0; i < digits.length(); i++) {
                       out.write(digits.charAt(i));
                    }
                }
                bite = in.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
