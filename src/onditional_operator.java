

import java.util.Scanner;

public class onditional_operator {
    public static void main(String[] args) {

        // Условные операторы
        /*
        int a = 21, b = 25;
        char sim1 = 'A', sim2 = 'a';
        boolean isHasCar = false; //у владельцап машины НЕТ



        if (a > b) { // >, <, ==, <=, >=, !=,
            System.out.println("ДА, верно цыфры : a > b");
        }

        // Если после проверки выполняется 1 строчка кода фигурные скобки {} можно не делать
        if (sim1 == sim2)
            System.out.println("ДА, вепно char sim1 != sim2");
        else if (a == b)
            System.out.println("ДА, верно цыфры : a == b");
        else
            System.out.println("Нет, не верно: char sim1 != sim2");


        if (!isHasCar) // ровнозначна этой запииси: isHasCar == false
            System.out.println("ДА, вепно: у владельцап машины НЕТ");

        // или ||, и &&
        if (isHasCar || a >= b) // Выполняется 2 условие
            System.out.println("Проверка двух условий или или");
        else if (isHasCar && a == b || sim1 != sim2)
            System.out.println("Проверка трёх условий одновременно");
         */

//        Scanner scan1 = new Scanner(System.in);
//
//        System.out.print("Введите роль: ");
//        String rol = scan1.nextLine();
//
//        System.out.print("Введите пароль: ");
//        String pass = scan1.nextLine();
//
//
//
//        if (rol.equals("Admin") && pass.equals("1")) // метод equals сравнивает только строки
//            System.out.print("Все пользователи: ");
//        else
//            System.out.println("Привет " + rol);


//        Условный оператор switch-case
//        System.out.print("Введите число: ");
//        Scanner scanne = new Scanner(System.in);
//        int num = scanne.nextInt();
//        switch (num) {
//            case 1:
//                System.out.println("Проверка на: 1");
//                break;
//            case 2:
//                System.out.println("Проверка на: 2");
//                break;
//            default:
//                System.out.print("Проверка не удалась успехам");
//        }
        Scanner scanner = new Scanner(System.in); // создаём переменную scanner и вывделяем место под неё для вывода см клавиатуры
        System.out.print("Введите первое число: ");
        int num1 = scanner.nextInt(); // Присваеваем переменной num1 из переменной scanner

        System.out.print("Введите второе число: ");
        int num2 = scanner.nextInt(); // Присваеваем переменной num2 из переменной scanner

        int rees; // Создали пустую переменную для записи результата.

        System.out.print("Что нужнго делать? ");
        String action = scanner.nextLine(); // создали тип переменной String и присваеваем переменной action из переменной scanner
        action = scanner.nextLine();  // Дублируем предыдущую сторочку из-за бага в JAVA

        switch (action) {
            case "+":
                rees = num1 + num2;
                System.out.print("Результат: " + rees);
                break;
            case "-":
                rees = num1 - num2;
                System.out.print("Результат: " + rees);
                break;
            case "*":
                rees = num1 * num2;
                System.out.print("Результат: " + rees);
                break;
            case "/":
                if (num2 == 0)
                    System.out.println("На ноль делить нельзя");
                else {
                    rees = num1 / num2;
                    System.out.print("Результат: " + rees);
                }
                break;
            default:
                System.out.print("Вы ввели что-то не то!");
        }
    }
}