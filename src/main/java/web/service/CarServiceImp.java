package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImp implements CarService {
    @Override
    public int numCars(List<Car> cars) {
        return cars.size();
    }
}
