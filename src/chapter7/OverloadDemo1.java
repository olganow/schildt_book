package chapter7;

// Демонстрация перегрузки методов.
class OverloadDemo1 {
    void test() {
        System.out.println("Параметры отсутствуют");
    }

    // Перегрузить test() для одного целочисленного параметра.
    void test(int a) {
        System.out.println("a: " + a);
    }

    // Перегрузить test() для двух целочисленных параметров.
    void test(int a, int b) {
        System.out.println("a и b: " + a + " " + b);
    }

    // Перегрузить test() для одного параметра типа double.
    double test(double a) {
        System.out.println("double a: " + a);
        return a * a;
    }
}

class Overload {
    public static void main(String[] args) {
        OverloadDemo1 ob = new OverloadDemo1();
        double result;

        // Вызвать все версии test().
        ob.test();
        ob.test(10);
        ob.test(10, 20);
        result = ob.test(123.25);
        System.out.println("Результат вызова ob.test(123.25): " + result);
    }
}
/*
Что демонстрирует код (перегрузка методов):
Перегрузка позволяет иметь несколько методов с одинаковым именем, но разными параметрами (количество, тип или порядок). Компилятор определяет, какую версию вызывать, по аргументам.
*/
