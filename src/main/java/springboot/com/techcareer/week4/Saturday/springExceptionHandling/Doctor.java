package springboot.com.techcareer.week4.Saturday.springExceptionHandling;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table()
public class Doctor {

    @Id
    private Long id;

    private String name;

    private String tckn;

}
