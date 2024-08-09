package springboot.com.techcareer.week4.Saturday.odev;


import lombok.*;

@Getter
@Setter
@EqualsAndHashCode
@ToString
@AllArgsConstructor
@NoArgsConstructor
public abstract class Car {

    private String brand;
    private String model;
    private int age;
    private FuelType FuelType;

    public abstract double dailyRentPrice();

}
