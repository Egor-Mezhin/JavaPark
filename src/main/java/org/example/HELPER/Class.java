package org.example.HELPER;

public class Class {
    /**
     * <h1>Классы и обьекты классов.
     *
     * <p>В них можем записать переменные и методы чтобы взаимодействовать с классом
     * <p>Ниже представлен класс Human.
     */
    public static void main(String[] args){
        Human human = new Human(); // Создаем нашего человека
        human.name = "Иван"; // Меняем имя нашему человеку на Иван
        human.info(); // Выводим информацию по Ивану
        human.work(); // Отправляем Ивана на работу
        human.pivo(); // Даем ивану пиво
        human.pivo(); // Даем ивану пиво. Иван умер
        human.work(); // Отправляем Ивана на работу но иван умер и поэтому отказывается работать
        human.info(); // Выводим информацию по Ивану

        Human human1 = new Human(); // Создаем еще одного человека так как Иван Умер
        Human human2 = new Human(); // Создаем третьего человка
        human1.name = "Оля"; // Называем второго человека Оля
        human2.name = "Игорь"; // Называем третьего челоека Игорем

        human1.work(); // Второму челоеку говорим работать
        human2.pivo(); // Третьему человеку даем пиво

        human1.info(); // Выводим информацию по второму человеку
        human2.info(); // Выводим информацию по третьему человеку
    }
}

class Human { // Класс Человек
    String name; // Имя - не обозначено
    private int HP = 100; // Здоровье. По умолчанию 100. Модификатор Privat нужен чтобы его нельзя было изменить вручную

    private int money = 0; // Деньги

    void info(){
        System.out.println("\nИнформация по человеку");
        System.out.println("|Имя " + name);
        System.out.println("|Здоровье " + HP);
        System.out.println("|Деньги " + money);
        System.out.println();
    }
    void work(){ // Заставляем человека работать
        if (HP > 0){ // Если Здоровье больше 0
            System.out.printf("%s хорошо поработал и заработал 10 монет\n", name); // Сообщение о том что мы поработали
            money += 10; // Добавляем 10 монет
        }
        else { // Иначе
            System.out.printf("%s умер и не может выйти на работу\n", name); // Сообщение о том что мы не можем работать
        }
    }

    void pivo(){ // Заставляем человека выпить пиво
        if (HP - 50 > 0){ // Если здоровье человека - 50 больше нуля то
            System.out.printf("%s выпил пиво и потерял 50 здоровья\n", name); // Выводим сообщение о выпитом пиве
            HP -= 50; // Уменьшаем здоровье человека на 50 пунктов
        }
        else { // Иначе
            System.out.printf("%s Выпил очень много и умер\n", name); // Пишем сообщение о том то человек умер
            HP = 0; // Выравниваем здоровье до 0.
        }

    }
}
