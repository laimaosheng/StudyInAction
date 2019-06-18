package com.pactera.minicoding.stage2.strategy;

/**
 * FileName: Strategy.java
 * define interface for strategy Design Pattern
 * @author Elson.Lai
 * @Date    19-6-17 11:19 PM
 * @version 1.00
 */
public interface Strategy {

     /**
      * if the number match this rule, this function return true and otherwise return false
      * @param number input parameter belong to int type
      * @return matching result which is a boolean variable
      */
     boolean isMatch(int number);

}
