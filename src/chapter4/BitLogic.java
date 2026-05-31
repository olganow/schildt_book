package chapter4;

// Демонстрация работы побитовых логических операций.
class BitLogic {
    public static void main(String[] args) {
        String[] binary = {
                "0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111",
                "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111"
        };
        int a = 3; // 0 + 2 + 1 или 0011 в двоичной форме
        int b = 6; // 4 + 2 + 0 или 0110 в двоичной форме
        int c = a | b; //| — побитовое ИЛИ
        int d = a & b; //& — побитовое И
        int e = a ^ b; //^ — побитовое исключающее ИЛИ (XOR)
        int f = (~a & b) | (a & ~b);
        int g = ~a & 0x0f;
        System.out.println("    a = " + binary[a]);
        System.out.println("    b = " + binary[b]);
        System.out.println("    a|b = " + binary[c]);
        System.out.println("    a&b = " + binary[d]);
        System.out.println("    a^b = " + binary[e]);
        System.out.println("~a&b|a&~b = " + binary[f]);
        System.out.println("    ~a = " + binary[g]);
    }
}

/*
Что демонстрирует код:
| — побитовое ИЛИ
& — побитовое И
^ — побитовое исключающее ИЛИ (XOR)
~ — побитовое НЕ (инверсия)
& 0x0f — маскирование для сохранения только младших 4 бит

Результат для a=3 (0011) и b=6 (0110):
a|b = 0111 (7)
a&b = 0010 (2)
a^b = 0101 (5)

~a&b | a&~b = 0101 (5) — то же самое, что XOR

~a с маской = 1100 (12)
*/
