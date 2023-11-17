

public class cycles {
    public  static void main(String[] args) {
        // Циклы
        // Создали переменную float, задали условик пока i больше или равно 8 и шак деления
        for (int i = 5; i <= 45; i += 2){
            if (i % 3 == 0)
                continue; // При условии if мы пропускаем и идём дальше
            if (i >= 33)
                break; // Создаём дополнительное условие для выхода из цикла
            System.out.println("Element: " + i);
        }



        int i = 1;



        while (i < 10){
            System.out.println("Element: " + i);
            i ++;
        }

        do { // При этом цикле код выполняется 1 раз, а только паотом проверяется на условие цикла
            System.out.println("Элемент: " + i);
            i --;
        }while (i > 0);

    }
}
