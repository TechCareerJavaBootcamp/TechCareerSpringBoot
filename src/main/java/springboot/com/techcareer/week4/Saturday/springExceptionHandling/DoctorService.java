package springboot.com.techcareer.week4.Saturday.springExceptionHandling;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service("drService")
@RequiredArgsConstructor
public class DoctorService {

    private final DoctorRepository doctorRepository;

    public String getDoctorNameById(Long id) {
        Doctor doctor = doctorRepository.findById(id).get();
        log.info("get doctor by id");
        return doctor.getName();
    }


    public String getDoctorNameById2(Long id) throws BusinessException {
        Doctor doctor = doctorRepository.findById(id).get();
        String doctorName = doctor.getName();
        if (!doctorName.startsWith("B")) {
            log.error("Veritabanında B ile başyan doktor yok");
            throw new BusinessException("B ile başlayan doktor bulunamadı.");
        }
        return doctorName;
    }


}
