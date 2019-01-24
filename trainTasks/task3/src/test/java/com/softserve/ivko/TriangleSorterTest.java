package com.softserve.ivko;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TriangleSorterTest {

    @Test
    public void sortTrianglesWhenInputListNotNull() {

        //GIVEN:
        TriangleSorter sorter = new TriangleSorter();
        List<Triangle> nonSortedList = new ArrayList<>();
        String expectedName1 = "tr1";
        double expectedSideA1 = 7;
        double expectedSideB1 = 8;
        double expectedSideC1 = 9;

        String expectedName2 = "tr2";
        double expectedSideA2 = 40;
        double expectedSideB2 = 50;
        double expectedSideC2 = 60;

        String expectedName3 = "tr3";
        double expectedSideA3 = 4;
        double expectedSideB3 = 5;
        double expectedSideC3 = 6;

        int expectedListSize = 3;
        int actualListSize;

        Triangle triangle1 = new Triangle(expectedName1, expectedSideA1, expectedSideB1, expectedSideC1);
        Triangle triangle2 = new Triangle(expectedName2, expectedSideA2, expectedSideB2, expectedSideC2);
        Triangle triangle3 = new Triangle(expectedName3, expectedSideA3, expectedSideB3, expectedSideC3);
        nonSortedList.add(triangle1);
        nonSortedList.add(triangle2);
        nonSortedList.add(triangle3);

        //WHEN:
        List<Triangle> sortedList = sorter.sortTriangles(nonSortedList);
        actualListSize = nonSortedList.size();

        //THEN:
        Assert.assertEquals(expectedListSize, actualListSize);
        Assert.assertEquals(sortedList.get(0).getName(), nonSortedList.get(2).getName());
        Assert.assertEquals(sortedList.get(1).getName(), nonSortedList.get(0).getName());
        Assert.assertEquals(sortedList.get(2).getName(), nonSortedList.get(1).getName());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void sortTrianglesWhenInputListIsEmpty() {

        //GIVEN:
        TriangleSorter sorter = new TriangleSorter();
        List<Triangle> nonSortedList = new ArrayList<>();
        Triangle triangle;

        //WHEN:
        List<Triangle> sortedList = sorter.sortTriangles(nonSortedList);

        //THEN:
        triangle = sortedList.get(0);
    }
}