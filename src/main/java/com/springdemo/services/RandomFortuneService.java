package com.springdemo.services;

import com.springdemo.interfaces.FortuneService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class RandomFortuneService implements FortuneService {

    private ArrayList<String> fortunes = new ArrayList<>(Arrays.asList("something is waiting in a bushes of love", "Its just out of touch", "I see only Rats", "gulasz ognisty!"));



    @Override
    public String getFortune() {
        Random rand = new Random();
        int destiny = rand.nextInt(fortunes.size());

        return  fortunes.get(destiny);
    }
}
