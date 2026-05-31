package chapter5;

// Демонстрация работы цикла do-while.
class DoWhile {
    public static void main(String[] args) {
        int n = 10;

        do {
            System.out.println("Импульс номер " + n);
            n--;
        } while (n > 0);
    }
}
/*
Что демонстрирует код (цикл do-while):
В отличие от цикла while, цикл do-while сначала выполняет тело цикла, а затем проверяет условие. Это гарантирует хотя бы одно выполнение тела цикла.
*/
