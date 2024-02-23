package HW_7;


class ComplexDivision implements ComplexOperation {
    @Override
    public ComplexNumber operate(ComplexNumber num1, ComplexNumber num2) {
        return num1.divide(num2);
    }
}