package com.ironhack.w1.d3;

public class Main {
    public static void main(String[] args) {
        Movie harryPotter = new Movie("Harry Potter", 120);
        Movie lotr = new Movie("Lord of the Rings", 300);
        Movie madMax = new Movie("Mad Max");

        System.out.println(harryPotter.getTitle() + " " + harryPotter.getDuration());
        harryPotter.setDuration(90);
        System.out.println(harryPotter.getDuration());
        System.out.println(lotr.getTitle());
        System.out.println(harryPotter);
        System.out.println(lotr);
        System.out.println(madMax);
        System.out.println(harryPotter.IS_GOOD);
        harryPotter.play();
        lotr.play();
        Movie.displayAlert();

        HorrorMovie scream = new HorrorMovie("Scream", 80, false);
        System.out.println(scream.getTitle() + " " + scream.getDuration() + " " + scream.isReallyScary());
        scream.play();
    }
}
