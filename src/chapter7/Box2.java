package chapter7;

/* Здесь в классе Box2 определены три конструктора для инициализации
размеров объекта коробки различными способами.
*/

class Box2 {
    double width;
    double height;
    double depth;

    // Конструктор, используемый в случае указания всех размеров.
    Box2(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // Конструктор, применяемый в случае, если размеры вообще не указаны
    Box2() {
        width = -1;    // использовать -1 для обозначения
        height = -1;   // не инициализированного
        depth = -1;    // объекта коробки
    }

    // Конструктор, используемый в случае создания объекта кубика.
    Box2(double len) {
        width = height = depth = len;
    }

    // Вычислить и возвратить объем.
    double volume() {
        return width * height * depth;
    }
}

class OverloadCons{
    public static void main(String[] args) {
        // Создать объекты коробок с применением различных конструкторов.
        Box2 mybox1 = new Box2(10, 20, 15);
        Box2 mybox2 = new Box2();
        Box2 mycube = new Box2(7);
        double vol;

        // Вычислить объем первой коробки.
        vol = mybox1.volume();
        System.out.println("Объем mybox1 равен " + vol);

        // Вычислить объем второй коробки.
        vol = mybox2.volume();
        System.out.println("Объем mybox2 равен " + vol);

        // Вычислить объем кубика.
        vol = mycube.volume();
        System.out.println("Объем mycube равен " + vol);
    }
}

/*
Что демонстрирует код (перегрузка конструкторов):
Класс Box2 имеет три перегруженных конструктора, что позволяет создавать объекты разными способами:*/
