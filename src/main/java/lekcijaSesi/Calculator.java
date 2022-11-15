package lekcijaSesi;

public class Calculator {
    int result;


    public int add(int num1, int num2) {
        result = num1 + num2;
        return result;
    }

    //Method for subtraction
    public int substract(int num1, int num2) {
        result = num1 - num2;
        return result;
    }

    //Method for multiplication
    public int multiply(int num1, int num2) {
        result = num1 * num2;
        return result;
    }

    //Method for division
    public float divide(int num1, int num2) {
        result = num1 / num2;
        return result;

    }
}

