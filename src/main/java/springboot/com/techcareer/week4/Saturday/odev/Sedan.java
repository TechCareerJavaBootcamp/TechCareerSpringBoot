package springboot.com.techcareer.week4.Saturday.odev;

public class Sedan extends Car implements MonthlyRent{

    @Override
    public double dailyRentPrice() {
        return 0;
    }

    @Override
    public void monthlyRentPrice() {

    }
}