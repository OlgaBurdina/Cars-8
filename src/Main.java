import com.company.details.Engine;
import com.company.professions.Driver;
import com.company.vehicles.Car;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("w", "F", 100, new Driver("Иванов","Иван", "Петрович", 15), new Engine(106, "Renault"));

        ArrayList<Car> cars = new ArrayList<>();

        cars.add(car1);
        cars.forEach(System.out :: println);
        car1.StartCar();
        car1.StopCar();
        car1.TurnLeft();
        car1.TurnRight();
    }
}