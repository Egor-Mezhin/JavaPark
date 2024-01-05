package org.example.DECISION;

public class Less1 {
    /**
     * <h1>Задача 1
     * <p>Вам дан вложеный массив данных [[1 2 3][4 5 6][7 8 9]]
     * <p>Ваша задача вывести в консоль массив.
     * <ol>
     *     <li>Если число четное и меньше 5 то вместо числа должен стоять -
     *     <li>Если число нечетное и больше 6 то вместо числа должен стоять +
     * </ol>
     *
     * <p>Ответ должен выглядить так:
     *    <p>
     *     1 - 3
     *    <br>- 5 6
     *    <br>+ 8 +
     *    </p>
     *    <p></p>
     *    <h2>Подсказка_1: Чтобы проверить четное ли число можно использовать:</h2>
     *
     *    <br>int x = 2
     *    <br>x % 2 - Выдает остаток от деления. 2 / 2 будет 1. Остаток 0. Так как остаток 0 то число четное
     *
     *    <br><br>int y = 3
     *    <br>y % 3 = 1,5. Остаток 0,5. Так как остаток не равен 0 то число не четное
     *
     *    <br><br>В условных выражениях можно использовать:
     *    <br>if (x % 2 == 0){Выражение} // Если остаток x от деления на 2 равен 0 то условие соблюдается
     *    <p></p>
     *    <h2>Подсказка_2: Чтобы перебрать вложеный массив int[][] в итераторе нужно указать int[]</h2>
     *
     *    <br>int[][] num = {{1,2,3},{4,5,6},{7,8,9}}
     *
     *    <br><br>for(int[] i: num){Выражение} // Теперь итератор i будет равнятся массиву. Но все еще не числу. В певрой итерации i будет равнятся {1, 2, 3}
     */
    public static void main(String[] args){
        int[][] numbers = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
        String x = "s";
        if (!x.equals("e")){
            System.out.println(1);
        }
    }
}
