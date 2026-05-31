package chapter5;


// Использование break в качестве "цивилизованной" формы перехода в стиле "goto"
class Break {
    public static void main(String[] args) {
        boolean t = true;

        first: {
            second: {
                third: {
                    System.out.println("Перед оператором break.");
                    if(t) break second; // выйти из блока second
                    System.out.println("Этот оператор не выполнится.");
                }
                System.out.println("Этот оператор не выполнится.");
            }
            System.out.println("После блока second.");
        }
    }
}
/*
Что демонстрирует код (меченный break):
В Java есть форма break с меткой, которая позволяет выйти не только из текущего цикла, но и из любого помеченного блока кода.
Исправления в коде:


Выполнение:
Выводится "Перед оператором break."
if(t) break second; — так как t = true, происходит выход из блока с меткой second
Пропускаются все операторы в блоках third и second
Выполнение продолжается после блока second
*/
