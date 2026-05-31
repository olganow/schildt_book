package chapter7;

/* В этой программе демонстрируется
   отличие между public и private.
   стр 197
*/

class Test5 {
    int a;        // стандартный доступ (package-private)
    public int b; // открытый доступ
    private int c; // закрытый доступ

    // методы для доступа к c
    void setc(int i) { // установить значение c
        c = i;
    }

    int getc() { // получить значение c
        return c;
    }
}

class AccessTest {
    public static void main(String[] args) {
        Test5 ob = new Test5();

        // Поступать так законно, т.к. к членам a и b разрешен прямой доступ.
        ob.a = 10;
        ob.b = 20;

        // Поступать так нельзя, т.к. возникнет ошибка.
        // ob.c = 100;    // Ошибка!

        // Получать доступ к члену c необходимо через его методы.
        ob.setc(100);    // нормально
        System.out.println("a, b и c: " + ob.a + " " + ob.b + " " + ob.getc());
    }
}