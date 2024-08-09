package springboot.com.techcareer.week4.Saturday.project.service;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import springboot.com.techcareer.week4.Saturday.project.dto.requestDto.ProductSaveRequestDto;
import springboot.com.techcareer.week4.Saturday.project.entity.Product;
import springboot.com.techcareer.week4.Saturday.project.repository.ProductRepository;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;
    @Qualifier("mMapper")
    private final ModelMapper modelMapper;

    public Boolean saveProduct(ProductSaveRequestDto productSaveRequestDto) {
        Product product = modelMapper.map(productSaveRequestDto, Product.class);
        productRepository.save(product);
        return true;
    }
}
