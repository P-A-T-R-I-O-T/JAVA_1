

public class function {
    // Функции
    public  static void main(String[] args) {
//    info("Hello");                //  Обращаемся к функции info и передаём параметры
//    String jara = "JAVA";
//    info(jara);                //  Обращаемся к функции info и передаём параметры в виде ранее созданной переменной
//
//
//    short n = 3;
//    summa((short) 54, (short) 34);      //  Обращаемся к функции summa и передаём параметры
//    //      Название параметров в обращаемой функции может не совпадать с названием переменной, это норм
//    summa((short) 12, n);               //  Обращаемся к функции summa и передаём параметры
//
//     int rezult = summa((short) 12, (short) 10); // В переменную rezult мы помещаем, то что функция summa возвращвет (что прописана в return)
//     info(String.valueOf(rezult));      // Обратились к функции info, но так как она принимает в себя только строки, преоброзовываем переменную rezult с типом int в тип str

        byte[] num1 = new byte[]{4, 2, 8};
        int res10 = summarna(num1);
        info(String.valueOf(res10));

    }

    public static int summarna(byte[] arr){
        int summa = 0;
        for(byte i = 0; i < arr.length; i ++)
            summa +=arr[i];
        return summa;
    }


    public static void info(String word){       // Создали функцию которая принимает в себя только строки с названием параметра word
        System.out.print(word);
        System.out.println("!");
    }

    public static int summa(short a, short b){     //      Создали функцию которая принимает в себя только тип данных short с двумя параметрами. И может возратить INT
    int rezultat = a + b;
    String strrezultat = "Результат" + rezultat;       //Создали переменную, типом строки и записали в неё страку и значение int
    info(strrezultat);              //  Передали в функцию info строку strrezultat
    System.out.println(rezultat);
    return rezultat;         //обязательно нужно прописывать return, если функция, что нибудь возращает. ВА данном случае она возращает переменную rezultat
    }

}
