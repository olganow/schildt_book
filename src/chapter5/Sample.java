package chapter5;

class Sample {
    public static void main(String[] args) {
        int a, b;

        b = 4;
        for(a=1; a<b; a++) {
            System.out.println("a = " + a);
            System.out.println("b = " + b);
            b--;
        }
    }
}
/*
Что демонстрирует код (влияние изменения переменной цикла внутри тела):
В этом цикле обе переменные (a и b) изменяются:
a увеличивается на 1 на каждой итерации (a++)
b уменьшается на 1 внутри тела цикла (b--)
Условие a < b проверяется перед каждой итерацией.*/
