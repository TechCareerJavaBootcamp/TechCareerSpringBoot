package springboot.com.techcareer.week4.Saturday.odev;

import lombok.Data;

@Data
public class IndividualCustomer extends Customer{

    private String tckn;
    private String firstName;
    private String lastName;
}
