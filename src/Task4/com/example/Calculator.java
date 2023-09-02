package Task4.com.example;

import java.util.function.BinaryOperator;

public class Calculator {
    public static void main(String[] args) {
        BinaryOperator<Double> addition = (a, b) -> a + b;
        BinaryOperator<Double> subtraction = (a, b) -> a - b;
        BinaryOperator<Double> multiplication = (a, b) -> a * b;
        BinaryOperator<Double> division = (a, b) -> {
            if (b == 0) {
                throw new IllegalArgumentException("Ділення на нуль неможливе");
            }
            return a / b;
        };

        double num1 = 10.0;
        double num2 = 5.0;

        System.out.println("Додавання: " + performOperation(num1, num2, addition));
        System.out.println("Віднімання: " + performOperation(num1, num2, subtraction));
        System.out.println("Множення: " + performOperation(num1, num2, multiplication));
        System.out.println("Ділення: " + performOperation(num1, num2, division));
    }

    public static double performOperation(double num1, double num2, BinaryOperator<Double> operation) {
        return operation.apply(num1, num2);
    }
}
