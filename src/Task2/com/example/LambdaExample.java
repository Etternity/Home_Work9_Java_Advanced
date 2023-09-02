package Task2.com.example;
import java.util.ArrayList;
import java.util.List;

public class LambdaExample {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add((int) (Math.random() * 100));
        }

        System.out.println("Список чисел: " + numbers);

        numbers.stream()
                .map(num -> num * num)
                .forEach(System.out::println);

        int sumOfSquares = numbers.stream()
                .map(num -> num * num)
                .reduce(0, Integer::sum);

        System.out.println("Сума квадратів усіх елементів: " + sumOfSquares);
    }
}
