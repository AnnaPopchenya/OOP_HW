package HW_7;

import java.util.Objects;


class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public ComplexNumber add(ComplexNumber num) {
        return new ComplexNumber(this.real + num.real, this.imaginary + num.imaginary);
    }

    public ComplexNumber multiply(ComplexNumber num) {
        double newReal = this.real * num.real - this.imaginary * num.imaginary;
        double newImaginary = this.real * num.imaginary + this.imaginary * num.real;
        return new ComplexNumber(newReal, newImaginary);
    }

    public ComplexNumber divide(ComplexNumber num) {
        double denominator = num.real * num.real + num.imaginary * num.imaginary;
        double newReal = (this.real * num.real + this.imaginary * num.imaginary) / denominator;
        double newImaginary = (this.imaginary * num.real - this.real * num.imaginary) / denominator;
        return new ComplexNumber(newReal, newImaginary);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ComplexNumber that = (ComplexNumber) o;
        return Double.compare(that.real, real) == 0 &&
                Double.compare(that.imaginary, imaginary) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(real, imaginary);
    }

    @Override
    public String toString() {
        return real + " + " + imaginary + "i";
    }
}