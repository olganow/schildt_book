package chapter7;

// Демонстрация работы с объектами String.
//стр 205
class StringDemo {
    public static void main(String[] args) {
        String strOb1 = "Первая строка";
        String strOb2 = "Вторая строка";
        String strOb3 = strOb1 + " и " + strOb2;

        System.out.println(strOb1);
        System.out.println(strOb2);
        System.out.println(strOb3);
    }
}
/*
Что демонстрирует код (конкатенация строк):
Класс String в Java поддерживает:
Создание строк с помощью двойных кавычек
Объединение (конкатенацию) строк с помощью оператора +
*/
