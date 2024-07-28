package springboot.com.techcareer.week3.saturday.studentProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import springboot.com.techcareer.week3.saturday.studentProject.entity.Student;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    // select * from student where name = ?
    List<Student> findAllByName(String name);

    //@Query(sql sorgusu)
   // List<Student> findByNameFirstCharA();
}
