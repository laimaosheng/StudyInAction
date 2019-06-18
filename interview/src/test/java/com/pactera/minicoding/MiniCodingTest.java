package com.pactera.minicoding;

import com.pactera.minicoding.stage1.SimplifiedMiniCoding;
import com.pactera.minicoding.stage2.PupilQueue;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

import static com.pactera.minicoding.stage2.pupil.impl.Pupils.contains;
import static com.pactera.minicoding.stage2.pupil.impl.Pupils.or;
import static com.pactera.minicoding.stage2.pupil.impl.Pupils.concat;
import static com.pactera.minicoding.stage2.pupil.impl.Pupils.mod;
import static com.pactera.minicoding.stage2.pupil.impl.Pupils.sayNumber;

/**
 * @ClassName MiniCodingTest
 * @Description do the unit test for stage1 or stage2
 * @Author Elson.Lai
 * @Date 19-6-18 8:03 PM
 * @ModifyDate 19-6-18 8:03 PM
 * @Version 1.0
 */
public class MiniCodingTest {

    private static List<Integer> numbers = null;
    private static ByteArrayOutputStream outputStream = null;
    private static final String separator="\n";

    @BeforeClass
    public static void setUpBeforeClass() {
        numbers = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            numbers.add(i);
        }

        outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
    }

    @AfterClass
    public static void tearDownAfterClass() throws IOException {
        numbers.clear();
        outputStream.close();
        System.setOut(System.out);
    }

    @Test
    public void testOnlySampleOutputForStage1() {
        SimplifiedMiniCoding miniCoding = new SimplifiedMiniCoding(numbers);
        List<String> output = miniCoding.process(arrayList -> {
            List<String> results = new ArrayList<>();
            for (Integer num : arrayList) {
                if (num % 3 == 0 && num % 5 == 0) {
                    results.add("FizzBuzz");
                } else if (num % 3 == 0) {
                    results.add("Fizz");
                } else if (num % 5 == 0) {
                    results.add("Buzz");
                } else {
                    results.add(num.toString());
                }
            }
            return results;
        });

        output.forEach(e -> {
            System.out.println(e);
        });

        assertThat(outputStream.toString(), is(getStage1ExpectedResult()));
    }

    @Test
    public void testStage2() {
        outputStream.reset();
        PupilQueue pupilQueue =PupilQueue.Builder.custom(separator)
                .setPupil(
                        or(
                                concat(
                                        mod(3, 0).is(0).thenReturn("Fizz"),
                                        mod(5, 0).is(0).thenReturn("Buzz")
                                )
                        )
                                .or(contains(3).thenReturn("Fizz"))
                                .or(contains(5).thenReturn("Buzz"))
                                .or(sayNumber())
                )
                .setStartNumber(1).setEndNumber(100).build();
        System.out.print(pupilQueue.say());
        assertThat(outputStream.toString(), is(getStage2ExpectedResult()));
    }

    private String getStage1ExpectedResult() {
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append("1\n").append("2\n").append("Fizz\n").append("4\n")
                .append("Buzz\n").append("Fizz\n").append("7\n").append("8\n")
                .append("Fizz\n").append("Buzz\n").append("11\n").append("Fizz\n")
                .append("13\n").append("14\n").append("FizzBuzz\n").append("16\n")
                .append("17\n").append("Fizz\n").append("19\n").append("Buzz\n")
                .append("Fizz\n").append("22\n").append("23\n").append("Fizz\n")
                .append("Buzz\n").append("26\n").append("Fizz\n").append("28\n")
                .append("29\n").append("FizzBuzz\n").append("31\n").append("32\n")
                .append("Fizz\n").append("34\n").append("Buzz\n").append("Fizz\n")
                .append("37\n").append("38\n").append("Fizz\n").append("Buzz\n")
                .append("41\n").append("Fizz\n").append("43\n").append("44\n")
                .append("FizzBuzz\n").append("46\n").append("47\n").append("Fizz\n")
                .append("49\n").append("Buzz\n").append("Fizz\n").append("52\n")
                .append("53\n").append("Fizz\n").append("Buzz\n").append("56\n")
                .append("Fizz\n").append("58\n").append("59\n").append("FizzBuzz\n")
                .append("61\n").append("62\n").append("Fizz\n").append("64\n")
                .append("Buzz\n").append("Fizz\n").append("67\n").append("68\n")
                .append("Fizz\n").append("Buzz\n").append("71\n").append("Fizz\n")
                .append("73\n").append("74\n").append("FizzBuzz\n").append("76\n")
                .append("77\n").append("Fizz\n").append("79\n").append("Buzz\n")
                .append("Fizz\n").append("82\n").append("83\n").append("Fizz\n")
                .append("Buzz\n").append("86\n").append("Fizz\n").append("88\n")
                .append("89\n").append("FizzBuzz\n").append("91\n").append("92\n")
                .append("Fizz\n").append("94\n").append("Buzz\n").append("Fizz\n")
                .append("97\n").append("98\n").append("Fizz\n").append("Buzz\n");
        return stringBuilder.toString();
    }

    private String getStage2ExpectedResult() {
        StringBuilder stringBuilder=new StringBuilder();
         stringBuilder.append("1\n").append("2\n").append("Fizz\n")
        .append("4\n").append("Buzz\n").append("Fizz\n")
        .append("7\n").append("8\n").append("Fizz\n")
        .append("Buzz\n").append("11\n").append("Fizz\n")
        .append("Fizz\n").append("14\n").append("FizzBuzz\n")
        .append("16\n").append("17\n").append("Fizz\n")
        .append("19\n").append("Buzz\n").append("Fizz\n")
        .append("22\n").append("Fizz\n").append("Fizz\n")
        .append("Buzz\n").append("26\n").append("Fizz\n")
        .append("28\n").append("29\n").append("FizzBuzz\n")
        .append("Fizz\n").append("Fizz\n").append("Fizz\n")
        .append("Fizz\n").append("Buzz\n").append("Fizz\n")
        .append("Fizz\n").append("Fizz\n").append("Fizz\n")
        .append("Buzz\n").append("41\n").append("Fizz\n")
        .append("Fizz\n").append("44\n").append("FizzBuzz\n")
        .append("46\n").append("47\n").append("Fizz\n")
        .append("49\n").append("Buzz\n").append("Fizz\n")
        .append("Buzz\n").append("Fizz\n").append("Fizz\n")
        .append("Buzz\n").append("Buzz\n").append("Fizz\n")
        .append("Buzz\n").append("Buzz\n").append("FizzBuzz\n")
        .append("61\n").append("62\n").append("Fizz\n")
        .append("64\n").append("Buzz\n").append("Fizz\n")
        .append("67\n").append("68\n").append("Fizz\n")
        .append("Buzz\n").append("71\n").append("Fizz\n")
        .append("Fizz\n").append("74\n").append("FizzBuzz\n")
        .append("76\n").append("77\n").append("Fizz\n")
        .append("79\n").append("Buzz\n").append("Fizz\n")
        .append("82\n").append("Fizz\n").append("Fizz\n")
        .append("Buzz\n").append("86\n").append("Fizz\n")
        .append("88\n").append("89\n").append("FizzBuzz\n")
        .append("91\n").append("92\n").append("Fizz\n")
        .append("94\n").append("Buzz\n").append("Fizz\n")
        .append("97\n").append("98\n").append("Fizz\n")
        .append("Buzz\n");
        return stringBuilder.toString();
    }

}
