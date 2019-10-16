package com.pzombade;

import com.pzombade.utils.Utils;

public class Main {

    public static void main(String[] args) {
        int num = Utils.getRandomNumber();
	    System.out.println("Hello Git from Intellij! Random number is "+num);

	    int bound = 5;
        num = Utils.getRandomNumber(bound);
        System.out.println("Bound lower than "+bound + " is "+num);
    }
}
