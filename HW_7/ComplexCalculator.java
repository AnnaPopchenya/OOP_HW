package HW_7;


class ComplexCalculator {
    private Logger logger;

    public ComplexCalculator(Logger logger) {
        this.logger = logger;
    }

    public ComplexNumber calculate(ComplexOperation operation, ComplexNumber num1, ComplexNumber num2) {
        logger.log("Выполнение операции: " + operation.getClass().getSimpleName() + " на " + num1 + " и " + num2);
        return operation.operate(num1, num2);
    }
}
