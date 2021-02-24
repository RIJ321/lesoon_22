package com.company;

import java.util.Random;

public class Main {


    public static void main(String[] args) {
        conditions(generateRandomAge(), 12);
        conditions(generateRandomAge(), 23);
        conditions(generateRandomAge(), 14);
        conditions(generateRandomAge(), 1);
        conditions(generateRandomAge(), 2);
    }

    public static String conditions(int age, int temperature) {
        String result = "Возраст " + age + "Температура " + temperature;
        System.out.println(result);
        if (age > 20 && age < 45 && temperature > -20 && temperature < 45) {
            System.out.println("Можно идти гулять!");
        } else if (age < 20 && temperature > 0 && temperature < 28) {
            System.out.println("Можно идти гулять!");
        } else if (age > 45 && temperature > -20 && temperature < 30) {
            System.out.println("Можно идти гулять!");
        } else System.out.println("Оставайтесь дома!");

        return result;
    }

    public static int generateRandomAge() {
        Random random = new Random();
        int max = 100;
        return random.nextInt(max);
    }

}

