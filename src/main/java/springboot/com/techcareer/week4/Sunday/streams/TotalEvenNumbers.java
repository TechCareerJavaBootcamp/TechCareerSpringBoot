package springboot.com.techcareer.week4.Sunday.streams;

import java.util.Arrays;
import java.util.List;

public class TotalEvenNumbers {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        System.out.println(totalEvenNumbers(numbers));
        System.out.println(totalEvenNumbersStream(numbers));

    }

    public static int totalEvenNumbers(List<Integer> numbers) {
        int sum = 0;
        for (Integer number : numbers) {
            if (number % 2 == 0) {
                sum += number;
            }
        }
        return sum;
    }

    public static int totalEvenNumbersStream(List<Integer> numbers) {
        return numbers.stream()
                .filter(n -> n % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();
    }


}
