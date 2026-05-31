package chapter6;

public class Box5 {
    double width;
    double height;
    double depth;

    // Вычислить и возвратить объем.
    double volume() {
        return width * height * depth;
    }

    // Установить размеры коробки.
    void setDim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
}