package com.pactera.minicoding.stage2.pupil.impl;

import com.pactera.minicoding.stage2.pupil.Pupil;
import com.pactera.minicoding.stage2.strategy.Strategy;

/**
 * @ClassName SayFizzBuzzPupil
 * @Description this class belong to pupil who should say Fizz Buzz content instead of the number
 * @Author Elson.Lai
 * @Date 19-6-18 8:05 PM
 * @ModifyDate 19-6-18 8:05 PM
 * @Version 1.0
 */
public class SayFizzBuzzPupil implements Pupil {

    private Strategy strategy;

    private final String insteadWord;

    /**
     * the constructor of ContentContainStrategy
     * @param strategy Strategy type parameter
     * @param insteadWord String type parameter
     */
    public SayFizzBuzzPupil(Strategy strategy, String insteadWord) {
        this.strategy = strategy;
        this.insteadWord = insteadWord;
    }

    /**
     * get the instead word
     * @return instead word as string type
     */
    public String getInsteadWord() {
        return insteadWord;
    }

    /**
     * if number match the strategy, say the instead word
     * @param number input parameter belong to int type
     * @return instead word as string type or null
     */
    @Override
    public String say(int number) {
        if (strategy.isMatch(number)) {
            return getInsteadWord();
        } else {
            return null;
        }
    }
}
