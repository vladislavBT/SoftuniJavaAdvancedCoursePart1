package JavaAdvancedMultidimesionalArraysExercise;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class P07HandsOfCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        LinkedHashMap<String, Integer> map =new LinkedHashMap<>();
        while(!input.equals("JOKER")){
            String[] arr1= input.split(": ");
            String[] cards =arr1[1].split(", ");
            int sum=0;
            List<String> list = new ArrayList<>();
            for (int i = 0; i < cards.length; i++) {
                if(!list.contains(cards[i])){
                    list.add(cards[i]);
                }
            }
            for (int i = 0; i < list.size(); i++) {

                char power = list.get(i).charAt(0);
                char type = list.get(i).charAt(1);
                if(power=='1'){
                    type = list.get(i).charAt(2);
                }

                switch (type){
                    case 'S':
                       if(power == '2'){
                           int points = 4*2;
                           sum+=points;
                       }
                        if(power == '3'){
                            int points = 4*3;
                            sum+=points;
                        }
                        if(power == '4'){
                            int points = 4*4;
                            sum+=points;
                        }
                        if(power == '5'){
                            int points = 4*5;
                            sum+=points;
                        }
                        if(power == '6'){
                            int points = 4*6;
                            sum+=points;
                        }
                        if(power == '7'){
                            int points = 4*7;
                            sum+=points;
                        }
                        if(power == '8'){
                            int points = 4*8;
                            sum+=points;
                        }
                        if(power == '9'){
                            int points = 4*9;
                            sum+=points;
                        }
                        if(power == '1'){
                            int points = 4*10;
                            sum+=points;
                        }
                        if(power == 'J'){
                            int points = 4*11;
                            sum+=points;
                        }
                        if(power == 'Q'){
                            int points = 4*12;
                            sum+=points;
                        }
                        if(power == 'K'){
                            int points = 4*13;
                            sum+=points;
                        }
                        if(power == 'A'){
                            int points = 4*14;
                            sum+=points;
                        }

                        break;
                    case 'H':
                        if(power == '2'){
                            int points = 3*2;
                            sum+=points;
                        }
                        if(power == '3'){
                            int points = 3*3;
                            sum+=points;
                        }
                        if(power == '4'){
                            int points = 3*4;
                            sum+=points;
                        }
                        if(power == '5'){
                            int points = 3*5;
                            sum+=points;
                        }
                        if(power == '6'){
                            int points = 3*6;
                            sum+=points;
                        }
                        if(power == '7'){
                            int points = 3*7;
                            sum+=points;
                        }
                        if(power == '8'){
                            int points = 3*8;
                            sum+=points;
                        }
                        if(power == '9'){
                            int points = 3*9;
                            sum+=points;
                        }
                        if(power == '1'){
                            int points = 3*10;
                            sum+=points;
                        }
                        if(power == 'J'){
                            int points = 3*11;
                            sum+=points;
                        }
                        if(power == 'Q'){
                            int points = 3*12;
                            sum+=points;
                        }
                        if(power == 'K'){
                            int points = 3*13;
                            sum+=points;
                        }
                        if(power == 'A'){
                            int points = 3*14;
                            sum+=points;
                        }
                        break;
                    case 'D':
                        if(power == '2'){
                            int points = 2*2;
                            sum+=points;
                        }
                        if(power == '3'){
                            int points = 2*3;
                            sum+=points;
                        }
                        if(power == '4'){
                            int points = 2*4;
                            sum+=points;
                        }
                        if(power == '5'){
                            int points = 2*5;
                            sum+=points;
                        }
                        if(power == '6'){
                            int points = 2*6;
                            sum+=points;
                        }
                        if(power == '7'){
                            int points = 2*7;
                            sum+=points;
                        }
                        if(power == '8'){
                            int points = 2*8;
                            sum+=points;
                        }
                        if(power == '9'){
                            int points = 2*9;
                            sum+=points;
                        }
                        if(power == '1'){
                            int points = 2*10;
                            sum+=points;
                        }
                        if(power == 'J'){
                            int points = 2*11;
                            sum+=points;
                        }
                        if(power == 'Q'){
                            int points = 2*12;
                            sum+=points;
                        }
                        if(power == 'K'){
                            int points = 2*13;
                            sum+=points;
                        }
                        if(power == 'A'){
                            int points = 2*14;
                            sum+=points;
                        }
                        break;
                    case 'C':
                        if(power == '2'){
                            int points = 1*2;
                            sum+=points;
                        }
                        if(power == '3'){
                            int points = 1*3;
                            sum+=points;
                        }
                        if(power == '4'){
                            int points = 1*4;
                            sum+=points;
                        }
                        if(power == '5'){
                            int points = 1*5;
                            sum+=points;
                        }
                        if(power == '6'){
                            int points = 1*6;
                            sum+=points;
                        }
                        if(power == '7'){
                            int points = 1*7;
                            sum+=points;
                        }
                        if(power == '8'){
                            int points = 1*8;
                            sum+=points;
                        }
                        if(power == '9'){
                            int points = 1*9;
                            sum+=points;
                        }
                        if(power == '1'){
                            int points = 1*10;
                            sum+=points;
                        }
                        if(power == 'J'){
                            int points = 1*11;
                            sum+=points;
                        }
                        if(power == 'Q'){
                            int points = 1*12;
                            sum+=points;
                        }
                        if(power == 'K'){
                            int points = 1*13;
                            sum+=points;
                        }
                        if(power == 'A'){
                            int points = 1*14;
                            sum+=points;
                        }
                        break;
                }
            }
            if(!map.containsKey(arr1[0])){
                map.put(arr1[0], sum);
            }
            else{
                int currentSum = map.get(arr1[0])+sum;
                map.put(arr1[0], currentSum);
            }

            input = scanner.nextLine();
        }
        for (Map.Entry<String, Integer> s : map.entrySet()) {
            System.out.printf("%s: %d%n",s.getKey(),s.getValue());
        }

    }
}
