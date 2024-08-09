package springboot.com.techcareer.week4.Saturday.odev;

import jakarta.persistence.criteria.CriteriaBuilder;

import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class RentACarClient {

    public static final String CORPORATE = "Corporate";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Müşteri tipini girin: ");
            String customerType = scanner.next();
            if(customerType.equals("Corporate")){
                RentACarService rentACarService = new RentACarService(new CorporateCustomer());
                List<Car> carList = rentACarService.getCarList();
                for (Car car : carList) {
                    System.out.println("Aracın markası: " + car.getBrand());

                }
            }else {
                RentACarService rentACarService = new RentACarService(new IndividualCustomer());
                List<Car> carList = rentACarService.getCarList();
                for (Car car : carList) {
                    System.out.println("Aracın markası: " + car.getBrand());
                }
            }
        }
    }

    public static void main2(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Müşteri tipini girin: ");
            String customerType = scanner.next();
            RentACarService rentACarService = null;
            if (Objects.equals(customerType, CORPORATE)) {
                rentACarService = new RentACarService(new CorporateCustomer());
            } else {
                rentACarService = new RentACarService(new IndividualCustomer());
            }
            showCarBrand(rentACarService);
        }
    }

    private static void showCarBrand(RentACarService rentACarService) {
        List<Car> carList = rentACarService.getCarList();
        for (Car car : carList) {
            System.out.println("Aracın markası: " + car.getBrand());
        }
    }

}
