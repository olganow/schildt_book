package chapter7;

class StaticDemo {
    static int a = 42;
    static int b = 99;
    static void callme() {
        System.out.println("a = " + a);
    }
}

class StaticByName {
    public static void main(String[] args) {
        StaticDemo.callme();
        System.out.println("b = " + StaticDemo.b);
    }
}
/*
Что демонстрирует код (доступ к статическим членам):
Статические методы и переменные принадлежат классу, а не отдельным объектам. Поэтому для доступа к ним не требуется создавать экземпляр класса.

Доступ к статическим членам:
StaticDemo.callme() — вызов статического метода через имя класса
StaticDemo.b — доступ к статической переменной через имя класса
*/
