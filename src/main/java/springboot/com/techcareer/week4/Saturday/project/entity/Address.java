package springboot.com.techcareer.week4.Saturday.project.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String street;

    @ManyToOne
    @JoinColumn(name = "customerId")
    private Customer customer;
}
