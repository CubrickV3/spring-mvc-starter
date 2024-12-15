package web.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.List;

@Controller
public class CarController {
    @Autowired
    private CarService carService;

    @GetMapping(value = "/cars")
    public String carPage(@RequestParam(value = "count", required = false) Integer count, Model model) {

        List<Car> cars = carService.numCars(count);

        model.addAttribute("cars", cars);
        return "cars";
    }
}
