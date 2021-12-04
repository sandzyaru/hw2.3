package com.company;

import java.util.Random;

public class Main {
    /*
●	Написать метод в котором генерируется случайный возраст public static int generateRandomAge(){........}
●	При вызове метода, который формирует результат “можно ли идти гулять” использовать генерирование случайного возраста
    с помощью метода “generateRandomAge”
*/
    public static void main(String[] args) {
        System.out.println("Можно идти гулять ");
        System.out.println(generateRandomAge());
    }
    public static int generateRandomAge () {
        Random random2 = new Random();
        int age = random2.nextInt(119)+1;
        return age;



    }
}

