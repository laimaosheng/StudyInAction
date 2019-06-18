package com.pactera.minicoding.stage2.pupil.impl;

import com.pactera.minicoding.stage2.pupil.Pupil;
import com.pactera.minicoding.stage2.strategy.impl.AbstractPupilBuildStrategy;
import com.pactera.minicoding.stage2.strategy.impl.ContentContainStrategy;
import com.pactera.minicoding.stage2.strategy.impl.DividerStrategy;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Pupils
 * @Description create related kinds of pupil
 * @Author Elson.Lai
 * @Date 19-6-17 8:35 AM
 * @ModifyDate 19-6-17 8:35 AM
 * @Version 1.0
 */
public class Pupils {

    /**
     * create the SayNumberPupil instance
     * @return sayNumberPupil
     */
    public static Pupil sayNumber() {
        return new SayNumberPupil();
    }

    /**
     * create the ConcatNumberPupil instance
     * @param pupilArray pupil
     * @return ConcatNumberPupil
     */
    public static ConcatNumberPupil concat(Pupil... pupilArray) {
        List<Pupil> pupils = new ArrayList<>(pupilArray.length);
        for (Pupil pupil : pupilArray) {
            pupils.add(pupil);
        }
        return new ConcatNumberPupil(pupils);
    }

    /**
     * create the OrPupil instance
     * @param pupilArray OrPupil
     * @return OrPupil
     */
    public static OrPupil or(Pupil... pupilArray) {
        List<Pupil> pupils = new ArrayList<>(pupilArray.length);
        for (Pupil pupil : pupilArray) {
            pupils.add(pupil);
        }
        return new OrPupil(pupils);
    }

    /**
     * create the DividerStrategy instance
     * @param divisor  divisor
     * @param reminder reminder
     * @return DividerStrategy
     */
    public static DividerStrategy mod(int divisor, int reminder) {
        return new DividerStrategy(divisor, reminder);
    }

    /**
     * create the ContentContainStrategy instance
     * @param matchNumber the number which is needed to match the rule
     * @return ContentContainStrategy
     */
    public static AbstractPupilBuildStrategy contains(int matchNumber) {
        return new ContentContainStrategy(matchNumber);
    }

}
