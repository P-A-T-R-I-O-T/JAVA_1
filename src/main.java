
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class main {
    public  static void main(String[] args) {
        // Работа с print и println
        //sout ENTER выводит: System.out.println();
//        System.out.println("1) Привет мир!");
//        System.out.print("2) Привет ");
//        System.out.print("мир");
//        System.out.print("!");
//        System.out.println("\n3) Привет мир!");
//        System.out.println("\t4) Привет мир!");
//        System.out.println("5) \"Привет мир!\"");
//        System.out.println("6) \\Привет мир!\\");

        /*
        типы данных
        byte -- от -128 до 127 и занимает 1 байт
        short -- от -32 768 до 32 767 и занимает 2 байта
        int -- от -2 147 483 648 до 2 147 483 647 и занимает 4 байт
        long -- от -9 223 372 836 854 775 808 до 9 223 372 836 854 775 807 и занимает 8 байт
        float -- число с точкой в конце символ f
        double -- в двое больше чисел после точки нежели float по желанию можно написать символ d в конец
        char -- символ в одинарные ' '
        String -- строка в двоыные " "
        boolean -- возвращает true или false
        */
//        int age = 50;
//        float  nomer1 = 1.1f;
//        double numer2 = 1.11111111111;
//        char ch = 'c';
//
//        String name = "Вася";
//        System.out.println("Возрост:" + age);
//        System.out.println(nomer1);
//        System.out.println(numer2);
//        System.out.println(ch);
//        System.out.println(name);


        /*
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите ваше имя");
        String user_name = scan.nextLine(); // nextLine -- с клавиатуры вводится// nextLine -- с клавиатуры вводится строка
        System.out.println("Привет, " + user_name);
        */


        // для кажджого типа данных есть свой: next
        /*
        short num1 = 50, num2 = 3;
        int rezultat = num1 + num2; // остаток от деления: %
        rezultat = num1 * num2;
        rezultat = num1 / num2;
        rezultat = num1 - num2;
        rezultat -=21;
        rezultat ++;
        System.out.println("результат: " + rezultat);
        */



        // простенький калькулятор
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число 1: ");
        float num1 = scan.nextFloat();

        System.out.print("Введите число 2: ");
        float num2 = scan.nextFloat();

        float rezultat1 = num1 - num2;
        float rezultat2 = num1 + num2;
        float rezultat3 = num1 / num2;
        float rezultat4 = num1 * num2;
        System.out.println("Результат: ");
        System.out.println("Вычитание: " + rezultat1 + "\n" +"Сложение: " + rezultat2 + "\n" +"Деление: " + rezultat3 + "\n" +"Умножение: " + rezultat4);




    }
}
