package examtest.demo.Controllers;

import examtest.demo.DTOs.CarDTO;
import examtest.demo.Services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CarController {
    CarService carService;

    @Autowired
    public CarController(CarService carService){this.carService = carService;}

    @GetMapping("/car/{brand}")
    List<CarDTO> getCarsByBrand(@PathVariable String brand){
        return carService.getCarsByBrand(brand);
    }

    @GetMapping("/cars/{id}")
    List<CarDTO> getCarsByCustomer(@PathVariable Integer id) { return carService.getCarsByCustomer(id); }

}
