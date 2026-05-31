package chapter5;

// Проверка, является ли число простым.
class FindPrime {
    public static void main(String[] args) {
        int num;
        boolean isPrime;

        num = 14;

        if(num < 2) isPrime = false;
        else isPrime = true;

        for(int i=2; i <= num/i; i++) {
            if((num % i) == 0) {
                isPrime = false;
                break;
            }
        }

        if(isPrime) System.out.println("является простым");
        else System.out.println("не является простым");
    }
}

/*
Что демонстрирует код (проверка простого числа):
Число 14 проверяется на простоту:
14 > 2, поэтому isPrime = true
Цикл проверяет делители от 2 до sqrt(14) (условие i <= num/i)
14 % 2 == 0 → делится на 2 → isPrime = false, выход из цикла
/
 */
