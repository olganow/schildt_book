package chapter5;

// Использование continue с меткой.
class ContinueLabel {
    public static void main(String[] args) {
        outer: for (int i=0; i<10; i++) {
            for(int j=0; j<10; j++) {
                if(j > i) {
                    System.out.println();
                    continue outer;
                }
                System.out.print(" " + (i * j));
            }
        }
        System.out.println();
    }
}
/*
Что демонстрирует код (меченный continue):
Оператор continue outer прерывает текущую итерацию внутреннего цикла и продолжает со следующей итерации внешнего цикла с меткой outer.

Выполнение:
Для каждой строки i выводятся произведения i * j, где j от 0 до i
Когда j > i, выводится перевод строки и continue outer переходит к следующему i
Получается нижняя треугольная матрица (включая диагональ)
*/
