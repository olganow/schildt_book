package chapter7;

// Использование выведения типов локальных переменных
// с пользовательским классом.
class MyClass {
    private int i;

    MyClass(int k) { i = k; }

    int geti() { return i; }
    void seti(int k) { if(k >= 0) i = k; }
}

class RefVarDemo {
    public static void main(String[] args) {
        var mc = new MyClass(10); // Обратите внимание на применение var.

        System.out.println("Значение i в mc теперь равно " + mc.geti());
        mc.seti(19);
        System.out.println("Значение i в mc теперь равно " + mc.geti());
    }
}
/*
Что демонстрирует код (выведение типов с var):

Ключевое слово var (начиная с Java 10) позволяет компилятору автоматически определять тип локальной переменной на
основе инициализатора.В данном примере:
var mc = new MyClass(10); — компилятор определяет, что mc имеет тип MyClass
Код эквивалентен: MyClass mc = new MyClass(10);*/
