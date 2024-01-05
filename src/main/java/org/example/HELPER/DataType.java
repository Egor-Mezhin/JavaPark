package org.example.HELPER;
import java.util.Scanner;

public class DataType {
    /**
     * Типы данных
     */
    public static void main(String[] args){


        String string1 = "Слово";
        boolean bool = true; // true/false Флаг определяющий Истина или Ложь

        byte byte1 = 3; // целое число от -128 до 127 и занимает 1 байт
        int int1 = 1; // целое число от -2147483648 до 2147483647 и занимает 4 байта
        long long1 = 5; // целое число от –9 223 372 036 854 775 808 до 9 223 372 036 854 775 807 и занимает 8 байт
        long long2 = 9223372036854775807L; // Если число супер большое то в конце ставь L
        double double1 = 8.5; // число с плавающей точкой от ±4.9*10^-324 до ±1.7976931348623157*10^308 и занимает 8 байт
        float float1 = 8.5F; // число с плавающей точкой от -3.4*1038 до 3.4*1038 и занимает 4 байта
        char char1 = 1; // одиночный символ в кодировке UTF-16 и занимает 2 байта, поэтому диапазон хранимых значений от 0 до 65535

        /**
         * Конкатенация строк
         */

        System.out.println(string1 + string1); // СловоСлово
        System.out.println(string1 + int1); // Слово1
        System.out.println(string1 + double1); // Слово8.5

        System.out.printf("%s -> %f -> %d", string1, double1, int1); // Слово -> 8,500000 -> 1
        System.out.println("\n"); // Опустится на строку ниже

        /**
         * Сравнение строк
         */
        System.out.println(int1 == 1); // 1 равно 1 true
        System.out.println(int1 == 2); // 1 равно 2 false
        System.out.println(int1 < 2); // 1 меньше 2 true
        System.out.println(int1 != 2); // 1 неравно 2 true
        System.out.println(int1 != 2); // 1 неравно 2 true

        /**
         * Ввод данных в консоль
         */

        Scanner in = new Scanner(System.in); // Создаем экземпляр класса для ввода в консоль
        System.out.print("Введи число: "); // Выводим в консоль предложение написать число
        int num = in.nextInt(); // Объявляем переменную num и записываем в нее то что ввели в консоль

        System.out.printf("Твое число: %d \n", num); // Выводим в консоль результат
    }
}
