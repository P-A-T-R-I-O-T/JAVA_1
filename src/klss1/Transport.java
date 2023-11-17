package klss1;

public class Transport {        //Создал класс автомобили
    public Float speed;     //  Сделал для всех автомобилий скорость
    public int weight;      // Вес
    public String collor;       //  Цвет
    public byte[] coordinati;       //  Ночальные координаты

    public Transport(){

    }

    public void setValues(Float _speed, int _weight, String _collor, byte[] _coordinati){
        speed = _speed;
        weight = _weight;
        collor = _collor;
        coordinati = _coordinati;
    }
    public String getVelios() {
        String info = "Скорость объекта: " + speed + "\nВес: " + weight + "\nцвет: " + collor +".\n";       //  Создал информационнубю страку которая выводит все характеристики автомобиля
        String infoCoordinate = "Координаты: \n";       //  Для удобства отображения созданна данная строчка
        for(int i = 0; i < coordinati.length; i++) {        //  Данный цикл проходится по масиву и записывает все 3 точки координат (x; y; z;)
            infoCoordinate += coordinati[i] + "\n";
        }
        return info + infoCoordinate;   //  Функция возвращает все данные автомобиля
    }
}
