package chapter5;

// Использование цикла for в стиле "for-each" для прохода по многомерному массиву.
class ForEach3 {
    public static void main(String[] args) {
        int sum = 0;
        int[][] nums = new int[3][5];

        // Сохранить в nums ряд значений.
        for(int i = 0; i < 3; i++)
            for(int j = 0; j < 5; j++)
                nums[i][j] = (i+1)*(j+1);

        // Применить цикл for в стиле "for-each" для отбора
        // и суммирования значений.
        for(int[] x : nums) {
            for(int y : x) {
                System.out.println("Значение: " + y);
                sum += y;
            }
        }

        System.out.println("Сумма: " + sum);
    }
}
/*
Что демонстрирует код (for-each с многомерным массивом):
Для обхода многомерного массива используются вложенные циклы for-each:
Внешний цикл for(int[] x : nums) — каждый элемент nums является одномерным массивом int[]
Внутренний цикл for(int y : x) — перебирает элементы каждого одномерного массива
*/
