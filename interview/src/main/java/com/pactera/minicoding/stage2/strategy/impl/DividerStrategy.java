package com.pactera.minicoding.stage2.strategy.impl;

/**
 * @ClassName ContentContainStrategy
 * @Description  provide matching strategy according to whether remainder equals zero
 * @Author Elson.Lai
 * @Date 19-6-17 11:14 PM
 * @ModifyDate 19-6-17 11:18 PM
 * @Version 1.0
 */
public class DividerStrategy extends AbstractPupilBuildStrategy {

    private int divisor;

    private int remainder;

    /**
     * this is the constructor of ContentContainStrategy
     * @param divisor the first input
     * @param remainder the second input
     */
    public DividerStrategy(int divisor, int remainder) {
        this.divisor = divisor;
        this.remainder = remainder;
    }

    /**
     * if the number contain the keyNumber, this function return true and otherwise return false
     * @param number input parameter belong to int type
     * @return matching result which is a boolean variable
     */
    @Override
    public boolean isMatch(int number) {
        return number % divisor == remainder;
    }

    /**
     * if current remainder equals input parameter, this function return self, and otherwise return null
     * @param remainder input parameter belong to int type
     * @return AbstractPupilBuildStrategy object
     */
    public AbstractPupilBuildStrategy is(int remainder) {
        return this.remainder == remainder ? this : null;
    }
}
