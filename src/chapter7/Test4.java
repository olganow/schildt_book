package chapter7;

// Возвращение объекта.
class Test4 {
    int a;

    Test4(int i) {
        a = i;
    }

    Test4 incrByTen() {
        Test4 temp = new Test4(a + 10);
        return temp;
    }
}

class RetOb {
    public static void main(String[] args) {
        Test4 ob1 = new Test4(2);
        Test4 ob2;

        ob2 = ob1.incrByTen();
        System.out.println("ob1.a: " + ob1.a);
        System.out.println("ob2.a: " + ob2.a);

        ob2 = ob2.incrByTen();
        System.out.println("ob2.a после второго увеличения: " + ob2.a);
    }
}
/*
Что демонстрирует код (возвращение объекта из метода):

Метод incrByTen() создаёт новый объект Test4 со значением a + 10 и возвращает его.

        Выполнение:

ob1 = new Test4(2) → ob1.a = 2
ob2 = ob1.incrByTen() → создаётся объект с a = 12, ob2 ссылается на него

        ob2 = ob2.incrByTen() → создаётся новый объект с a = 22, ob2 теперь ссылается на него
        */
