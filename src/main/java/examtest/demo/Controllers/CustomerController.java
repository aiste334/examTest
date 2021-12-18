package examtest.demo.Controllers;

import examtest.demo.DTOs.CustomerDTO;
import examtest.demo.Services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {
    CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService){this.customerService = customerService; }

    @GetMapping("/customer/{email}")
    CustomerDTO getCustomerByEmail(@PathVariable String email) { return customerService.getByEmail(email); }

}
