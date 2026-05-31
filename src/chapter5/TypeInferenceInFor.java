package chapter5;

// Использование выведения типов локальных переменных в цикле for.
class TypeInferenceInFor {
    public static void main(String[] args) {
        // Применить выведение типов к переменной управления циклом.
        System.out.print("Значения x: ");
        for(var x = 2.5; x < 100.0; x = x * 2)
            System.out.print(x + " ");
        System.out.println();

        // Применить выведение типов к переменной итерации.
        int[] nums = { 1, 2, 3, 4, 5, 6 };
        System.out.print("Значения в массиве nums: ");
        for(var v : nums)
            System.out.print(v + " ");
        System.out.println();
    }
}
/*
Что демонстрирует код (выведение типов var в циклах for):
Начиная с Java 10, ключевое слово var позволяет компилятору автоматически определять тип переменной на основе контекста.
Первый цикл (традиционный for):

var x = 2.5 — компилятор определяет тип double

        Цикл выполняется, пока x < 100.0, на каждой итерации x = x * 2

Второй цикл (for-each):
var v : nums — так как nums имеет тип int[], переменная v получает тип int
*/
