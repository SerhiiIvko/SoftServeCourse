package com.softserve.ivko;

import org.junit.Assert;
import org.junit.Test;

public class TriangleTest {

    @Test
    public void getArea() {

        //GIVEN
        String name = "tr1";
        double sideA = 4;
        double sideB = 5;
        double sideC = 6;
        double expectedArea = 9.92;
        double actualArea;
        Triangle triangle = new Triangle(name, sideA, sideB, sideC);

        //WHEN
        actualArea = triangle.getArea();

        //THEN
        Assert.assertEquals(expectedArea, actualArea, 0.01);
    }
}