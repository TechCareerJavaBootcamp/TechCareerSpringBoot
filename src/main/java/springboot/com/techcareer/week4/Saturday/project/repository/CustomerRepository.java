package springboot.com.techcareer.week4.Saturday.project.repository;

import org.springframework.data.repository.CrudRepository;
import springboot.com.techcareer.week4.Saturday.project.entity.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
}
