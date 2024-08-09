package springboot.com.techcareer.week4.Saturday.project.service;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import springboot.com.techcareer.week4.Saturday.project.dto.requestDto.CommentSaveRequestDto;
import springboot.com.techcareer.week4.Saturday.project.dto.responseDto.CommentByProductResponseDto;
import springboot.com.techcareer.week4.Saturday.project.entity.Comment;
import springboot.com.techcareer.week4.Saturday.project.entity.Customer;
import springboot.com.techcareer.week4.Saturday.project.entity.Product;
import springboot.com.techcareer.week4.Saturday.project.repository.CommentRepository;
import springboot.com.techcareer.week4.Saturday.project.repository.CustomerRepository;
import springboot.com.techcareer.week4.Saturday.project.repository.ProductRepository;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CommentService {

    private final CommentRepository commentRepository;
    private final CustomerRepository customerRepository;
    private final ProductRepository productRepository;
    private final ModelMapper modelMapper;

    public Comment saveComment(CommentSaveRequestDto commentSaveRequestDto) {
        Comment comment = getComment(commentSaveRequestDto);
        commentRepository.save(comment);
        return comment;
    }

    private Comment getComment(CommentSaveRequestDto commentSaveRequestDto) {
        String text = commentSaveRequestDto.getText();
        Long customerId = commentSaveRequestDto.getCustomerId();
        Long productId = commentSaveRequestDto.getProductId();

        Customer customer = customerRepository.findById(customerId).get();
        Product product = productRepository.findById(productId).get();

        Comment comment = Comment.builder().text(text).customer(customer).product(product).build();
        return comment;
    }

    public List<CommentByProductResponseDto> findAllCommentsByProductId(Long productId) {
        List<Comment> commentList = commentRepository.findAllByProductId(productId);
        Product product = productRepository.findById(productId).get();
        List<CommentByProductResponseDto> commentDtoList = new ArrayList<>();

        for (Comment comment : commentList) {
            String text = comment.getText();
            String customerName = comment.getCustomer().getName();

            CommentByProductResponseDto commentByProductResponseDto = new CommentByProductResponseDto();
            commentByProductResponseDto.setText(text);
            commentByProductResponseDto.setCustomerName(customerName);
            commentByProductResponseDto.setProductName(product.getName());
            commentDtoList.add(commentByProductResponseDto);
        }
        return commentDtoList;
    }

    public Boolean deleteCommentById(Long commentId) {
        commentRepository.deleteById(commentId);
        return true;
    }
}
