package chapter6;

public class Box7 {
    double width;
    double height;
    double depth;

    // Это конструктор для Box.
    Box7(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // Вычислить и возвратить объем.
    double volume() {
        return width * height * depth;
    }
}