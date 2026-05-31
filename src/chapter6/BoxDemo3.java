package chapter6;

public class BoxDemo3 {

    public static void main(String[] args) {
        Box3 mybox1 = new Box3();
        Box3 mybox2 = new Box3();

        // Присвоить значения переменным экземпляра mybox1.
        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;

        /* Присвоить переменным экземпляра mybox2 другие значения. */
        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;

        // Отобразить объем первой коробки.
        mybox1.volume();

        // Отобразить объем второй коробки.
        mybox2.volume();
    }
}
