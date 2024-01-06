package org.example.HELPER;

public class Constructor {
    public static void main(String[] args){
        Car car = new Car();

        System.out.println("Модель машины - "+ car.model);
        System.out.println("Материал машины - " + car.material);
        System.out.println("Производитель машины - " + car.proizvoditel);
        System.out.println("Вес машины - " + car.ves);

    }
}

class Car {
    String model;
    String ves;
    String material;
    String proizvoditel;
}
