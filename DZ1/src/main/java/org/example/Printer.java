package org.example;

class Answer {
    public static void arrayOutOfBoundsException() {
        // Напишите свое решение ниже
        Integer[] array = new Integer[5];
        array[5] = 5;
    }

    public static void divisionByZero() {
        // Напишите свое решение ниже
        Integer x = 5;
        Integer y = 0;
        Integer result = x/y;
    }

    public static void numberFormatException() {
        // Напишите свое решение ниже
        Integer.parseInt("null");
    }
}

public class Printer {
    public static void main(String[] args) {
        Answer ans = new Answer();
        try {
            ans.arrayOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Выход за пределы массива");
        }

        try {
            ans.divisionByZero();
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль");
        }

        try {
            ans.numberFormatException();
        } catch (NumberFormatException e) {
            System.out.println("Ошибка преобразования строки в число");
        }
    }
}