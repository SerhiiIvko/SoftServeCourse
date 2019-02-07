package com.softserve.ivko;

import org.junit.Assert;
import org.junit.Test;

public class ParamsHandlerTest {

    @Test
    public void getParamsWhenArgsContainTwoParams() {
        //GIVEN:
        ParamsHandler reader = new ParamsHandler();
        String[] args = new String[]{"-D ", "trainTasks/task4/src/main/resources/README.txt", "-D ", "Вывести"};

        //WHEN:
        args = reader.handleParams(args);

        //THEN:
        Assert.assertEquals(args.length, 2);
    }

    @Test
    public void getParamsWhenArgsContainThreeParams() {
        //GIVEN:
        ParamsHandler reader = new ParamsHandler();
        String[] args = new String[]{"-D ", "trainTasks/task4/src/main/resources/README.txt", "-D ", "Вывести", "-D", "foo"};

        //WHEN:
        args = reader.handleParams(args);

        //THEN:
        Assert.assertEquals(args.length, 3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void getParamsWhenArgsNotContainParams() {
        //GIVEN:
        ParamsHandler reader = new ParamsHandler();
        String[] args = new String[]{" "};

        //WHEN:
        args = reader.handleParams(args);

        //THEN:
        Assert.assertEquals(args.length, 1);
    }

    @Test
    public void getParamsWhenArgsNoContainParams() {
        //GIVEN:
        ParamsHandler reader = new ParamsHandler();
        String[] args = new String[0];

        //WHEN:
        args = reader.handleParams(args);

        //THEN:
        Assert.assertEquals(args.length, 0);
    }
}