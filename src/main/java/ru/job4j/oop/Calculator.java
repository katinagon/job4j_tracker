package ru.job4j.oop;

public class Calculator {
    private static int x = 5;

    public static int sum(int a) {
        return x + a;
    }

    public int multiply(int a) {
        return x * a;
    }

    public static int minus(int a) {
        return a - x;
    }

    public int divide(int a) {
        return a / x;
    }

    public int sumAllOperation(int a) {
        return sum(a) + minus(a) + multiply(a) + divide(a);
    }

    public static void main(String[] args) {
        int a = 15;
        System.out.println(sum(a));
        System.out.println(minus(a));
        Calculator result = new Calculator();
        System.out.println(result.multiply(a));
        System.out.println(result.divide(a));
        System.out.println(result.sumAllOperation(a));
    }
}
