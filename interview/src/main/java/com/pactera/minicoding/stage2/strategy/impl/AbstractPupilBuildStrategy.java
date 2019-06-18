package com.pactera.minicoding.stage2.strategy.impl;

import com.pactera.minicoding.stage2.pupil.impl.SayFizzBuzzPupil;
import com.pactera.minicoding.stage2.strategy.Strategy;

/**
 * @ClassName AbstractPupilBuildStrategy
 * @Description provide function which can return SayFizzBuzzPupil according to the related concrete strategy
 * which inherit  AbstractPupilBuildStrategy
 * @Author Elson.Lai
 * @Date 19-6-18 8:03 PM
 * @ModifyDate 19-6-18 8:03 PM
 * @Version 1.0
 */
public abstract class AbstractPupilBuildStrategy implements Strategy {

    public SayFizzBuzzPupil thenReturn(String word) {
        return new SayFizzBuzzPupil(this, word);
    }

}
