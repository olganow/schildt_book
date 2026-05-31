package chapter5;

// Циклы могут быть вложенными.
class Nested {
    public static void main(String[] args) {
        int i, j;

        for(i=0; i<10; i++) {
            for(j=i; j<10; j++)
                System.out.print(".");
            System.out.println();
        }
    }
}
/*
Что демонстрирует код (вложенные циклы):
Внешний цикл i выполняется от 0 до 9 (10 итераций).
На каждой итерации внешнего цикла внутренний цикл j выполняется от текущего значения i до 9, выводя точки.
*/
