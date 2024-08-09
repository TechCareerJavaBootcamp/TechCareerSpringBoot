package springboot.com.techcareer.week4.Saturday.springExceptionHandling;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/doctor")
@RequiredArgsConstructor
public class DoctorController {

    @Qualifier("drService")
    private final DoctorService doctorService;

    @GetMapping("/getDoctorNameById")
    public ResponseEntity<String> getDoctorNameById(@RequestParam Long id) {
        String doctorNameById = doctorService.getDoctorNameById(id);
        return new ResponseEntity<>(doctorNameById, HttpStatus.OK);
    }

    @GetMapping("/getDoctorNameById2")
    public ResponseEntity<String> getDoctorNameById2(@RequestParam Long id) throws BusinessException {
        String doctorNameById = doctorService.getDoctorNameById2(id);
        return new ResponseEntity<>(doctorNameById, HttpStatus.OK);
    }

}
