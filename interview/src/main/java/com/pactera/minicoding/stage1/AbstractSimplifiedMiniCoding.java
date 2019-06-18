package com.pactera.minicoding.stage1;

import java.util.function.Function;

/**
 * @ClassName AbstractSimplifiedMiniCoding
 * @Description  this is only simplified version of stage1 in order to
 *               test the core algorithm and print the sample output of stage1
 * @Author Elson.lai
 * @Date 19-6-17 11:06 PM
 * @ModifyDate 19-6-17 11:06 PM
 * @Version 1.0
 */
public abstract class AbstractSimplifiedMiniCoding<T, R> {

    private T t;

    /**
     * this is the constructor of AbstractSimplifiedMiniCoding
     * @param t input parameter is a kind of list whose elements belong to Integer type
     */
    public AbstractSimplifiedMiniCoding(T t) {
        this.t = t;
    }

    /**
     * process the input parameter and return the output parameter by the FunctionInterface
     * @param transformer is a kind of Function which can transform the input param into special output
     * @return R is result which belong to generic
     */
    public R process(Function<T, R> transformer) {
        return transformer.apply(t);
    }

}