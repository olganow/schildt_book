package chapter7;

// Простой пример использования рекурсии.
class Factorial {
    // Рекурсивный метод.
    int fact(int n) {
        int result;

        if(n == 1) return 1;
        result = fact(n - 1) * n;
        return result;
    }
}

class Recursion {
    public static void main(String[] args) {
        Factorial f = new Factorial();

        System.out.println("Факториал 3 равен " + f.fact(3));
        System.out.println("Факториал 4 равен " + f.fact(4));
        System.out.println("Факториал 5 равен " + f.fact(5));
    }
}
/*
Что демонстрирует код (рекурсия):
Рекурсия — это способность метода вызывать сам себя. Метод fact(int n) вычисляет факториал числа n! = n × (n-1) × ... × 1.

Как работает рекурсия для fact(3):
fact(3) → вызывает fact(2)
fact(2) → вызывает fact(1)
fact(1) → возвращает 1 (базовый случай)
fact(2) → возвращает 1 × 2 = 2
fact(3) → возвращает 2 × 3 = 6*/
