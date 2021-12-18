package examtest.demo.Entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "car", schema = "examtestschema")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "car_id", nullable = false, length = 10)
    private int carId;
    @Basic
    @Column(name = "brand", nullable = false, length = 20)
    private String brand;
    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;

    public Car(String brand, Customer customer) {
        this.brand = brand;
        this.customer = customer;
    }
}
