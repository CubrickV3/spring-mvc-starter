package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImp implements CarDao {

    @Override
    public List<Car> numCars(Integer count) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car(1, "BMW", 31321));
        cars.add(new Car(2, "AUDIO", 24242));
        cars.add(new Car(3, "PORCH", 53445));
        cars.add(new Car(4, "Lancer", 32533));
        cars.add(new Car(5, "Lotus", 12421));

        if (count == null) count = cars.size();
        cars = cars.stream().limit(count).collect(Collectors.toList());

        return cars;
    }
}
