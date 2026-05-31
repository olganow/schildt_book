package chapter5;

// Использование break для выхода из цикла while.
class BreakLoop2 {
    public static void main(String[] args) {
        int i = 0;

        while(i < 100) {
            if(i == 10) break; // прекратить выполнение цикла, если i равно 10
            System.out.println("i: " + i);
            i++;
        }

        System.out.println("Цикл завершен.");
    }
}
/*
Что демонстрирует код (break в цикле while):
Оператор break работает одинаково во всех типах циклов (for, while, do-while).

Выполнение:
Цикл while рассчитан на выполнение, пока i < 100
Когда i становится равным 10, срабатывает break
Цикл немедленно прекращается, даже не достигая проверки условия i < 100
*/
