package chapter4;

// Демонстрация работы ++.
class IncDec {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c;
        int d;
        c = ++b;
        d = a++;
        c++;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
    }
}

/*
код демонстрирует разницу между префиксным (++b) и постфиксным (a++) инкрементом:
++b — сначала увеличивает b (было 2, стало 3), затем присваивает c
a++ — сначала присваивает d значение a (1), затем увеличивает a до 2
c++ — увеличивает c (было 3, стало 4)
*/
