package com.ironhack.w1.d4;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {

//        ABSTRACT CLASSES & INTERFACES

        WebPlayer webPlayer = new WebPlayer(0.5, 1);
        ApplePlayer applePlayer = new ApplePlayer(0.2, 2);
//        Player player = new Player(0.3, 3);  // we cannot create an instance of an abstact class

        System.out.println("Web Player volume: " + webPlayer.getVolume());
        webPlayer.close();
        applePlayer.close();
        applePlayer.play();
        System.out.println(applePlayer.getVolume());
        applePlayer.increaseVolume();
        System.out.println(applePlayer.getVolume());

        AndroidPlayer androidPlayer = new AndroidPlayer(0.7, 5);

        androidPlayer.play();
        androidPlayer.increaseVolume();
        androidPlayer.increaseVolume();
        androidPlayer.increaseVolume();
        androidPlayer.increaseVolume();
        androidPlayer.increaseVolume();
        androidPlayer.increaseVolume();
        System.out.println(androidPlayer.getVolume());
        System.out.println(androidPlayer.share());


//        BIG DECIMAL

        System.out.println(1.2 - 1.0);

        BigDecimal bd1 = new BigDecimal("10.2644654698419198");
        BigDecimal bd2 = new BigDecimal("5.9797987");

        System.out.println(bd1.subtract(bd2));
        System.out.println(bd1.add(bd2));
        System.out.println(bd1.multiply(bd2));
        System.out.println(bd1.divide(bd2, RoundingMode.HALF_EVEN));
        System.out.println(bd1.setScale(2, RoundingMode.HALF_EVEN));
        System.out.println(bd1.compareTo(bd2));

        if (bd1.compareTo(bd2) > 0) System.out.println("bd1 is greater than bd2");
        else if (bd1.compareTo(bd2) < 0) System.out.println("bd1 is less than bd2");
        else if (bd1.compareTo(bd2) == 0) System.out.println("bd1 is equal to bd2");
    }
}
