package chapter4;

class ByteShift {
    public static void main(String[] args) {
        byte a = 64, b;
        int i;

        i = a << 2;
        b = (byte) (a << 2);

        System.out.println("Первоначальное значение a: " + a);
        System.out.println("i и b: " + i + " " + b);
    }
}

/*
Что демонстрирует код:
a << 2 — сдвиг влево на 2 бита (умножение на 4)
i = a << 2 — результат сохраняется в int (значение 256)
b = (byte) (a << 2) — явное приведение к byte (происходит потеря старших битов, результат 0, так как 256 по модулю 256 даёт 0)
*/