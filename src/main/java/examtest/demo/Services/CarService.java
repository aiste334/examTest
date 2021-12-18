package examtest.demo.Services;

import examtest.demo.DTOs.CarDTO;
import examtest.demo.Entities.Car;
import examtest.demo.Entities.Customer;
import examtest.demo.Repositories.CarRepo;
import examtest.demo.Repositories.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {
    private final CarRepo carRepo;
    private final CustomerRepo customerRepo;

    @Autowired
    public CarService(CarRepo carRepo, CustomerRepo customerRepo) {
        this.carRepo = carRepo;
        this.customerRepo = customerRepo;
    }

    public List<CarDTO> getCarsByBrand(String brand){
        List<Car> carList = carRepo.findCarsByBrand(brand);
        List<CarDTO> carDTOList = new ArrayList<>();
            for(Car car : carList){
                carDTOList.add(new CarDTO(car));
            }
            return carDTOList;
    }

    public List<CarDTO> getCarsByCustomer(Integer id){
        Customer customer = customerRepo.findCustomerByCustomerId(id);
        List<Car> carList = carRepo.findCarsByCustomer(customer);
        List<CarDTO> carDTOList = new ArrayList<>();
            for (Car car : carList){
                carDTOList.add(new CarDTO(car));
            }
            return carDTOList;
    }

}
