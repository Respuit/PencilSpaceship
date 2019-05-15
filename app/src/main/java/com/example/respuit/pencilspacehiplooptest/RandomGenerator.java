package com.example.respuit.pencilspacehiplooptest;

import java.util.Random;

public class RandomGenerator {
    private Random random;

    public Random getRandom() {
        generateRandom();
        return random;
    }

    private Random generateRandom(){
        random = new Random();
        return random;
    }
}
