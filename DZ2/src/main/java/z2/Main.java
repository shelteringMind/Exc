package z2;
//Задача 2:Напишите программу, которая запрашивает у пользователя два числа
//        и выполняет их деление. Если второе число равно нулю,
//        программа должна выбрасывать исключение DivisionByZeroException с сообщением
//        "Деление на ноль недопустимо". В противном случае,
//        программа должна выводить результат деления.
//        Обратите внимание, что в обоих задачах используются собственные исключения,
//        которые наследуются от класса Exception.
//        Это позволяет нам определить специфическую причину ошибки
//        и передать информацию об ошибке для последующей обработки.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int a = scan.nextInt();
        System.out.println("Введите второе число: ");
        int b = scan.nextInt();
        divide(a,b);
    }

    public static void divide(int num1, int num2){
        if (num2 == 0) {
            throw new ArithmeticException("Деление на ноль недопустимо!");
        }
        int result = num1 / num2;
        System.out.println(result);
    }
}
