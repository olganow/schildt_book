package chapter5;


// Демонстрация работы continue.
class Continue {
    public static void main(String[] args) {
        for(int i=0; i<10; i++) {
            System.out.print(i + " ");
            if (i%2 == 0) continue;
            System.out.println(" ");
        }
    }
}
/*
Что демонстрирует код (оператор continue):
Оператор continue прерывает текущую итерацию цикла и переходит к следующей, пропуская оставшийся код в теле цикла.

Выполнение:
Для каждого i от 0 до 9 выводится i и пробел
Если i четный (i%2 == 0), срабатывает continue → пропускается System.out.println(" ")
Если i нечетный, continue не срабатывает → выполняется System.out.println(" ") (перевод строки)*/
