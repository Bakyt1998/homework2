package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println(multiply(generateRandomAge(), 70));
        System.out.println(multiply(50, 65));
        System.out.println(multiply(6, 7));
        System.out.println(multiply(70, 77));
        System.out.println(multiply(75, 79));


    }

    public static String multiply(int age, int temp) {
        if (20 < age && age < 45 && -20 < temp && temp > 30)
            return "можно идти гулять1";
        else if (20 > age && 0 < temp && temp < 28)
            return "можно идти гулять2";
        else if (45 < age && -10 < temp && temp < 25)
            return "можно идти гулять3";
        else return "оставайтесь дома";
    }

    public static int generateRandomAge(){
        Random random = new Random();
        return random.nextInt(100);
    }


}

