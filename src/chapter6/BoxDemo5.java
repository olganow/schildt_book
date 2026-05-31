package chapter6;


class BoxDemo5 {
    public static void main(String[] args) {
        Box5 mybox1 = new Box5();
        Box5 mybox2 = new Box5();
        double vol;

        // Инициализировать объекты коробок.
        mybox1.setDim(10, 20, 15);
        mybox2.setDim(3, 6, 9);

        // Получить объем первой коробки.
        vol = mybox1.volume();
        System.out.println("Объем равен " + vol);

        // Получить объем второй коробки.
        vol = mybox2.volume();
        System.out.println("Объем равен " + vol);
    }
}
/*
Что демонстрирует код (метод, возвращающий значение):
Метод setDim(double w, double h, double d) принимает параметры и использует
 их для инициализации переменных экземпляра.
*/
