package HW_7;


class ComplexMultiplication implements ComplexOperation {
    @Override
    public ComplexNumber operate(ComplexNumber num1, ComplexNumber num2) {
        return num1.multiply(num2);
    }
}