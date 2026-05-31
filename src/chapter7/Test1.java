package chapter7;

// Объекты можно передавать методам.
class Test1 {
    int a, b;
    Test1(int i, int j) {
        a = i;
        b = j;
    }
    // Возвратить true, если объект o равен вызывающему объекту.
    boolean equalTo(Test1 o) {
        if(o.a == a && o.b == b) return true;
        else return false;
    }
}

class PassOb {
    public static void main(String[] args) {
        Test1 ob1 = new Test1(100, 22);
        Test1 ob2 = new Test1(100, 22);
        Test1 ob3 = new Test1(-1, -1);

        System.out.println("ob1 == ob2: " + ob1.equalTo(ob2));
        System.out.println("ob1 == ob3: " + ob1.equalTo(ob3));
    }
}
/*
Что демонстрирует код (передача объектов в методы):
Метод equalTo(Test1 o) принимает объект класса Test1 в качестве параметра и сравнивает его поля с полями текущего объекта.
*/
