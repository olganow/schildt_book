package chapter5;

// В операторе switch операторы break необязательны.
class MissingBreak {
    public static void main(String[] args) {
        for(int i=0; i<12; i++)
            switch(i) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                    System.out.println("i меньше 5.");
                    break;
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    System.out.println("i меньше 10.");
                    break;
                default:
                    System.out.println("i больше или равно 10.");
            }
    }
}

/*

Что демонстрирует

код(проваливание case в switch):

Когда несколько case идут подряд без break, выполнение "проваливается" через них до первого встреченного break. Это позволяет объединять несколько значений для одинакового действия.
*/
