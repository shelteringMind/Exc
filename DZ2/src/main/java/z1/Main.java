package z1;

import java.util.Scanner;

//Задача 1:Напишите программу, которая запрашивает у пользователя число и проверяет,
//        является ли оно положительным. Если число отрицательное или равно нулю,
//        программа должна выбрасывать исключение InvalidNumberException с сообщением
//        "Некорректное число". В противном случае, программа должна выводить сообщение
//        "Число корректно".

public class Main {
    public static void main(String[] args) throws InvalideNumberException {
        Scanner scanner = new Scanner(System.in);
        boolean end = false;
        System.out.println("Введите число: ");
        int num = scanner.nextInt();
        correctNumber(num);
        scanner.close();
    }

    public static void correctNumber(int num) {
        if (num <= 0) {
            throw new ArithmeticException("Некорректное число!");
        }
        System.out.println("Число корректно!");
    }

}
