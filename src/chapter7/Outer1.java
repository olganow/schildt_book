package chapter7;

// Демонстрация работы с внутренним классом.
// стр 204
class Outer1 {
    int outer_x = 100;

    void test() {
        Inner inner = new Inner();
        inner.display();
    }

    // Внутренний класс.
    class Inner {
        void display() {
            System.out.println("display() : outer_x = " + outer_x);
        }
    }
}

class InnerClassDemo {
    public static void main(String[] args) {
        Outer1 outer = new Outer1();
        outer.test();
    }
}
/*
Что демонстрирует код (внутренний класс):
Внутренний (non-static nested) класс Inner определён внутри класса Outer1.

Особенности внутреннего класса:
Внутренний класс имеет доступ ко всем переменным и методам внешнего класса, включая private
Для создания объекта внутреннего класса сначала нужен объект внешнего класса (в данном случае создание происходит внутри метода test() внешнего класса)
Inner inner = new Inner(); — корректно внутри нестатического метода внешнего класса
*/
