package chapter6;


class BoxDemo7 {
    public static void main(String[] args) {
        // Объявить, разместить в памяти и инициализировать объекты Box.
        Box7 mybox1 = new Box7(10, 20, 15);
        Box7 mybox2 = new Box7(3, 6, 9);

        double vol;

        // Получить объем первой коробки.
        vol = mybox1.volume();
        System.out.println("Объем равен " + vol);

        // Получить объем второй коробки.
        vol = mybox2.volume();
        System.out.println("Объем равен " + vol);

    }
}
/*
Конструктор Box(double w, double h, double d) принимает параметры и инициализирует каждую коробку своими размерами.
*/
