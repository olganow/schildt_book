package chapter7;

// Эта программа не скомпилируется.
//стр 204

class Outer2 {
/*   int outer_x = 100;

    void test() {
        Inner inner = new Inner();
        inner.display();
    }
}

// Внутренний класс.
class Inner {
    int y = 10;    // переменная y является локальной для Inner
    void display() {
        System.out.println("display() : outer_x = " + outer_x);
    }
}

void show() {
    System.out.println(y); // ошибка, переменная y здесь неизвестна!
}

class InnerClassDemo {
    public static void main(String[] args) {
        Outer1 outer = new Outer1();
        outer.test();
    }*/
}
/*
Почему программа не скомпилируется (несколько ошибок):
Метод show() находится вне какого-либо класса (после закрытия класса Inner и перед классом InnerClassDemo)
В методе show() используется переменная y, которая объявлена в классе Inner, но метод show() не принадлежит классу Inner и не имеет к нему доступа
В классе Inner нет доступа к outer_x, потому что Inner объявлен как отдельный (внешний) класс, а не внутренний класс Outer3.
Чтобы это исправить, класс Inner должен быть определён внутри класса Outer3.*/
