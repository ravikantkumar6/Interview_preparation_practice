package com.coinchange;

import java.util.Arrays;

public class CoinChangeProblemMain {

    public static void main(String[] args) {
        int[] coins = {1, 2, 5, 10, 50, 100, 500, 1000};
        int amount = 2758;
        System.out.println("Coins available: " + Arrays.toString(coins));
        System.out.println("Target amount: " + amount);
        CoinChangeProblem.coinChangeProblem(coins, amount);
    }
}
