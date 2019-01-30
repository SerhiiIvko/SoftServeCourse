package com.softserve.ivko;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class ShapeMediator {

    String collectSortedTrianglesToString() throws IllegalArgumentException {
        ShapeMediator mediator = new ShapeMediator();
        List<Triangle> triangles = mediator.getSortedList();
        ConsoleMessages.printMessage(ConsoleMessages.OUTPUT_LIST_PATTERN_MESSAGE);
        return IntStream.range(0, triangles.size())
                .mapToObj(i -> (i + 1) + ". " + triangles.get(i) + "\n")
                .collect(Collectors.joining());
    }

    private List<Triangle> getSortedList() throws IllegalArgumentException {
        TriangleSorter sorter = new TriangleSorter();
        List<Triangle> unsortedList = getTrianglesFromReader();
        return sorter.sortTriangles(unsortedList);
    }

    private List<Triangle> getTrianglesFromReader() throws IllegalArgumentException {
        ConsoleReader reader = new ConsoleReader();
        return reader.getTriangleFromConsole();
    }
}