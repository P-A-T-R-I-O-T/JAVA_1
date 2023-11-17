

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;

public class сollection {

        public  static void main(String[] args) {
        //  Коллекция в Java (На подобе словорей в Pyton)
            ArrayList<Integer> number = new ArrayList<>();
            number.add(5);
            number.add(50);
            number.add(23);
            number.add(1, 77); // При таком дабовлении идёт по индексу идёт не перезапись существующие, а добавление с последующим смещением всех остальных
            number.remove(0);  //Удаляет по индексу


            System.out.println(number.size()); // Размерность коллекции
            System.out.println(number.get(2));  // Выводит элемент по индексу


            for(Integer i  : number) {
                System.out.println(i);
            }
            number.clear();  //Очистка коллекции

            //  Вторая коллекция максимально схожа с предыдущей, но команды добавления, удаления без смещения работает быстрей
            LinkedList<Float> num = new LinkedList<>();
            num.add(5.62f);
            num.add(11.2f);
            num.add(10.062f);
            num.add(7.6f);


            for(Float i : num){
                System.out.println(i);
            }
        }
}
