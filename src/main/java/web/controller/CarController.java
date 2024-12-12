package web.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class CarController {
    @Autowired
    private CarService carService;

    @GetMapping(value = "/cars")
    public String carPage(@RequestParam(value = "count", required = false) Integer count, Model model) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car(1, "BMW", 31321));
        cars.add(new Car(2, "AUDIO", 24242));
        cars.add(new Car(3, "PORCH", 53445));
        cars.add(new Car(4, "Lancer", 32533));
        cars.add(new Car(5, "Lotus", 12421));

        if (count == null) count = 0;
        cars = cars.stream().limit(count).collect(Collectors.toList());

        carService.numCars(cars);

        model.addAttribute("cars", cars);
        return "cars";
    }
}
