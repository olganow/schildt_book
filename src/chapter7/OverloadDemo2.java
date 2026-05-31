package chapter7;

// При перегрузке применяется автоматическое преобразование типов
class OverloadDemo {
    void test() {
        System.out.println("Параметры отсутствуют");
    }

    // Перегрузить test() для двух целочисленных параметров.
    void test(int a, int b) {
        System.out.println("a и b: " + a + " " + b);
    }

    // Перегрузить test() для одного параметра типа double.
    void test(double a) {
        System.out.println("Внутри test(double) a: " + a);
    }
}

class Overload2 {
    public static void main(String[] args) {
        OverloadDemo ob = new OverloadDemo();
        int i = 88;

        ob.test();
        ob.test(10, 20);

        ob.test(i);    // будет вызываться test(double)
        ob.test(123.2); // будет вызываться test(double)
    }
}
/*
Что демонстрирует код (автоматическое преобразование типов при перегрузке):
Когда точного совпадения типов параметров нет, Java автоматически преобразует типы, выбирая наиболее подходящий метод.

Ключевой момент: ob.test(i) — переменная i имеет тип int. Поскольку метода test(int) нет (только test(int, int) и test(double)),
 Java преобразует int в double и вызывает test(double).
*/
