package chapter6;

public class Box6 {
    double width;
    double height;
    double depth;

    // Это конструктор для Box.
    Box6() {
        System.out.println("Конструирование Box");
        width = 10;
        height = 10;
        depth = 10;
    }

    // Вычислить и возвратить объем.
    double volume() {
        return width * height * depth;
    }
}