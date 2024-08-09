package springboot.com.techcareer.week4.Saturday.odev;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SUV extends Car {

    private int bagaj;

    @Override
    public double dailyRentPrice() {
        return 0;
    }
}
