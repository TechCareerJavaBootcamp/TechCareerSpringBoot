package springboot.com.techcareer.week4.Saturday.project.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import springboot.com.techcareer.week4.Saturday.project.entity.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {

}
