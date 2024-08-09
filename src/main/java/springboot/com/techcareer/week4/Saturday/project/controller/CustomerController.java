package springboot.com.techcareer.week4.Saturday.project.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springboot.com.techcareer.week4.Saturday.project.dto.requestDto.CustomerSaveRequestDto;
import springboot.com.techcareer.week4.Saturday.project.service.CustomerService;

@RestController
@RequestMapping("/customer")
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService customerService;

    @PostMapping("/saveCustomer")
    public ResponseEntity<Boolean> saveCustomer(@RequestBody CustomerSaveRequestDto customerSaveRequestDto) {
        boolean isSaveCustomer = customerService.saveCustomer(customerSaveRequestDto);
        return new ResponseEntity<>(isSaveCustomer, HttpStatus.OK);
    }

}
