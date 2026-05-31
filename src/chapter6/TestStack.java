package chapter6;

class TestStack {
    public static void main(String[] args) {
        Stack mystack1 = new Stack();
        Stack mystack2 = new Stack();

        // Поместить несколько чисел в стек.
        for(int i=0; i<10; i++) mystack1.push(i);
        for(int i=10; i<20; i++) mystack2.push(i);

        // Извлечь эти числа из стеков.
        System.out.println("Стек в mystack1:");
        for(int i=0; i<10; i++)
            System.out.println(mystack1.pop());

        System.out.println("Стек в mystack2:");
        for(int i=0; i<10; i++)
            System.out.println(mystack2.pop());
    }
}
/*
Что демонстрирует код (использование класса Stack):
Класс TestStack демонстрирует работу двух независимых стеков (из предыдущего примера).

Выполнение:
Создаются два объекта Stack — mystack1 и mystack2

В mystack1 помещаются числа 0-9
В mystack2 помещаются числа 10-19
Затем из каждого стека извлекаются и выводятся элементы
*/
