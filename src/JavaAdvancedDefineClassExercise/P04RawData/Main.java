package JavaAdvancedDefineClassExercise.P04RawData;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Car1> fragile = new ArrayList<>();
        List<Car1> flamable = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String []line = scanner.nextLine().split(" ");
            Engine1 carEngine1 =new Engine1(Integer.parseInt(line[1]),Integer.parseInt(line[2]));
            Cargo carCargo = new Cargo(Integer.parseInt(line[3]), line[4]);
            Tires carTires = new Tires(Double.parseDouble(line[5]),Integer.parseInt(line[6]),
                    Double.parseDouble(line[7]),Integer.parseInt(line[8]),
                    Double.parseDouble(line[9]),Integer.parseInt(line[10]),
                    Double.parseDouble(line[11]),Integer.parseInt(line[12]));
            Car1 car = new Car1(line[0], carEngine1,carCargo,carTires);
            if(car.cargoOfCar.type.equals("fragile")&& car.tiresOfCar.tyre1Pressure<1 && car.tiresOfCar.tyre2Pressure<1&& car.tiresOfCar.tyre3Pressure<1&& car.tiresOfCar.tyre4Pressure<1){
                fragile.add(car);
            }
            if(car.cargoOfCar.type.equals("flamable") && car.engine1OfCar.power>250){
                flamable.add(car);
            }
        }
        String command = scanner.nextLine();
        if(command.equals("fragile")){
            fragile.stream()
                    .forEach(car1 -> System.out.println(car1.model));
        }
        else if(command.equals("flamable")){
            flamable.stream()
                    .forEach(car1 -> System.out.println(car1.model));
        }
    }
}
