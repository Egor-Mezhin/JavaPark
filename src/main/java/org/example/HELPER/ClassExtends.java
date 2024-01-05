package org.example.HELPER;

public class ClassExtends {
    /**
     * Наследование классов
     * К примеру у нас есть классы Домашняя кошка и Дикий Медведь. Кошка умеет высоко прыгать, просить еду у хозяина. Медведь умеет спать всю зиму.
     * У каждого из этих классов будут свои методы. У кошки просить еду, У медведя впасть в спячку.
     * При этом у них есть много одинаковых действий:
     * Бежать, кушать, спать.
     * Чтобы нам не прописывать в каждом классе эти методы их нужно наследование
     * Мы можем создать 1 класс "Животные". Определить ему методы Бежать, кушать, спать
     * А классам Кошка и Медведь прикрепить все методы класса "Животные" а так же создать индивидуальные методы
     */

    public static void main(String[] args){
        Cat cat = new Cat(); // Создал кота
        cat.name = "Вася"; // Назвал кота Вася
        cat.run(); // заставил Васю бегать
        cat.askingFood(); // Вася просит еду

        System.out.println(); // Enter

        Bear bear = new Bear(); // Создал медведя
        bear.name = "Михалыч"; // Назвал медведя Михалыч
        bear.eating(); // Михалыч ест
        bear.hibernation(); // Михалыч впал в спячку
    }
}

class Animals { // Класс животные
    String name; // Имя животного
    void run (){ // Метод для бега
        System.out.printf("%s куда-то бежит\n", name);
    }

    void sleep(){ // Метод для сна
        System.out.printf("%s спит\n", name);
    }

    void eating() { // Метод Покушать
        System.out.printf("%s ест\n", name);
    }
}

class Cat extends Animals { // Класс кот. extends Animals - Наследует все методы и переменные от класса Animals
    void askingFood (){ // Метод просить еду
        System.out.printf("%s просит еду на улице\n", name);
    }
}
class Bear extends Animals{ // Класс медведь. extends Animals - Наследует все методы и переменные от класса Animals
    void hibernation (){ // Метод для спячки
        System.out.printf("%s впадает в спячку\n", name);
    }
}