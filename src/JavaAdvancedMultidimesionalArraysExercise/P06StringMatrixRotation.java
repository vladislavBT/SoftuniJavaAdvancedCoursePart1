package JavaAdvancedMultidimesionalArraysExercise;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P06StringMatrixRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Pattern patterns = Pattern.compile("\\d+");
        Matcher match = patterns.matcher(scanner.nextLine());
        String rotationA="";
        if(match.find()){
            rotationA = match.group(0);

        }
        int rotationAngle=Integer.parseInt(rotationA);
        rotationAngle=rotationAngle%360;


        String command= scanner.nextLine();
        List<String> wordList = new ArrayList<>();
        int maxLength=0;
        while (!command.equals("END")){
            wordList.add(command);
            if(command.length()>maxLength){
                maxLength=command.length();
            }
            command= scanner.nextLine();
        }

        char [][] matrix = new char[wordList.size()][maxLength];
        for (int i = 0; i < wordList.size(); i++) {
            char []arr=wordList.get(i)
                    .replaceAll("\\s+" ,"")
                    .toCharArray();
            for (int j = 0; j < maxLength; j++) {
                if(arr.length>j) {
                    matrix[i][j] = arr[j];
                }
                else {
                    matrix[i][j]=' ';
                }
            }

        }

        if(rotationAngle==90){
            char [][]newMatrix = new char[maxLength][wordList.size()];
            for (int row = 0; row < wordList.size(); row++) {
                    char []arr=matrix[row];
                for (int col = 0; col < maxLength; col++) {
                        newMatrix[col][wordList.size()-row-1]=arr[col];
                }

            }
            for (int i = 0; i < maxLength; i++) {
                for (int j = 0; j < wordList.size(); j++) {
                    System.out.print(newMatrix[i][j]);
                }
                System.out.println();
            }
        }
        else if(rotationAngle==180){
            char [][]newMatrix = new char[wordList.size()][maxLength];
            for (int row = 0; row < wordList.size(); row++) {
                char []arr=matrix[row];
                for (int col = 0; col < maxLength; col++) {
                    newMatrix[wordList.size()-row-1][col]=arr[arr.length-col-1];
                }

            }
            for (int i = 0; i < wordList.size(); i++) {
                for (int j = 0; j < maxLength; j++) {
                    System.out.print(newMatrix[i][j]);
                }
                System.out.println();
            }
        }
        else if(rotationAngle==270){
            char [][]newMatrix = new char[maxLength][wordList.size()];
            for (int row = 0; row < wordList.size(); row++) {
                char []arr=matrix[row];
                for (int col = 0; col < maxLength; col++) {
                    newMatrix[col][row]=arr[arr.length-col-1];
                }

            }
            for (int i = 0; i < maxLength; i++) {
                for (int j = 0; j < wordList.size(); j++) {
                    System.out.print(newMatrix[i][j]);
                }
                System.out.println();
            }
        }
        else if(rotationAngle==0){
            for (int i = 0; i < wordList.size(); i++) {
                for (int j = 0; j < maxLength; j++) {
                    System.out.print(matrix[i][j]);
                }
                System.out.println();
            }
        }






    }
}
