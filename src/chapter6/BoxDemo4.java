package chapter6;

public class BoxDemo4 {
    public static void main(String[] args) {
        Box4 mybox1 = new Box4();
        Box4 mybox2 = new Box4();
        double vol;

        // Присвоить значения переменным экземпляра mybox1.
        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;

        /* Присвоить переменным экземпляра mybox2 другие значения. */
        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;

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
Метод volume() теперь не выводит результат, а возвращает его с помощью return.
Тип возвращаемого значения указан перед именем метода (double)
*/
