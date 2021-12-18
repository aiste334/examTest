package examtest.demo.Repositories;

import examtest.demo.Entities.Car;
import examtest.demo.Entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarRepo extends JpaRepository<Car, Integer> {
    List<Car> findCarsByBrand(String brand);
    List<Car> findCarsByCustomer(Customer customerId);
}
