

import java.util.Scanner;

public class arrays {
    public  static void main(String[] args) {
        // Массивы данных
//        int[] arrays = new int[5];  // Создал массив int[] под названием  arrays, потом выделили для неё память NEW, затем указали сколько элементов в ней будет [5]
//        arrays[0] = 45;         //ввадим в нулевой масив значение 45, по усмолчанию 0 стоит и т.д.
//        arrays[1] = 34;
//        arrays[2] = 10;
//        arrays[3] = 4;
//        arrays[4] = 15;
//        int resultat = arrays[2] + arrays[4]; // Создали переменную resultat и внесли туда результат сложение двух индексов
//        System.out.println(resultat);
//
//
//        float[] arrays1 = new float[] {5.1f, 21.012f, 2.01f};  // Создали пустой масив и сразу внесли туда данные через запятую
//        System.out.println(arrays1[1]);
//
//
//        // Перебираем весь массив
//        for (int i = 0; i < arrays.length; i ++){  // Создали переменную i и пока i меньше длины массива arrays (length длина массива) и прибовляем +1
//            System.out.println(arrays[i]);
//        }


//        int[] arr =  new int[4];  //Создали массив arr с дленой 4
//        Scanner input = new Scanner(System.in); // Создали переменную input для ввода с клавиатуры
//
//        for(int i = 0; i < arr.length; i++){   // Создали цикл for, в нём создали переменную i, выполняется пока i меньше длены массива, и  i +1
//            System.out.print("Введите числовые данные: ");
//            int value = input.nextInt();  // Создали переменную value в которую будет записан ввод с клавиатуры из переменной input
//            arr[i] = value; // обращаяясь по индексу, записываем значение из переменной value
//        }
//
//
//        //Проверка на минимальное значение в массиве
//        int min = 0;
//        for(int i = 0; i < arr.length; i++){
//            if(arr[i] <  min);  // Если в массиве arr по индексу i значение будет меньше чем заложено в переменной  min
//                min = arr[i];       //присваеваем в переменную min значение в индесе i
//        }
//        System.out.println("Минимальное значение: " + min);



        //Многомерные массивы
        char[][] sysy = new char[2][2];
        sysy[0][0] = 't';
        System.out.println(sysy[0][0]);

        byte[][] num = new byte[][]{
                {2, 5, 7},
                {1, 4, 8},
                {4, 2, 7},
                {3, 6, 9}
        };
        num[2][1] = 10;
        System.out.println(num[2][1]);

        // Работа с циклами нужно вкладывать внутри цикла столько сколько у вас мерность массивов
//        for()
//            for()
    }
}
