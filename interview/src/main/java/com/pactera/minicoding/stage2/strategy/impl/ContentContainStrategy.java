package com.pactera.minicoding.stage2.strategy.impl;

/**
 * @ClassName ContentContainStrategy
 * @Description  provide matching strategy according to whether the number contain the keyNumber
 * @Author Elson.Lai
 * @Date 19-6-17 10:11 PM
 * @ModifyDate 19-6-17 11:09 PM
 * @Version 1.0
 */
public class ContentContainStrategy extends AbstractPupilBuildStrategy {

    private int keyNumber;

    /**
     * this is the constructor of ContentContainStrategy
     * @param keyNumber input parameter
     */
    public ContentContainStrategy(int keyNumber) {
        this.keyNumber = keyNumber;
    }

    /**
     * if the number contain the keyNumber, this function return true and otherwise return false
     * @param number input parameter belong to int type
     * @return matching result which is a boolean variable
     */
    @Override
    public boolean isMatch(int number) {
        return String.valueOf(number).contains(String.valueOf(keyNumber));
    }
}
