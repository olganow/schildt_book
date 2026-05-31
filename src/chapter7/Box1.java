package chapter7;

class Box1 {
    double width;
    double height;
    double depth;

    // Это конструктор для Box1.
    Box1(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // Вычислить и возвратить объем.
    double volume() {
        return width * height * depth;
    }
}

class OverloadBox {
    public static void main(String[] args) {
        //Box11 box1 = new Box11();
        Box1 box2 = new Box1(13, 34, 45);
    }
}
/*
Что делает этот код:
Класс Box1 представляет коробку с размерами:
Поля: width (ширина), height (высота), depth (глубина)
Конструктор: принимает три параметра и инициализирует поля объекта
Метод volume(): вычисляет и возвращает объём коробки
*/
