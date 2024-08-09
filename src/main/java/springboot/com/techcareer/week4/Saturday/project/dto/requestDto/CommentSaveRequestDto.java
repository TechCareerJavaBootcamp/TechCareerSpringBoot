package springboot.com.techcareer.week4.Saturday.project.dto.requestDto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CommentSaveRequestDto {

    private String text;
    private Long productId;
    private Long customerId;
}
