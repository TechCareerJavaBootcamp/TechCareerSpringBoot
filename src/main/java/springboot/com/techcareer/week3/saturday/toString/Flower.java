package springboot.com.techcareer.week3.saturday.toString;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import springboot.com.techcareer.week3.saturday.studentProject.entity.Student;

@Getter
@Setter
@EqualsAndHashCode
public class Flower extends Student {

    private String name;

    private  String number;

}
