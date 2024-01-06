package org.example.GameYana;
import java.util.Scanner;

public class Game {

    public static void main(String[] args){
        Human human = new Human("Егор");
        human.ory();
        human.hashCode();
    }

    public static void start(Human human){
        while (true){
            System.out.printf("Чем %s хочет заняться?\n" +
                            "1 - пойти на работу\n" +
                            "2 - сгонять выпить в бар\n" +
                            "3 - подлечиться\n" +
                            "4 - ознакомиться с инфой\n"
                    ,human.getName());

            Scanner scan = new Scanner(System.in); // создает экземпляр класса Scanner кот отвечает за ввод данных с консоли
            int answer = scan.nextInt(); // nextInt работает с типом данных int

            switch (answer){
                case 1 -> human.work();
                case 2 -> human.pivo();
                case 3 -> human.hospital();
                case 4 -> human.info();
            }
        }
    }
}

class Human implements Test{ // Класс Человек
    private String name; // Имя - не обозначено
    private int HP = 100; // Здоровье. По умолчанию 100. Модификатор Privat нужен чтобы его нельзя было изменить вручную
    private int money = 0; // Деньги


    public Human(String name) {
        this.name = name;

    }

    String getName(){
        return name;
    }

    void info() {
        System.out.println("\nИнформация по человеку");
        System.out.println("| Имя " + name);
        System.out.println("| Здоровье " + HP);
        System.out.println("| Деньги " + money);
        System.out.println();
    }

    void work() { // Заставляем человека работать
        if (HP > 50) { // Если Здоровье больше 50
            System.out.printf("%s хорошо поработал и заработал 15 монет, однако продуктивная работа утомляет и отняла 10 жизней :(\n", name); // Сообщение о том что мы поработали
            money += 15;// Добавляем 15 монет
            HP -= 10; // Продуктивная работа утомляет
        }
        else if (HP == 0) { // чел умер какая работа але
            System.out.printf("%s помер, какая работа, але\n", name); // Сообщение о том что мы не можем работать
        }
        else {
            System.out.printf("%s притомился, может стоит подлечиться или отдохнуть в баре?\nПодсказка: 1 - работать, 2 - больница, 3- бар\n", name);
            Scanner scan = new Scanner(System.in); // создает экземпляр класса Scanner кот отвечает за ввод данных с консоли
            int answer = scan.nextInt();

            while (answer != 1 & answer != 2 & answer != 3) {
                System.out.println("Подумайте лучше.\n" +
                        "Подсказка: 1 - работать, 2 - больница, 3 - бар\n");
                answer = scan.nextInt();
            }

            switch (answer) {
                case 2 -> hospital();
                case 3 -> pivo();
                case 1 -> littleHpWork();
            }
        }
    }

    private void littleHpWork(){
        System.out.printf("%s трудоголик, скоро умрет на работе(минус 20 жизней), зато заработал несчастные 10 копеек\n", name); // Сообщение о том что мы поработали
        money += 10;// Добавляем 15 монет
        HP -= 20; // Продуктивная работа утомляет
        if (HP <= 0) {
            HP = 0;
            hospital();
        }
    }

    void pivo() { // Заставляем человека выпить пиво
        if (HP - 50 > 0) { // Если здоровье человека - 50 больше нуля то
            System.out.printf("%s выпил пиво и потерял 50 здоровья\n", name); // Выводим сообщение о выпитом пиве
            HP -= 50; // Уменьшаем здоровье человека на 50 пунктов
        }
        else { // Иначе
            System.out.printf("%s выпил очень много и умер\n", name); // Пишем сообщение о том то человек умер
            HP = 0; // Выравниваем здоровье до 0.
        }

    }

    void hospital() {
        if (HP == 0) {
            System.out.printf("Здоровье снизилось до 0 и %s отправили в больницу :((( \n", name); // printf не переносит автоматически строчку, поэтому ставим \n
            HP += 50;
            System.out.println("Здоровье повысилось на 50, далее необходимо заплатить 10 монет за дополнительные 50 жизней.");
        }
        else if (HP >= 1 & HP < 100) {

            System.out.println("Чтобы повысить здоровье до 100, необходимо заплатить 10 монет. \nЖелаете продолжить?\nПодсказка: да или нет\n");
            Scanner scan = new Scanner(System.in); // создает экземпляр класса Scanner кот отвечает за ввод данных с консоли
            String answer = scan.nextLine(); // дает возможность писать ответ с консоли

            while (!answer.equals("да") & !answer.equals("нет")) {
                System.out.println("Подумайте лучше.\nПодсказка: да или нет\n ");
                answer = scan.nextLine();
            }

            if (answer.equals("да") & money>=10 ) {
                money -= 10;
                HP = 100;
                System.out.printf("%s купил доп. услуги у больницы за 10 монет. Итого здоровье полностью восстановлено. \n", name);
            }
            else if (answer.equals("нет")) {
                System.out.printf("%s зажмотил 10 монет и ушел из больницы со здоровьем %d.\n", name, HP);

            }
            else {
                System.out.printf("%s бомжара,вали отсюда, чтобы без деняк не приходил, чмо\n", name);
            }

        }
        else {
            System.out.println("У вас максимальное здоровье, пиздуйте пить пиво и возвращайтесь :-))) ");
        }

    }

//    public void ory(){
//        System.out.println("ОЧЕНЬ СИЛЬНО ОРУ");
//    }
}


