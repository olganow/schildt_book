package chapter7;

/*

abs() в Java — это встроенный метод, который возвращает абсолютное значение (модуль) числа,
то есть неотрицательное значение числа без учета знака.

Метод abs() находится в классе Math и перегружен для разных числовых типов:
public static int abs(int a)
public static long abs(long a)
public static float abs(float a)
public static double abs(double a)
*/
public class AbsDemo {
    public static void main(String[] args) {
        int a = -10;
        long  b = 500000000;
        double c = -3.14;

        System.out.println(Math.abs(a));      // 10
        System.out.println(Math.abs(b));      // 500000000;
        System.out.println(Math.abs(c));      // 3.14
        System.out.println(Math.abs(0));      // 0
    }
}
