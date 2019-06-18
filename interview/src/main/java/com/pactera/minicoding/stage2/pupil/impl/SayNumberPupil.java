package com.pactera.minicoding.stage2.pupil.impl;

import com.pactera.minicoding.stage2.pupil.Pupil;

/**
 * @ClassName SayNumberPupil
 * @Description this class belong to pupil who can directly say the number
 * @Author Elson.Lai
 * @Date 19-6-17 11:10 AM
 * @ModifyDate 19-6-17 11:10 AM
 * @Version 1.0
 */
public class SayNumberPupil implements Pupil {

    /**
     * this pupil say the number directly
     * @param number input parameter belong to int type
     * @return number of String type
     */
    public String say(int number) {
        return String.valueOf(number);
    }

}