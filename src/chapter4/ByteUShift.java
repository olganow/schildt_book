package chapter4;

// Беззнаковый сдвиг вправо значения типа byte.
class ByteUShift {
    static public void main(String[] args) {
        char[] hex = {
                '0', '1', '2', '3', '4', '5', '6', '7',
                '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'
        };
        byte b = (byte) 0xff;
        byte c = (byte) (b >> 4);
        byte d = (byte) (b >>> 4);  // вероятно, здесь должен быть беззнаковый сдвиг
        byte e = (byte) ((b & 0xff) >> 4);

        System.out.println("    b = 0x"
                + hex[(b >> 4) & 0x0f] + hex[b & 0x0f]);  // исправлено: & 0x0f вместо & 0xff
        System.out.println("    b >> 4 = 0x"
                + hex[(c >> 4) & 0x0f] + hex[c & 0x0f]);  // исправлено
        System.out.println("    b >>> 4 = 0x"
                + hex[(d >> 4) & 0x0f] + hex[d & 0x0f]);  // исправлено
        System.out.println("(b & 0xff) >> 4 = 0x"
                + hex[(e >> 4) & 0x0f] + hex[e & 0x0f]);  // исправлено
    }
}

/*

Ключевая идея: чтобы выполнить беззнаковый сдвиг для byte, нужно сначала расширить его до int
с помощью маски & 0xff.
*/
