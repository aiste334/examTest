package examtest.demo.Entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "customer", schema = "examtestschema")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id", nullable = false, length = 10)
    private int customerId;
    @Basic
    @Column(name = "last_name", nullable = false, length = 45)
    private String lastName;
    @Basic
    @Column(name = "email", nullable = false, length = 45)
    private String email;

    public Customer(String lastName, String email) {
        this.lastName = lastName;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customer_id=" + customerId +
                ", last_name='" + lastName + '\'' +
                ", email=" + email + '\'' +
                '}';
    }

}
