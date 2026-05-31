package chapter4;

class OpBitEquals {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        a |= 4;
        b >>= 1;
        c <<= 1;
        a ^= c;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }
}
/*
Что демонстрирует код (составные операторы с побитовыми операциями):
a |= 4 → a = a | 4 (1 | 4 = 5)
b >>= 1 → b = b >> 1 (2 >> 1 = 1) — сдвиг вправо на 1 бит (деление на 2)
c <<= 1 → c = c << 1 (3 << 1 = 6) — сдвиг влево на 1 бит (умножение на 2)
a ^= c → a = a ^ c (5 ^ 6 = 3) — побитовое исключающее ИЛИ

*/
