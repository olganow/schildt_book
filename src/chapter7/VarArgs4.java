package chapter7;

// Аргументы переменной длины, перегрузка и неоднозначность.
//
// Эта программа содержит ошибку и не скомпилируется!
class VarArgs4 {
    static void vaTest(int ... v) {
        System.out.print("vaTest(int ...): " +
                "Количество аргументов: " + v.length +
                " Содержимое: ");
        for(int x : v)
            System.out.print(x + " ");
        System.out.println();
    }

    static void vaTest(boolean ... v) {
        System.out.print("vaTest(boolean ...): " +
                "Количество аргументов: " + v.length +
                " Содержимое: ");
        for(boolean x : v)
            System.out.print(x + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        vaTest(1, 2, 3);           // Нормально
        vaTest(true, false, false); // Нормально
 //       vaTest();                   // Ошибка: Неоднозначность!
    }
}
/*
Почему возникает ошибка неоднозначности:
Вызов vaTest() без аргументов неоднозначен, потому что:
Он может соответствовать vaTest(int ... v) (пустой массив int)
Он может соответствовать vaTest(boolean ... v) (пустой массив boolean)
Компилятор не может определить, какой из перегруженных методов вызвать.
*/
