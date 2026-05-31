package chapter6;


class BoxDemo6 {
    public static void main(String[] args) {
        // Объявить, разместить в памяти и инициализировать объекты Box.
        Box6 mybox1 = new Box6();
        Box6 mybox2 = new Box6();

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
Что демонстрирует код (метод, возвращающий значение):
Конструктор Box() автоматически вызывается при создании объекта и инициализирует все коробки одинаковыми размерами (10×10×10).

*/
