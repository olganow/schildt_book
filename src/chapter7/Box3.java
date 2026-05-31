package chapter7;

// Здесь класс Box3 позволяет один объект инициализировать другим.
class Box3 {
    double width;
    double height;
    double depth;

    // Обратите внимание на этот конструктор, который принимает объект типа Box3
    Box3(Box3 ob) { // передать объект конструктору
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    // Конструктор, используемый в случае указания всех размеров.
    Box3(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // Конструктор, применяемый в случае, если размеры вообще не указаны.
    Box3() {
        width = -1;   // использовать -1 для обозначения
        height = -1;  // неинициализированного
        depth = -1;   // объекта коробки
    }

    // Конструктор, используемый в случае создания объекта кубика.
    Box3(double len) {
        width = height = depth = len;
    }

    // Вычислить и возвратить объем.
    double volume() {
        return width * height * depth;
    }
}

class OverloadCons2 {
    public static void main(String[] args) {
        // Создать объекты коробок с применением различных конструкторов.
        Box3 mybox1 = new Box3(10, 20, 15);
        Box3 mybox2 = new Box3();
        Box3 mycube = new Box3(7);
        Box3 myclone = new Box3(mybox1); // создать копию объекта mybox1
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

        // Вычислить объем копии.
        vol = myclone.volume();
        System.out.println("Объем копии равен " + vol);
    }
}
/*
Что демонстрирует код (конструктор копирования):
В классе Box3 добавлен конструктор копирования — специальный конструктор, который принимает объект того же класса и
создаёт его точную копию.*/
