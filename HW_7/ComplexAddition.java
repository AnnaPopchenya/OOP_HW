package HW_7;


class ComplexAddition implements ComplexOperation {
    @Override
    public ComplexNumber operate(ComplexNumber num1, ComplexNumber num2) {
        return num1.add(num2);
    }
}