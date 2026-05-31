package chapter7;

// Отображение всех аргументов командной строки.
//стр 209
class CommandLine {
    public static void main(String[] args) {
        for(int i = 0; i < args.length; i++) {
            System.out.println("args[" + i + "]: " + args[i]);
        }
    }
}
/*
Что демонстрирует код (аргументы командной строки):
Параметр String[] args в методе main позволяет передавать программе аргументы при запуске из командной строки.
*/
