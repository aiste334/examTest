package examtest.demo.Repositories;

import examtest.demo.Entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepo  extends JpaRepository<Customer, Integer> {
    Customer findCustomerByEmail(String email);
    Customer findCustomerByCustomerId(Integer id);
    //List<Customer> findAllCustomers();
}
