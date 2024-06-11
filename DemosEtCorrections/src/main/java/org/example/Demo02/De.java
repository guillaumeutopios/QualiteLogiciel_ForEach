package org.example.Demo02;

import java.util.Random;

public class De implements IDe {
    public int lancer(){
        Random random = new Random();
        return random.nextInt(20)+1;
    }
}
