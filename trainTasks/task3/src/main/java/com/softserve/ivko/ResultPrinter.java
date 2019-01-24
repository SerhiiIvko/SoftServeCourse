package com.softserve.ivko;

import java.util.List;

public class ResultPrinter {

    void getResultOfSortTriangles() {
        ConsoleReader manager = new ConsoleReader();
        List<Triangle> triangleList = manager.getTriangleFromConsole();
        TriangleSorter sorter = new TriangleSorter();
        List<Triangle> triangles = sorter.sortTriangles(triangleList);
        if (triangles != null) {
            ConsoleMessages.printMessage(ConsoleMessages.OUTPUT_LIST_PATTERN_MESSAGE);
            int bound = triangles.size();
            for (int i = 0; i < bound; i++) {
                Triangle triangle = triangles.get(i);
                System.out.println(i + 1 + ". " + triangle);
            }
        } else {
            ConsoleMessages.printMessage(ConsoleMessages.INCORRECT_PARAMETERS);
        }
    }
}