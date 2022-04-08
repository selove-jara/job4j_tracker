package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public static int minus(int b) {
        return b - x;
    }

    public int multiply(int a) {
        return x * a;
    }

    public int divide(int a) {
        return a / x;
    }

    public int sumAllOperation(int a) {
        return sum(a) + minus(a) + multiply(a) + divide(a);
    }

    public static void main(String[] args) {
        int result = sum(5);
        System.out.println(result);
        int rslMinus = minus(4);
        System.out.println(rslMinus);
        Calculator calculator = new Calculator();
        int rslMultiply = calculator.multiply(5);
        System.out.println(rslMultiply);
        int rslDivide = calculator.divide(5);
        System.out.println(rslDivide);
        int rsl = calculator.sumAllOperation(7);
        System.out.println(rsl);
    }
}