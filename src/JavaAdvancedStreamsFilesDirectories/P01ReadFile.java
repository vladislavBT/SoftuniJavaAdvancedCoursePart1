package JavaAdvancedStreamsFilesDirectories;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;
public class P01ReadFile {
    public static void main(String[] args) {
        String path = "D:\\Intelij\\IdeaProjects\\JavaAdvancedPart1\\src\\JavaAdvancedStreamsFilesDirectories\\input.txt";

        try {
            InputStream in = new FileInputStream(path);
            int oneByte = in.read();
            while (oneByte!=-1){
                System.out.printf("%s ",Integer.toBinaryString(oneByte));
                oneByte= in.read();
            }

        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
