package JavaAdvancedStreamsFilesAndDirectoriesExercise;
import java.io.File;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
public class P08GetFolderSize {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        File folder = new File("src/JavaAdvancedStreamsFilesAndDirectoriesExercise/Exercises Resources");
        Deque <File> files = new ArrayDeque<>();
        files.offer(folder);
        int size=0;
        while (!files.isEmpty()){
            File currentFile = files.poll();
            File [] nestedFiles= currentFile.listFiles();
            for (File nestedFile : nestedFiles) {
                if(nestedFile.isDirectory()){
                    files.offer(nestedFile);
                }else{
                    size+=nestedFile.length();
                }
            }

        }
        System.out.println("Folder size: "+size);
    }
}
