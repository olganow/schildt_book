package chapter4;
// Демонстрация работы булевых логических операций.
class BoolLogic {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        boolean c = a | b;
        boolean d = a & b;
        boolean e = a ^ b;
        boolean f = (!a & b) | (a & !b);
        boolean g = !a;
        System.out.println("    a = " + a);
        System.out.println("    b = " + b);
        System.out.println("    a|b = " + c);
        System.out.println("    a&b = " + d);
        System.out.println("    a^b = " + e);
        System.out.println("!a&b|a&!b = " + f);
        System.out.println("    !a = " + g);
    }
}
/*
Что демонстрирует код (логические операции над boolean):

Операция	Результат
a | b (ИЛИ)	true | false = true
a & b (И)	true & false = false
a ^ b (XOR)	true ^ false = true
!a & b | a & !b	эквивалентно XOR = true
 !a (НЕ)	!true = false
*/
