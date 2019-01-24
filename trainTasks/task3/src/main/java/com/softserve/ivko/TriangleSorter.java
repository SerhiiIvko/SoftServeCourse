package com.softserve.ivko;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TriangleSorter implements IShapeManager{

    public List<Triangle> sortTriangles(List<Triangle> triangleList) {
        if (triangleList != null) {
            triangleList = triangleList.stream()
                    .sorted(Comparator.comparingDouble(Triangle::getArea).reversed())
                    .collect(Collectors.toList());
        }
        return triangleList;
    }
}