package springboot.com.techcareer.week4.Saturday.odev;

import java.util.ArrayList;
import java.util.List;

public class RentACarService {

    private static List<Car> carList;
    public Customer costumer;

    public RentACarService(Customer customer) {
        this();
        this.costumer = customer;
        //creatCarRepo();
    }

    public RentACarService() {
        creatCarRepo();
    }

    public List<Car> getCarList() {
        List<Car> rentCars = new ArrayList<>();
        for (Car car : carList) {
            if(costumer instanceof IndividualCustomer){
                if(car instanceof Hatchback || car instanceof Sedan){
                    rentCars.add(car);
                }
            } else {
                rentCars.add(car);
            }
        }
        return rentCars;
    }

    public void creatCarRepo(){
        carList = new ArrayList<>();

        SUV suv = new SUV();
        suv.setBrand("Mercedes");
        SUV suv2 = new SUV();
        suv2.setBrand("Fiat");

        Sedan sedan = new Sedan();
        sedan.setBrand("Skoda");
        Sedan sedan2 = new Sedan();
        sedan2.setBrand("Renault");

        Hatchback hatchback = new Hatchback();
        hatchback.setBrand("Volkswagen");
        Hatchback hatchback2 = new Hatchback();
        hatchback2.setBrand("Toyota");

        carList.add(suv);
        carList.add(suv2);
        carList.add(sedan);
        carList.add(sedan2);
        carList.add(hatchback);
        carList.add(hatchback2);
    }
}
