package springboot.com.techcareer.week4.Saturday.project.service;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import springboot.com.techcareer.week4.Saturday.project.dto.requestDto.CustomerSaveRequestDto;
import springboot.com.techcareer.week4.Saturday.project.entity.Customer;
import springboot.com.techcareer.week4.Saturday.project.repository.CustomerRepository;

@Service
@RequiredArgsConstructor
public class CustomerService {

    private final CustomerRepository customerRepository;
    private final ModelMapper modelMapper;


    public Boolean saveCustomer(CustomerSaveRequestDto customerSaveRequestDto) {
        Customer customer = modelMapper.map(customerSaveRequestDto, Customer.class);
        customerRepository.save(customer);
        return true;

    }
}
