package chapter6;

public class Box3 {
    double width;
    double height;
    double depth;

    // Отобразить объем коробки.
    void volume() {
        System.out.print("Объем равен ");
        System.out.println(width * height * depth);
    }
}