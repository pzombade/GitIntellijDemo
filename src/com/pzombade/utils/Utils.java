package com.pzombade.utils;

import java.util.Random;

public class Utils {

    private static int defaultBound = 10;
    public static int getRandomNumber(){
        return new Random().nextInt(defaultBound);
    }

    public static int getRandomNumber(int bound) {
        return new Random().nextInt(bound);
    }
}
