package examtest.demo.Services;

import examtest.demo.DTOs.CustomerDTO;
import examtest.demo.Entities.Customer;
import examtest.demo.Repositories.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService {
    private final CustomerRepo customerRepo;

    @Autowired
    public CustomerService(CustomerRepo customerRepo) {
        this.customerRepo = customerRepo;
    }

    public CustomerDTO getByEmail(String email){
        return new CustomerDTO(customerRepo.findCustomerByEmail(email));
    }

//    public List<CustomerDTO> getAllCustomers(){
//        List<Customer> customerList = customerRepo.findAllCustomers();
//        List<CustomerDTO> customerDTOList = new ArrayList<>();
//            for (Customer customer : customerList){
//                CustomerDTO cDTO = new CustomerDTO(customer);
//                customerDTOList.add(cDTO);
//            }
//            return customerDTOList;
//    }

}

