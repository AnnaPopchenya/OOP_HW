package HW_7;


public class Main {
    public static void main(String[] args) {
        Logger logger = new Logger();
        ComplexCalculator calculator = new ComplexCalculator(logger);

        ComplexNumber num1 = new ComplexNumber(2, 3);
        ComplexNumber num2 = new ComplexNumber(1, 2);

        ComplexOperation addition = new ComplexAddition();
        ComplexOperation multiplication = new ComplexMultiplication();
        ComplexOperation division = new ComplexDivision();

        ComplexNumber sum = calculator.calculate(addition, num1, num2);
        ComplexNumber product = calculator.calculate(multiplication, num1, num2);
        ComplexNumber quotient = calculator.calculate(division, num1, num2);

        System.out.println("Сумма: " + sum);
        System.out.println("Произведение: " + product);
        System.out.println("Частное: " + quotient);
    }
}