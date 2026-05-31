package chapter6;

// В этом классе объявляется объект типа Box.
class BoxDemo {
    public static void main(String[] args) {
        Box mybox = new Box();
        double vol;

        // Присвоить значения переменным экземпляра mybox
        mybox.width = 10;
        mybox.height = 20;
        mybox.depth = 15;

        // Вычислить объём коробки.
        vol = mybox.width * mybox.height * mybox.depth;

        System.out.println("Объем равен " + vol);
    }
}

/*
Что демонстрирует код (создание класса и объекта):
Класс BoxDemo содержит метод main, в котором:
Box mybox = new Box(); — создаётся объект (экземпляр) класса Box
Полям объекта присваиваются значения
*/
