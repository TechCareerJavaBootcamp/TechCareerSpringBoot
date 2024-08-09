package springboot.com.techcareer.week4.Saturday.project.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import springboot.com.techcareer.week4.Saturday.project.dto.requestDto.CommentSaveRequestDto;
import springboot.com.techcareer.week4.Saturday.project.dto.responseDto.CommentByProductResponseDto;
import springboot.com.techcareer.week4.Saturday.project.entity.Comment;
import springboot.com.techcareer.week4.Saturday.project.repository.CommentRepository;
import springboot.com.techcareer.week4.Saturday.project.service.CommentService;

import java.util.List;

@RestController
@RequestMapping("/comment")
@RequiredArgsConstructor
public class CommentController {

    private final CommentService commentService;
    private final CommentRepository commentRepository;

    @PostMapping("/saveComment")
    public ResponseEntity<Comment> saveComment(@RequestBody CommentSaveRequestDto commentSaveRequestDto) {
        Comment comment = commentService.saveComment(commentSaveRequestDto);
        return new ResponseEntity<>(comment, HttpStatus.OK);
    }

    @GetMapping("/findAllCommentsByProductId")
    public ResponseEntity<List<CommentByProductResponseDto>> findAllCommentsByProductId(@RequestParam Long productId) {
        List<CommentByProductResponseDto> allCommentsByProductId = commentService.findAllCommentsByProductId(productId);
        return new ResponseEntity<>(allCommentsByProductId, HttpStatus.OK);
    }

    @DeleteMapping("/deleteCommentById")
    public ResponseEntity<Boolean> deleteCommentById(@RequestParam Long commentId) {
        Boolean bool = commentService.deleteCommentById(commentId);
        return new ResponseEntity<>(bool, HttpStatus.OK);
    }
}
