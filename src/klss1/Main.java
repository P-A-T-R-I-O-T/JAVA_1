package klss1;

public class Main {
    public static void main(String[] args) {
        Transport bmw = new Transport();        // Создаётся уникальный автомобиль и выделяется под него памячть
        bmw.setValues(300.5f, 2500, "White", new byte[] {0, 0, 0});     // Тут функция setValues позволяет записать все данные автомобиля в 1 строчку
        String res1 = bmw.getVelios();      //  Записывает все данные автомобиля в виде строчки и помещает в отдельную переменную
        System.out.println(res1);       //  Выводит на экран переменную со всеми данными автомобиля

//        bmw.speed = 300.5f;
//        bmw.weight = 2500;
//        bmw.collor = "White";
//        bmw.coordinati = new byte[] {0, 0, 0};

        Transport truc = new Transport();       //  Создаётся второй уникальный автомобиль и так же выделяется под него память
        //     Вводятся все данные автомобиля
        truc.speed = 150.0f;
        truc.weight = 4000;
        truc.collor = "Red";
        truc.coordinati = new byte[] {100, 100, 0};

        String res2 = truc.getVelios();     //  Записывает все данные автомобиля в виде строчки и помещает в отдельную переменную
        System.out.println(res2);       //  Выводит на экран переменную со всеми данными автомобиля
    }
}