package JavaAdvancedDefineClassExercise.P05CarSalesman.Main;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Engine> engines =new ArrayList<>();
        List<Car> cars = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
           String [] line =scanner.nextLine().split(" ");
           if(line.length==2){
               Engine engine = new Engine(line[0], line[1],"n/a" , "n/a");
               engines.add(engine);
           }
           else if(line.length==3){
               if(line[2].matches("\\d+")){
                   Engine engine =new Engine(line[0], line[1],line[2],"n/a");
                   engines.add(engine);
               }else{
                   Engine engine =new Engine(line[0], line[1],"n/a",line[2]);
                   engines.add(engine);

               }
           }
           else if(line.length==4){
               Engine engine = new Engine(line[0], line[1], line[2], line[3]);
               engines.add(engine);
           }

        }
        int m = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < m; i++) {
            String [] arr = scanner.nextLine().split(" ");
            Engine carEngine = engines.stream()
                    .filter(e -> e.model.equals(arr[1]))
                    .findFirst().get();


            if(arr.length==2){
                Car car = new Car(arr[0], carEngine,"n/a" , "n/a");
                cars.add(car);
            }
            else if(arr.length==3){
                if(arr[2].matches("\\d+")){
                    Car car = new Car(arr[0], carEngine,arr[2],"n/a");
                    cars.add(car);
                }else{
                    Car car = new Car(arr[0], carEngine,"n/a",arr[2]);
                    cars.add(car);


                }
            }
            else if(arr.length==4){
                Car car = new Car(arr[0], carEngine, arr[2], arr[3]);
                cars.add(car);
            }
        }

        for (Car car : cars) {
            System.out.println(car.model+":");
            System.out.println(car.engine.model+":");
            System.out.println("Power: "+ car.engine.power);
            System.out.println("Displacement: "+ car.engine.displacement);
            System.out.println("Efficiency: "+ car.engine.efficiency);
            System.out.println("Weight: "+ car.weight);
            System.out.println("Color: "+ car.color);
        }


    }
}
