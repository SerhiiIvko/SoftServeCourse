package com.softserve.ivko;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class ConsoleReaderTest {

    @Test
    public void getTriangleFromConsoleWhenParametersCorrect() {

        //GIVEN
        List<Triangle> triangles = new ArrayList<>();
        String expectedName = "tr1";
        double expectedSideA = 4;
        double expectedSideB = 5;
        double expectedSideC = 6;
        int expectedListSize = 1;
        String actualName;
        double actualSideA;
        double actualSideB;
        double actualSideC;
        int actualListSize;
        Triangle triangle = new Triangle(expectedName, expectedSideA, expectedSideB, expectedSideC);

        //WHEN
        triangles.add(triangle);
        actualListSize = triangles.size();
        actualName = triangles.get(0).getName();
        actualSideA = triangles.get(0).getSideA();
        actualSideB = triangles.get(0).getSideB();
        actualSideC = triangles.get(0).getSideC();

        //THEN
        assertEquals(expectedListSize, actualListSize);
        assertEquals(expectedName, actualName);
        assertEquals(expectedSideA, actualSideA, 0.001);
        assertEquals(expectedSideB, actualSideB, 0.001);
        assertEquals(expectedSideC, actualSideC, 0.001);
    }

    @Test
    public void getTriangleFromConsoleWhenParametersIncorrect() {
//        Mockito
//        Scanner mockScanner = mock(Scanner.class);
        //set up the scanner
//        when(mockScanner.nextLine()).thenReturn("add 5");
        ConsoleReader reader = new ConsoleReader();
        reader.getTriangleFromConsole();
//        InputOutput inputOutput = new InputOutput(mockScanner);

        //assert output
//        assertEquals("add 5", inputOutput.getInput());

        //added bonus - you can verify that your scanner's nextline() method is
        //actually called See Mockito.verify
//        verify(mockScanner).nextLine();
//        //GIVEN
//        List<Triangle> triangles = new ArrayList<>();
//        String expectedName = "tr1";
//        double expectedSideA = -4;
//        double expectedSideB = 5;
//        double expectedSideC = -6;
//        int expectedListSize = 1;
//        String actualName;
//        double actualSideA;
//        double actualSideB;
//        double actualSideC;
//        int actualListSize;
//        Triangle triangle = new Triangle(expectedName, expectedSideA, expectedSideB, expectedSideC);
//
//        //WHEN
//        triangles.add(triangle);
//        actualListSize = triangles.size();
//        actualName = triangles.get(0).getName();
//        actualSideA = triangles.get(0).getSideA();
//        actualSideB = triangles.get(0).getSideB();
//        actualSideC = triangles.get(0).getSideC();
//
//        //THEN
//        Assert.assertEquals(expectedListSize, actualListSize);
//        Assert.assertEquals(expectedName, actualName);
//        Assert.assertEquals(expectedSideA, actualSideA, 0.001);
//        Assert.assertEquals(expectedSideB, actualSideB, 0.001);
//        Assert.assertEquals(expectedSideC, actualSideC, 0.001);
    }

}