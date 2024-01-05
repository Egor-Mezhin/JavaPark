package org.example.HELPER;

import java.util.*;

public class ArrayCollections {
    /**
     * Массивы и коллекции. Обьекты которые хранят много записей.
     */

    public static void main(String[] args){
        /**
         * Массивы
         */

        int[] nums = {1, 2, 3, 4, 5}; // Массив чисел от 1 до 5
        int[][] numss = {{1, 2, 3},{4, 5, 6},{7, 8, 9}}; // Массив содержащий 3 массива из 3-х чисел

        /**
         * ArrayList - Тоже самое что и массивы однако в нем не фиксируется колличество элементов
         */
        ArrayList<Integer> ints = new ArrayList<Integer>(); // []
        ints.add(1); // [1] Добавляет число
        ints.add(2); // [1, 2] Добавляет число
        ints.clear(); // [] Очищяет список
        ints.add(1); // [1]
        ints.add(10); // [1, 10]
        ints.set(0, 100); // [100, 10] Заменить позицию 0 на 100
        ints.remove(1); // [100] Удалить запись на позиции 1
        System.out.println("\nArrayList: " + ints);

        /**
         * Set - Список из только уникальных значений
         */

        TreeSet<String> states = new TreeSet<String>();
        states.add("Ваня"); // [Ваня]
        states.add("Ваня"); // [Ваня]
        states.add("Иван"); // [Ваня, Иван]
        System.out.println("\nSet: " + states);

        /**
         * Map - Это не коллекция. Map Это список в виде пары ключ: значение. Как Json файл
         */

        Map<Integer, String> maps = new HashMap<Integer, String>(); // Ключ Integer: Значение String
        maps.put(1, "Петя"); // {1=Петя}
        maps.put(2, "Саша"); // {1=Петя, 2=Саша}
        maps.put(4, "Миша"); // {1=Петя, 2=Саша, 4=Миша}
        maps.put(3, "Маша"); // {1=Петя,2=Саша, 3=Маша, 4=Миша}
        maps.put(1, "БИМБА"); // {1=БИМБА,2=Саша, 3=Маша, 4=Миша} 1 запись перезаписалась
        System.out.println("\nMap: " + maps);

    }
}
