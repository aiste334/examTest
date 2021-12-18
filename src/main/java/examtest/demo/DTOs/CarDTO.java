package examtest.demo.DTOs;

import com.fasterxml.jackson.annotation.JsonInclude;
import examtest.demo.Entities.Car;
import examtest.demo.Entities.Customer;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CarDTO {

    Integer carId;
    String brand;
    Customer customer;

    public CarDTO(Car car){
        this.carId = car.getCarId();
        this.brand = car.getBrand();
        this.customer = car.getCustomer();
    }
}
