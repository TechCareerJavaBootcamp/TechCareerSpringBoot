package springboot.com.techcareer.week4.Saturday.project.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String name;

    @Column
    private String lastName;

    // kaldırıp test edelim.
    @OneToMany(mappedBy = "customer")
    private List<Address> address;
}
