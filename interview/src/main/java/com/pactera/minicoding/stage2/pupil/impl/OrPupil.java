package com.pactera.minicoding.stage2.pupil.impl;

import com.pactera.minicoding.stage2.pupil.Pupil;
import java.util.List;

/**
 * @ClassName OrPupil
 * @Description this class belong to pupil who can or other pupil
 * @Author Elson.Lai
 * @Date 19-6-17 9:05 AM
 * @ModifyDate 19-6-17 9:05 AM
 * @Version 1.0
 */
public class OrPupil implements Pupil {

    private List<Pupil> pupils;

    /**
     * the constructor of OrPupil
     * @param pupils pupil list
     */
    public OrPupil(List<Pupil> pupils) {
        this.pupils = pupils;
    }

    /**
     * this pupil say the number
     * @param number input parameter belong to int type
     * @return instead word as string type or null
     */
    @Override
    public String say(int number) {
        for (Pupil pupil : pupils) {
            String content = pupil.say(number);
            if (content != null) {
                return content;
            }
        }
        return null;
    }

    /**
     * or the other pupil
     * @param pupil input parameter is a pupil
     * @return OrPupil object
     */
    public OrPupil or(Pupil pupil) {
        pupils.add(pupil);
        return this;
    }

}
