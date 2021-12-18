package examtest.demo.DTOs;

import com.fasterxml.jackson.annotation.JsonInclude;
import examtest.demo.Entities.Customer;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CustomerDTO {

    Integer customerId;
    String lastName;
    String email;

    public CustomerDTO(Customer customer){
        this.customerId = customer.getCustomerId();
        this.lastName = customer.getLastName();
        this.email = customer.getEmail();
    }
}
