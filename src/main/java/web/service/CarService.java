package web.service;

import web.model.Car;

import java.util.List;

public class CarService {

    Car car1 = new Car("Lada", 4, "Black");
    Car car2 = new Car("BMW", 1, "Red");
    Car car3 = new Car("Mercedes", 15, "White");
    Car car4 = new Car("Ford", 9, "Grey");
    Car car5 = new Car("Honda", 4, "Yellow");

    List<Car> cars = List.of(car1, car2, car3, car4, car5);

    public List<Car> getFixNumberOfCars(int numb) {
        if (numb > cars.size()) {
            return cars;
        }
        return cars.subList(0, numb);
    }

}
