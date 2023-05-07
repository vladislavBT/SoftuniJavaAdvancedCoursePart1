package JavaAdvancedDefineClassExercise.P04RawData;

public class Car1 {
    String model;
    Engine1 engine1OfCar;
    Cargo cargoOfCar;
    Tires tiresOfCar;

    public Car1(String model, Engine1 engine1OfCar, Cargo cargoOfCar, Tires tiresOfCar) {
        this.model = model;
        this.engine1OfCar = engine1OfCar;
        this.cargoOfCar = cargoOfCar;
        this.tiresOfCar = tiresOfCar;
    }
}
