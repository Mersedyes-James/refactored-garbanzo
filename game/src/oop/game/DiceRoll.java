package oop.game;

import java.util.Scanner;

public class DiceRoll {
    public static void main(String[] args) {
        customDi();
    }

    public static void customDi() {
        int min = 1;
        int range = 20;
        int rand = (int) (Math.random() * range) + min;
        System.out.printf("Rolled a %d%n", rand);
    }
}
