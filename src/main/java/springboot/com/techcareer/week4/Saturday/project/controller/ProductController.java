package springboot.com.techcareer.week4.Saturday.project.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springboot.com.techcareer.week4.Saturday.project.dto.requestDto.ProductSaveRequestDto;
import springboot.com.techcareer.week4.Saturday.project.service.ProductService;

@RestController
@RequestMapping("/product")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @PostMapping("/saveProduct")
    public ResponseEntity<Boolean> saveProduct(@RequestBody ProductSaveRequestDto productSaveRequestDto) {
        Boolean saveProduct = productService.saveProduct(productSaveRequestDto);
        return new ResponseEntity<>(saveProduct, HttpStatus.CREATED);
    }
}
