package springboot.com.techcareer.week4.Saturday.project.dto.responseDto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CommentByProductResponseDto {

    private String text;
    private String customerName;
    private String productName;
}
