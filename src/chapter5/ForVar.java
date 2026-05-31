package chapter5;

// Части цикла for могут быть пустыми.
class ForVar {
    public static void main(String[] args) {
        int i;
        boolean done = false;

        i = 0;
        for( ; !done; ) {
            System.out.println("i равно " + i);
            if(i == 10) done = true;
            i++;
        }
    }
}
/*
Что демонстрирует код (пустые секции в цикле for):
В этом примере:
Секция инициализации пуста (переменная i инициализируется перед циклом)
Секция условия содержит !done
Секция итерации пуста (инкремент i++ выполняется внутри тела цикла)

Такая форма цикла for эквивалентна циклу while.
*/

