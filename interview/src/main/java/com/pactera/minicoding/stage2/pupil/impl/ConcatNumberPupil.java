package com.pactera.minicoding.stage2.pupil.impl;

import com.pactera.minicoding.stage2.pupil.Pupil;

import java.util.List;

/**
 * @ClassName ConcatNumberPupil
 * @Description this class belong to pupil who should concat what the other pupil say
 * @Author Elson.Lai
 * @Date 19-6-17 9:02 AM
 * @ModifyDate 19-6-17 9:02 AM
 * @Version 1.0
 */
public class ConcatNumberPupil implements Pupil {

    private List<Pupil> pupils;

    /**
     * the constructor of ConcatNumberPupil
     * @param pupils a kind of pupil list
     */
    public ConcatNumberPupil(List<Pupil> pupils) {
        this.pupils = pupils;
    }

    /**
     * To concat what the other pupil say
     * @param number input parameter belong to int type
     * @return instead word as string type or null
     */
    public String say(int number) {
        StringBuilder result = new StringBuilder();
        for (Pupil pupil : pupils) {
            String content = pupil.say(number);
            if (content != null) {
                result.append(content);
            }
        }
        if (result.length() > 0) {
            return result.toString();
        } else {
            return null;
        }
    }

}
